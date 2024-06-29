import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bia")
public class class745 extends class315 {
   @OriginalMember(
      owner = "client!bia",
      name = "p",
      descriptor = "I"
   )
   private int field10599;
   @OriginalMember(
      owner = "client!bia",
      name = "t",
      descriptor = "I"
   )
   private int field10592;
   @OriginalMember(
      owner = "client!bia",
      name = "l",
      descriptor = "I"
   )
   private int field10600;
   @OriginalMember(
      owner = "client!bia",
      name = "r",
      descriptor = "I"
   )
   private int field10597;
   @OriginalMember(
      owner = "client!bia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10607 = new String[]{method5369(method5368("\u001bKSEjQ")), method5369(method5368("\u0017W^\u0007")), method5369(method5368("\u0002\f\u001cEP")), method5369(method5368("\u001bKSEhQ")), method5369(method5368("\u001bKSEkQ")), method5369(method5368("Yq\bK")), method5369(method5368("\u001bKSEiQ")), method5369(method5368("\u001bKSE\u0011\u0010L[\u001f\u0013Q")), method5369(method5368("\u001bKSEoQ")), method5369(method5368("\u001bKSEnQ")), method5369(method5368("\u001bKSElQ"))};
   @OriginalMember(
      owner = "client!bia",
      name = "q",
      descriptor = "Lhha;"
   )
   public static class724 field10602 = new class724(20, 6);
   @OriginalMember(
      owner = "client!bia",
      name = "i",
      descriptor = "Ldr;"
   )
   public static class242 field10604 = new class242();
   @OriginalMember(
      owner = "client!bia",
      name = "h",
      descriptor = "Ldr;"
   )
   public static class242 field10605 = new class242();
   @OriginalMember(
      owner = "client!bia",
      name = "o",
      descriptor = "[Ldr;"
   )
   public static class242[] field10606 = new class242[]{field10605, field10604};
   @OriginalMember(
      owner = "client!bia",
      name = "s",
      descriptor = "I"
   )
   public static int field10593;
   @OriginalMember(
      owner = "client!bia",
      name = "k",
      descriptor = "I"
   )
   public static int field10594;
   @OriginalMember(
      owner = "client!bia",
      name = "n",
      descriptor = "I"
   )
   public static int field10595;
   @OriginalMember(
      owner = "client!bia",
      name = "v",
      descriptor = "I"
   )
   public static int field10596;
   @OriginalMember(
      owner = "client!bia",
      name = "u",
      descriptor = "I"
   )
   public static int field10598;
   @OriginalMember(
      owner = "client!bia",
      name = "j",
      descriptor = "I"
   )
   public static int field10603;
   @OriginalMember(
      owner = "client!bia",
      name = "m",
      descriptor = "Lfea;"
   )
   public static class82 field10601;

   @OriginalMember(
      owner = "client!bia",
      name = "<init>",
      descriptor = "(IIIIIII)V"
   )
   public class745(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      super(arg4, arg5, arg6);

      try {
         this.field10599 = arg2;
         this.field10592 = arg1;
         this.field10600 = arg3;
         this.field10597 = arg0;
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field10607[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bia",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method1887(int arg0, int arg1, int arg2) {
      try {
         ++field10594;
         int var4 = this.field10597 * arg2 >> 12;
         int var5 = this.field10599 * arg2 >> 12;
         int var6 = this.field10592 * arg1 >> 12;
         int var7 = this.field10600 * arg1 >> 12;
         class102.method1008(arg0 ^ 16621, var7, super.field4717, var5, var6, var4, super.field4715);
         if (arg0 != -1) {
            method5367(51, 36);
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field10607[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bia",
      name = "a",
      descriptor = "(BII)V"
   )
   public final void method1886(byte arg0, int arg1, int arg2) {
      try {
         ++field10595;
         int var4 = this.field10597 * arg1 >> 12;
         int var5 = this.field10599 * arg1 >> 12;
         int var6 = this.field10592 * arg2 >> 12;
         if (arg0 >= -114) {
            this.method1886((byte)34, -3, 74);
         }

         int var7 = this.field10600 * arg2 >> 12;
         class572.method4235(var7, super.field4718, -28884, var4, var5, var6);
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field10607[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bia",
      name = "a",
      descriptor = "(IIZILie;Lie;Z)I"
   )
   public static final int method5364(int arg0, int arg1, boolean arg2, int arg3, class639 arg4, class639 arg5, boolean arg6) {
      try {
         ++field10596;
         int var7 = class321.method2592(arg4, arg0, 108, arg2, arg5);
         if (arg1 != 10669) {
            method5364(87, 100, false, 52, (class639)null, (class639)null, true);
         }

         if (var7 != 0) {
            return arg2 ? -var7 : var7;
         } else if (~arg3 == 0) {
            return 0;
         } else {
            int var8 = class321.method2592(arg4, arg3, 124, arg6, arg5);
            return !arg6 ? var8 : -var8;
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field10607[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field10607[2] : field10607[1]) + ',' + (arg5 != null ? field10607[2] : field10607[1]) + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bia",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method5365(int arg0) {
      try {
         field10604 = null;
         field10602 = null;
         field10606 = null;
         field10605 = null;
         if (arg0 == -21193) {
            field10601 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field10607[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bia",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method5366(boolean arg0) {
      boolean var1 = client.field10022;

      try {
         label43: {
            label42: {
               ++field10598;
               class380.method2967(0);
               int var2 = class476.field6870.field9144.method4124(-103);
               if (var2 != 2) {
                  if (~var2 != -4) {
                     break label43;
                  }

                  if (!var1) {
                     break label42;
                  }
               }

               class693.method5033(class140.field2243, 100, class54.field794, 100, class557.field7909, (byte)35);
               if (!var1) {
                  break label43;
               }
            }

            class490.method3725((byte)90, 2, class654.field9257, class140.field2243, class29.field430, class54.field794, class557.field7909, 2);
         }

         if (!arg0) {
            field10605 = null;
         }

         if (class476.field6870.field9144.method4125((byte)83)) {
            class674.method4880(class729.field10389, -2);
         }

         if (class54.field794 != null) {
            class484.method3691((byte)101);
         }

         class791.field11526 = class476.field6870.field9144.method4124(-89) != 0;
         class563.field8012 = class476.field6870.field9144.method4125((byte)107);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10607[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bia",
      name = "a",
      descriptor = "(IIZ)V"
   )
   public final void method1883(int arg0, int arg1, boolean arg2) {
      try {
         ++field10603;
         int var4 = this.field10597 * arg1 >> 12;
         if (!arg2) {
            int var5 = this.field10599 * arg1 >> 12;
            int var6 = this.field10592 * arg0 >> 12;
            int var7 = this.field10600 * arg0 >> 12;
            class513.method3863(super.field4717, var5, var4, var7, super.field4718, var6, -53, super.field4715);
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field10607[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bia",
      name = "a",
      descriptor = "(II)Lffa;"
   )
   public static final class248 method5367(int arg0, int arg1) {
      try {
         ++field10593;
         class248 var2 = (class248)class798.field11597.method78(0, (long)arg0);
         if (var2 != null) {
            return var2;
         } else {
            byte[] var3 = class577.field8143.method460((byte)-11, 0, arg0);
            if (arg1 >= -104) {
               field10606 = null;
            }

            if (var3 != null && ~var3.length < -2) {
               class248 var4;
               try {
                  var4 = class172.method1593(var3, (byte)44);
               } catch (Exception var7) {
                  throw new RuntimeException(var7.getMessage() + field10607[5] + arg0);
               }

               class798.field11597.method73((byte)108, (long)arg0, var4);
               return var4;
            } else {
               return null;
            }
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field10607[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5368(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 45);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5369(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 121;
            break;
         case 1:
            var10005 = 34;
            break;
         case 2:
            var10005 = 50;
            break;
         case 3:
            var10005 = 107;
            break;
         default:
            var10005 = 45;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
