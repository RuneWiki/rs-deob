import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class647 extends class345 {
   @OriginalMember(
      owner = "client!sk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9407 = new String[]{method4755(method4754("2`\u001eY\f")), method4755(method4754("2`\u001e^\f")), method4755(method4754("2`\u001e[\f")), method4755(method4754(":%\u001e4Y")), method4755(method4754("/~\\v")), method4755(method4754("2`\u001eX\f")), method4755(method4754("2`\u001e\\\f")), method4755(method4754("2`\u001e]\f")), method4755(method4754("2`\u001e_\f"))};
   @OriginalMember(
      owner = "client!sk",
      name = "n",
      descriptor = "J"
   )
   public static long field9402 = (long)(9.999999999E9D * Math.random());
   @OriginalMember(
      owner = "client!sk",
      name = "q",
      descriptor = "Luw;"
   )
   public static class435 field9399 = new class435(0, 0);
   @OriginalMember(
      owner = "client!sk",
      name = "m",
      descriptor = "I"
   )
   public static int field9398;
   @OriginalMember(
      owner = "client!sk",
      name = "k",
      descriptor = "I"
   )
   public static int field9400;
   @OriginalMember(
      owner = "client!sk",
      name = "o",
      descriptor = "I"
   )
   public static int field9401;
   @OriginalMember(
      owner = "client!sk",
      name = "l",
      descriptor = "I"
   )
   public static int field9403;
   @OriginalMember(
      owner = "client!sk",
      name = "p",
      descriptor = "I"
   )
   public static int field9404;
   @OriginalMember(
      owner = "client!sk",
      name = "j",
      descriptor = "I"
   )
   public static int field9405;
   @OriginalMember(
      owner = "client!sk",
      name = "i",
      descriptor = "Lhw;"
   )
   public static class141 field9406;

   @OriginalMember(
      owner = "client!sk",
      name = "a",
      descriptor = "(Z)I",
      line = 6
   )
   public final int method53(boolean arg0) {
      try {
         if (arg0) {
            this.method53(false);
         }

         ++field9398;
         return 0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9407[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sk",
      name = "b",
      descriptor = "(I)V",
      line = 17
   )
   public final void method51(int arg0) {
      try {
         if (arg0 == 0) {
            ++field9404;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9407[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sk",
      name = "a",
      descriptor = "(II[S)[S",
      line = 28
   )
   public static final short[] method4751(int arg0, int arg1, short[] arg2) {
      try {
         ++field9405;
         short[] var3 = new short[arg0];
         if (arg1 != -29427) {
            method4752(true);
         }

         class365.method2859(arg2, 0, var3, 0, arg0);
         return var3;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field9407[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9407[3] : field9407[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sk",
      name = "<init>",
      descriptor = "(ILob;)V",
      line = 43
   )
   public class647(int arg0, class768 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!sk",
      name = "<init>",
      descriptor = "(Lob;)V",
      line = 47
   )
   public class647(class768 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!sk",
      name = "a",
      descriptor = "(BI)I",
      line = 50
   )
   public final int method52(byte arg0, int arg1) {
      try {
         ++field9401;
         if (arg0 >= -45) {
            this.method52((byte)-110, -122);
         }

         return 1;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field9407[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sk",
      name = "a",
      descriptor = "(IB)V",
      line = 66
   )
   public final void method54(int arg0, byte arg1) {
      try {
         if (arg1 < 99) {
            field9406 = null;
         }

         ++field9403;
         super.field4913 = arg0;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field9407[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sk",
      name = "b",
      descriptor = "(Z)V",
      line = 77
   )
   public static void method4752(boolean arg0) {
      try {
         if (arg0) {
            field9399 = null;
            field9406 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field9407[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sk",
      name = "c",
      descriptor = "(Z)I",
      line = 90
   )
   public final int method4753(boolean arg0) {
      try {
         if (arg0) {
            return 24;
         } else {
            ++field9400;
            return super.field4913;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9407[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4754(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 36);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4755(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 65;
            break;
         case 1:
            var10005 = 11;
            break;
         case 2:
            var10005 = 48;
            break;
         case 3:
            var10005 = 26;
            break;
         default:
            var10005 = 36;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
