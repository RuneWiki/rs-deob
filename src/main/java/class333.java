import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uea")
public class class333 implements class765 {
   @OriginalMember(
      owner = "client!uea",
      name = "e",
      descriptor = "Lwia;"
   )
   public class790 field4763;
   @OriginalMember(
      owner = "client!uea",
      name = "i",
      descriptor = "Lhw;"
   )
   private class141 field4769;
   @OriginalMember(
      owner = "client!uea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4771 = new String[]{method2593(method2592("1M \u000b!l")), method2593(method2592("?\u0006o\u000b\u0015")), method2593(method2592("1M \u000b)l")), method2593(method2592("*]-I")), method2593(method2592("1M \u000bT-F(QVl")), method2593(method2592("1M \u000b/l")), method2593(method2592("1M \u000b+l")), method2593(method2592("1M \u000b*l"))};
   @OriginalMember(
      owner = "client!uea",
      name = "a",
      descriptor = "I"
   )
   public static int field4766 = 0;
   @OriginalMember(
      owner = "client!uea",
      name = "c",
      descriptor = "I"
   )
   public static int field4761;
   @OriginalMember(
      owner = "client!uea",
      name = "h",
      descriptor = "I"
   )
   public static int field4764;
   @OriginalMember(
      owner = "client!uea",
      name = "b",
      descriptor = "I"
   )
   public static int field4767;
   @OriginalMember(
      owner = "client!uea",
      name = "g",
      descriptor = "I"
   )
   public static int field4768;
   @OriginalMember(
      owner = "client!uea",
      name = "f",
      descriptor = "Lhw;"
   )
   public static class141 field4762;
   @OriginalMember(
      owner = "client!uea",
      name = "j",
      descriptor = "Ldfa;"
   )
   public static class173 field4770;
   @OriginalMember(
      owner = "client!uea",
      name = "d",
      descriptor = "Ltd;"
   )
   public class476 field4765;

   @OriginalMember(
      owner = "client!uea",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method2590(int arg0) {
      try {
         field4762 = null;
         field4770 = null;
         int var1 = 95 % ((arg0 - -53) / 63);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4771[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uea",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method59(byte arg0) {
      try {
         int var2 = 126 / ((62 - arg0) / 51);
         ++field4761;
         return this.field4769.method1335((byte)115, this.field4763.field11549);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4771[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uea",
      name = "a",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;II)V"
   )
   public static final void method2591(String arg0, String arg1, int arg2, int arg3) {
      try {
         ++field4767;
         if (arg0.length() <= arg2) {
            if (class352.method2708(99)) {
               class194.method1686(-20370);
               class475.field6939 = arg3;
               class386.field5693 = arg0;
               class741.field10672 = arg1;
               class645.method4735(6, arg2 + -448);
            }
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field4771[2] + (arg0 != null ? field4771[1] : field4771[3]) + ',' + (arg1 != null ? field4771[1] : field4771[3]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uea",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method61(int arg0) {
      try {
         if (arg0 == -15367) {
            ++field4764;
            this.field4765 = class208.method1771(this.field4763.field11549, this.field4769, -97);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4771[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uea",
      name = "a",
      descriptor = "(ZI)V"
   )
   public void method58(boolean arg0, int arg1) {
      try {
         if (arg1 == 9124) {
            ++field4768;
            if (arg0) {
               int var3 = this.field4763.field11547.method4952(this.field4765.method3009(), class140.field2281, true) - -this.field4763.field11546;
               int var4 = this.field4763.field11550.method1060(this.field4765.method3000(), arg1 + -9029, class664.field9661) + this.field4763.field11551;
               this.field4765.method3609(var3, var4);
            }
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field4771[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uea",
      name = "<init>",
      descriptor = "(Lhw;Lwia;)V"
   )
   public class333(class141 arg0, class790 arg1) {
      try {
         this.field4763 = arg1;
         this.field4769 = arg0;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4771[4] + (arg0 != null ? field4771[1] : field4771[3]) + ',' + (arg1 != null ? field4771[1] : field4771[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2592(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 104);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2593(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 68;
            break;
         case 1:
            var10005 = 40;
            break;
         case 2:
            var10005 = 65;
            break;
         case 3:
            var10005 = 37;
            break;
         default:
            var10005 = 104;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
