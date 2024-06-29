import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kka")
public abstract class class326 {
   @OriginalMember(
      owner = "client!kka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4683 = new String[]{method2532(method2531("J\u0010j/\u001f\t")), method2532(method2531("ZU%/'")), method2532(method2531("O\u000egm")), method2532(method2531("J\u0010j/\u001d\t")), method2532(method2531("J\u0010j/\u0019\t")), method2532(method2531("J\u0010j/\u001c\t")), method2532(method2531("J\u0010j/\u001e\t"))};
   @OriginalMember(
      owner = "client!kka",
      name = "a",
      descriptor = "I"
   )
   public static int field4675 = 0;
   @OriginalMember(
      owner = "client!kka",
      name = "g",
      descriptor = "I"
   )
   public int field4676;
   @OriginalMember(
      owner = "client!kka",
      name = "e",
      descriptor = "I"
   )
   public static int field4677;
   @OriginalMember(
      owner = "client!kka",
      name = "b",
      descriptor = "I"
   )
   public static int field4678;
   @OriginalMember(
      owner = "client!kka",
      name = "d",
      descriptor = "I"
   )
   public static int field4679;
   @OriginalMember(
      owner = "client!kka",
      name = "h",
      descriptor = "I"
   )
   public static int field4681;
   @OriginalMember(
      owner = "client!kka",
      name = "c",
      descriptor = "Lria;"
   )
   public static class299 field4680;
   @OriginalMember(
      owner = "client!kka",
      name = "f",
      descriptor = "Ljava/lang/String;"
   )
   public String field4682;

   @OriginalMember(
      owner = "client!kka",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2525(int arg0) {
      try {
         field4680 = null;
         if (arg0 != 0) {
            method2528(52, -6, 33, 93, (class744)null, (class495)null);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4683[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kka",
      name = "b",
      descriptor = "(I)Ljava/net/Socket;"
   )
   public final Socket method2526(int arg0) throws IOException {
      try {
         if (arg0 != 0) {
            return null;
         } else {
            ++field4677;
            return new Socket(this.field4682, this.field4676);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4683[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kka",
      name = "a",
      descriptor = "(B)Ljava/net/Socket;"
   )
   public abstract Socket method2527(byte arg0) throws IOException;

   @OriginalMember(
      owner = "client!kka",
      name = "a",
      descriptor = "(IIIILpca;Lka;)V"
   )
   public static final void method2528(int arg0, int arg1, int arg2, int arg3, class744 arg4, class495 arg5) {
      try {
         if (arg2 != 0) {
            method2529((byte)-42);
         }

         ++field4678;
         if (arg5 != null) {
            arg4.method5397(arg5.method540(), arg5.method517(), arg5.method507(), arg5.method528(), arg0, arg1, arg5.method531(), arg3, arg5.method553(), 124, arg5.method546());
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field4683[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field4683[1] : field4683[2]) + ',' + (arg5 != null ? field4683[1] : field4683[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kka",
      name = "b",
      descriptor = "(B)I"
   )
   public static final int method2529(byte arg0) {
      try {
         ++field4681;
         if (arg0 != -115) {
            field4680 = null;
         }

         return class591.method4366(false, false);
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4683[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kka",
      name = "a",
      descriptor = "(ZLpo;B)V"
   )
   public static final void method2530(boolean arg0, class582 arg1, byte arg2) {
      try {
         class600.field8650.method1560(32, arg1);
         ++field4679;
         int var3 = 90 % ((-67 - arg2) / 48);
         if (arg0) {
            class230.method1907(class421.field6129, class650.field9426, (byte)-127, class273.field3866, arg1, class600.field8650);
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field4683[0] + arg0 + ',' + (arg1 != null ? field4683[1] : field4683[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2531(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 90);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2532(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 33;
            break;
         case 1:
            var10005 = 123;
            break;
         case 2:
            var10005 = 11;
            break;
         case 3:
            var10005 = 1;
            break;
         default:
            var10005 = 90;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
