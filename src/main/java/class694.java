import jaggl.OpenGL;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aga")
public class class694 extends class70 implements class708 {
   @OriginalMember(
      owner = "client!aga",
      name = "A",
      descriptor = "I"
   )
   private int field10430 = -1;
   @OriginalMember(
      owner = "client!aga",
      name = "M",
      descriptor = "I"
   )
   private int field10425 = -1;
   @OriginalMember(
      owner = "client!aga",
      name = "K",
      descriptor = "I"
   )
   public int field10420;
   @OriginalMember(
      owner = "client!aga",
      name = "y",
      descriptor = "I"
   )
   private int field10427;
   @OriginalMember(
      owner = "client!aga",
      name = "D",
      descriptor = "I"
   )
   public int field10435;
   @OriginalMember(
      owner = "client!aga",
      name = "I",
      descriptor = "Lck;"
   )
   private class667 field10423;
   @OriginalMember(
      owner = "client!aga",
      name = "L",
      descriptor = "I"
   )
   private int field10433;
   @OriginalMember(
      owner = "client!aga",
      name = "z",
      descriptor = "I"
   )
   private int field10432;
   @OriginalMember(
      owner = "client!aga",
      name = "N",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10436 = new String[]{method5047(method5046("ZZhhz\u0013")), method5047(method5046("ZZhhQRSh*^AX!")), method5047(method5046("ZZhh}\u0013")), method5047(method5046("ZZhhy\u0013")), method5047(method5046("ZZhh{\u0013")), method5047(method5046("UHe*")), method5047(method5046("@\u0013'hJ")), method5047(method5046("ZZhh\u000bRS`2\t\u0013")), method5047(method5046("ZZhh|\u0013")), method5047(method5046("ZZhhx\u0013")), method5047(method5046("ZZhh~\u0013"))};
   @OriginalMember(
      owner = "client!aga",
      name = "B",
      descriptor = "I"
   )
   public static int field10421;
   @OriginalMember(
      owner = "client!aga",
      name = "x",
      descriptor = "I"
   )
   public static int field10422;
   @OriginalMember(
      owner = "client!aga",
      name = "E",
      descriptor = "I"
   )
   public static int field10424;
   @OriginalMember(
      owner = "client!aga",
      name = "C",
      descriptor = "I"
   )
   public static int field10426;
   @OriginalMember(
      owner = "client!aga",
      name = "F",
      descriptor = "I"
   )
   public static int field10428;
   @OriginalMember(
      owner = "client!aga",
      name = "H",
      descriptor = "I"
   )
   public static int field10429;
   @OriginalMember(
      owner = "client!aga",
      name = "G",
      descriptor = "I"
   )
   public static int field10431;
   @OriginalMember(
      owner = "client!aga",
      name = "J",
      descriptor = "I"
   )
   public static int field10434;

   @OriginalMember(
      owner = "client!aga",
      name = "a",
      descriptor = "(IBI)V"
   )
   public final void method5040(int arg0, byte arg1, int arg2) {
      try {
         if (arg1 == 20) {
            ++field10424;
            OpenGL.glFramebufferRenderbufferEXT(arg2, arg0, 36161, this.field10433);
            this.field10425 = arg2;
            this.field10430 = arg0;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10436[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aga",
      name = "c",
      descriptor = "(B)V"
   )
   public static final void method5041(byte arg0) {
      try {
         if (arg0 == 8) {
            ++class251.field3360;
            ++field10428;
            class180 var1 = class486.method3603(class699.field10488, (byte)-119, class48.field583);
            var1.field2211.method1103(class744.field11043, -55);
            class763.method5527(false, var1);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10436[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aga",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method117(byte arg0) {
      try {
         ++field10431;
         int var2 = 89 % ((26 - arg0) / 55);
         OpenGL.glFramebufferRenderbufferEXT(this.field10425, this.field10430, 36161, 0);
         this.field10425 = -1;
         this.field10430 = -1;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10436[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aga",
      name = "a",
      descriptor = "(Z)I"
   )
   public static final int method5042(boolean arg0) {
      try {
         ++field10426;
         if (!arg0) {
            return 40;
         } else if (class628.field9136 != null) {
            return 3;
         } else {
            return class762.field11199 ? 2 : 1;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10436[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aga",
      name = "f",
      descriptor = "(I)I"
   )
   public static final int method5043(int arg0) {
      try {
         ++field10429;
         if (arg0 > -44) {
            return -127;
         } else if (class750.field11111) {
            return 6;
         } else if (class585.field8681 == null) {
            return 0;
         } else {
            int var1 = class585.field8681.field4333;
            if (class172.method1380(var1, (byte)126)) {
               return 1;
            } else if (class57.method476(true, var1)) {
               return 2;
            } else if (class132.method1129(var1, -63)) {
               return 3;
            } else {
               return class550.method4065(var1, 113) ? 4 : 5;
            }
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10436[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aga",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         this.method5044(-127);
         ++field10422;
         super.finalize();
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10436[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!aga",
      name = "g",
      descriptor = "(I)V"
   )
   public final void method5044(int arg0) {
      try {
         if (~this.field10433 < -1) {
            this.field10423.method4789(70, this.field10432, this.field10433);
            this.field10433 = 0;
         }

         if (arg0 < -62) {
            ++field10421;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10436[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aga",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method5045(byte arg0) throws IOException {
      int var1 = client.field4530;

      try {
         if (class429.field6546 != null && class506.field7477 > 0) {
            class499.field7403.field1590 = 0;

            int var10000;
            int var10001;
            label32: {
               do {
                  class180 var2 = (class180)class290.field4059.method4071((byte)126);
                  if (var2 == null) {
                     break;
                  }

                  var10000 = var2.field2217;
                  var10001 = class499.field7403.field1552.length + -class499.field7403.field1590;
                  if (var1 != 0) {
                     break label32;
                  }

                  if (var10000 > var10001) {
                     break;
                  }

                  class499.field7403.method1059(var2.field2217, -2125022416, var2.field2211.field1552, 0);
                  class506.field7477 -= var2.field2217;
                  var2.method2720(0);
                  var2.field2211.method1055((byte)-101);
                  var2.method1416(-1);
               } while(var1 == 0);

               class429.field6546.method810((byte)-31, class499.field7403.field1590, class499.field7403.field1552, 0);
               var10000 = class498.field7378;
               var10001 = class499.field7403.field1590;
            }

            class498.field7378 = var10000 + var10001;
            class31.field339 = 0;
         }

         ++field10434;
         int var3 = -110 / ((62 - arg0) / 62);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10436[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aga",
      name = "<init>",
      descriptor = "(Lck;III)V"
   )
   public class694(class667 arg0, int arg1, int arg2, int arg3) {
      try {
         this.field10420 = arg2;
         this.field10427 = arg1;
         this.field10435 = arg3;
         this.field10423 = arg0;
         OpenGL.glGenRenderbuffersEXT(1, class555.field8229, 0);
         this.field10433 = class555.field8229[0];
         OpenGL.glBindRenderbufferEXT(36161, this.field10433);
         OpenGL.glRenderbufferStorageEXT(36161, this.field10427, this.field10420, this.field10435);
         this.field10432 = this.field10435 * this.field10420 * this.field10423.method4834(this.field10427, 1000);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field10436[7] + (arg0 != null ? field10436[6] : field10436[5]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aga",
      name = "<init>",
      descriptor = "(Lck;IIII)V"
   )
   public class694(class667 arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         this.field10435 = arg3;
         this.field10420 = arg2;
         this.field10423 = arg0;
         this.field10427 = arg1;
         OpenGL.glGenRenderbuffersEXT(1, class555.field8229, 0);
         this.field10433 = class555.field8229[0];
         OpenGL.glBindRenderbufferEXT(36161, this.field10433);
         OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field10427, this.field10420, this.field10435);
         this.field10432 = this.field10420 * this.field10435 * this.field10423.method4834(this.field10427, 1000);
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field10436[7] + (arg0 != null ? field10436[6] : field10436[5]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5046(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 55);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5047(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 59;
            break;
         case 1:
            var10005 = 61;
            break;
         case 2:
            var10005 = 9;
            break;
         case 3:
            var10005 = 70;
            break;
         default:
            var10005 = 55;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
