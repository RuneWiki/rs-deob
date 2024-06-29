import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class736 extends class345 {
   @OriginalMember(
      owner = "client!ge",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10589 = new String[]{method5303(method5302("\u001bE!GV")), method5303(method5302("\u001bE!@V")), method5303(method5302("\u001bE!CV")), method5303(method5302("\u001bE!EV")), method5303(method5302("\u001bE!BV")), method5303(method5302("\u001bE!FV"))};
   @OriginalMember(
      owner = "client!ge",
      name = "i",
      descriptor = "I"
   )
   public static int field10583;
   @OriginalMember(
      owner = "client!ge",
      name = "j",
      descriptor = "I"
   )
   public static int field10584;
   @OriginalMember(
      owner = "client!ge",
      name = "l",
      descriptor = "I"
   )
   public static int field10585;
   @OriginalMember(
      owner = "client!ge",
      name = "k",
      descriptor = "I"
   )
   public static int field10586;
   @OriginalMember(
      owner = "client!ge",
      name = "m",
      descriptor = "I"
   )
   public static int field10587;
   @OriginalMember(
      owner = "client!ge",
      name = "n",
      descriptor = "I"
   )
   public static int field10588;

   @OriginalMember(
      owner = "client!ge",
      name = "b",
      descriptor = "(Z)I",
      line = 3
   )
   public final int method5300(boolean arg0) {
      try {
         ++field10583;
         return arg0 ? -34 : super.field4913;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10589[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ge",
      name = "<init>",
      descriptor = "(ILob;)V",
      line = 14
   )
   public class736(int arg0, class768 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!ge",
      name = "c",
      descriptor = "(I)V",
      line = 17
   )
   public static final void method5301(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ge",
      name = "b",
      descriptor = "(I)V",
      line = 48
   )
   public final void method51(int arg0) {
      try {
         if (arg0 == 0) {
            if (~super.field4913 != -2 && super.field4913 != 0) {
               super.field4913 = this.method53(false);
            }

            ++field10585;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10589[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ge",
      name = "<init>",
      descriptor = "(Lob;)V",
      line = 62
   )
   public class736(class768 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!ge",
      name = "a",
      descriptor = "(IB)V",
      line = 71
   )
   public final void method54(int arg0, byte arg1) {
      try {
         super.field4913 = arg0;
         ++field10584;
         if (arg1 >= 99) {
            ;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field10589[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ge",
      name = "a",
      descriptor = "(BI)I",
      line = 83
   )
   public final int method52(byte arg0, int arg1) {
      try {
         ++field10588;
         if (arg0 >= -45) {
            method5301(116);
         }

         return 1;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field10589[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ge",
      name = "a",
      descriptor = "(Z)I",
      line = 94
   )
   public final int method53(boolean arg0) {
      try {
         ++field10586;
         return arg0 ? -13 : 1;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10589[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ge",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5302(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 126);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ge",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5303(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 124;
            break;
         case 1:
            var10005 = 32;
            break;
         case 2:
            var10005 = 15;
            break;
         case 3:
            var10005 = 1;
            break;
         default:
            var10005 = 126;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
