import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class721 extends class555 {
   @OriginalMember(
      owner = "client!kb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10568 = new String[]{method5246(method5245("SF\u0016\u0003l")), method5246(method5245("SF\u0016\u0005l")), method5246(method5245("SF\u0016\u0002l")), method5246(method5245("SF\u0016\u0007l")), method5246(method5245("SF\u0016\u0000l")), method5246(method5245("SF\u0016\u0006l")), method5246(method5245("SF\u0016\tl")), method5246(method5245("SF\u0016\u0004l"))};
   @OriginalMember(
      owner = "client!kb",
      name = "m",
      descriptor = "[I"
   )
   public static int[] field10561 = new int[13];
   @OriginalMember(
      owner = "client!kb",
      name = "n",
      descriptor = "[Lwfa;"
   )
   public static class210[] field10558 = new class210[37];
   @OriginalMember(
      owner = "client!kb",
      name = "k",
      descriptor = "Lbga;"
   )
   public static class378 field10562 = new class378(5, -1);
   @OriginalMember(
      owner = "client!kb",
      name = "j",
      descriptor = "I"
   )
   public static int field10557;
   @OriginalMember(
      owner = "client!kb",
      name = "f",
      descriptor = "I"
   )
   public static int field10559;
   @OriginalMember(
      owner = "client!kb",
      name = "l",
      descriptor = "I"
   )
   public static int field10560;
   @OriginalMember(
      owner = "client!kb",
      name = "g",
      descriptor = "I"
   )
   public static int field10563;
   @OriginalMember(
      owner = "client!kb",
      name = "p",
      descriptor = "I"
   )
   public static int field10564;
   @OriginalMember(
      owner = "client!kb",
      name = "h",
      descriptor = "I"
   )
   public static int field10565;
   @OriginalMember(
      owner = "client!kb",
      name = "i",
      descriptor = "I"
   )
   public static int field10566;
   @OriginalMember(
      owner = "client!kb",
      name = "o",
      descriptor = "I"
   )
   public static int field10567;

   @OriginalMember(
      owner = "client!kb",
      name = "<init>",
      descriptor = "(ILfia;)V"
   )
   public class721(int arg0, class605 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!kb",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method5241(byte arg0) {
      try {
         ++field10566;
         if (arg0 != -107) {
            this.method637(-34);
         }

         return !super.field7633.method4414(0);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10568[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kb",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method637(int arg0) {
      try {
         if (super.field7633.method4414(0)) {
            super.field7632 = 0;
         }

         ++field10563;
         if (arg0 == -13712) {
            if (~super.field7632 != -2 && super.field7632 != 0) {
               super.field7632 = this.method635(125);
            }
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10568[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kb",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method633(int arg0, byte arg1) {
      try {
         if (arg1 < 36) {
            this.method633(-39, (byte)-105);
         }

         ++field10565;
         return super.field7633.method4414(0) ? 3 : 1;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field10568[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kb",
      name = "c",
      descriptor = "(B)I"
   )
   public final int method5242(byte arg0) {
      try {
         if (arg0 >= -61) {
            this.method5241((byte)2);
         }

         ++field10560;
         return super.field7632;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10568[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kb",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method5243(int arg0) {
      try {
         field10562 = null;
         field10558 = null;
         int var1 = -29 / ((18 - arg0) / 41);
         field10561 = null;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10568[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kb",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method5244(int arg0) {
      try {
         label20: {
            if (~class468.field6445 < -2) {
               class674.field9907.method4407(class674.field9907.field8459, arg0 + -13496, 4);
               if (!client.field4273) {
                  break label20;
               }
            }

            class674.field9907.method4407(class674.field9907.field8459, -2160, 2);
         }

         ++field10564;
         if (arg0 != 11336) {
            field10567 = -127;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10568[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kb",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method635(int arg0) {
      try {
         ++field10557;
         if (arg0 < 124) {
            field10562 = null;
         }

         return 1;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10568[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kb",
      name = "<init>",
      descriptor = "(Lfia;)V"
   )
   public class721(class605 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!kb",
      name = "b",
      descriptor = "(IB)V"
   )
   public final void method638(int arg0, byte arg1) {
      try {
         super.field7632 = arg0;
         int var3 = -126 / ((arg1 - 12) / 47);
         ++field10559;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field10568[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5245(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 68);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5246(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 56;
            break;
         case 1:
            var10005 = 36;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 65;
            break;
         default:
            var10005 = 68;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
