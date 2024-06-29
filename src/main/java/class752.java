import jaggl.OpenGL;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class752 extends class707 {
   @OriginalMember(
      owner = "client!wn",
      name = "y",
      descriptor = "I"
   )
   private int field10828;
   @OriginalMember(
      owner = "client!wn",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10830 = new String[]{method5450(method5449("cac\u0010\u0016")), method5450(method5449("cac\u000f\u0016")), method5450(method5449("o!cnC")), method5450(method5449("zz!,")), method5450(method5449("cac\u0001\u0016")), method5450(method5449("cac\u0002\u0016")), method5450(method5449("cac\r\u0016")), method5450(method5449("cac\u0011\u0016")), method5450(method5449("cac\u000e\u0016")), method5450(method5449("cac|Wzf9~\u0016"))};
   @OriginalMember(
      owner = "client!wn",
      name = "r",
      descriptor = "Z"
   )
   public static boolean field10825 = false;
   @OriginalMember(
      owner = "client!wn",
      name = "x",
      descriptor = "I"
   )
   public static int field10823 = -1;
   @OriginalMember(
      owner = "client!wn",
      name = "B",
      descriptor = "I"
   )
   public static int field10819;
   @OriginalMember(
      owner = "client!wn",
      name = "z",
      descriptor = "I"
   )
   public static int field10820;
   @OriginalMember(
      owner = "client!wn",
      name = "t",
      descriptor = "I"
   )
   public static int field10821;
   @OriginalMember(
      owner = "client!wn",
      name = "A",
      descriptor = "I"
   )
   public static int field10822;
   @OriginalMember(
      owner = "client!wn",
      name = "s",
      descriptor = "I"
   )
   public static int field10824;
   @OriginalMember(
      owner = "client!wn",
      name = "v",
      descriptor = "I"
   )
   public static int field10827;
   @OriginalMember(
      owner = "client!wn",
      name = "w",
      descriptor = "I"
   )
   public static int field10829;
   @OriginalMember(
      owner = "client!wn",
      name = "u",
      descriptor = "Z"
   )
   public static boolean field10826;

   @OriginalMember(
      owner = "client!wn",
      name = "a",
      descriptor = "(IZ)V",
      line = 5
   )
   public final void method5443(int arg0, boolean arg1) {
      try {
         super.field10269.method252(this, (byte)-21);
         if (arg0 != 10497) {
            method5444(-81, -58);
         }

         ++field10829;
         OpenGL.glTexParameteri(super.field10277, 10242, !arg1 ? 33071 : 10497);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field10830[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wn",
      name = "a",
      descriptor = "(II)I",
      line = 19
   )
   public static final int method5444(int arg0, int arg1) {
      try {
         ++field10820;
         int var2 = 0;
         if (arg1 < 0 || arg1 >= 65536) {
            arg1 >>>= 16;
            var2 += 16;
         }

         if (arg1 >= 256) {
            var2 += 8;
            arg1 >>>= 8;
         }

         if (arg1 >= 16) {
            var2 += 4;
            arg1 >>>= 4;
         }

         if (arg1 >= 4) {
            var2 += 2;
            arg1 >>>= 2;
         }

         if (arg0 >= -30) {
            field10823 = -29;
         }

         if (arg1 >= 1) {
            arg1 >>>= 1;
            ++var2;
         }

         return arg1 + var2;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field10830[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wn",
      name = "a",
      descriptor = "(JZI)Ljava/lang/String;",
      line = 66
   )
   public static final String method5445(long arg0, boolean arg1, int arg2) {
      try {
         class62.method673(arg0, (byte)111);
         ++field10827;
         int var4 = class62.field1161.get(5);
         int var5 = 1 + class62.field1161.get(2);
         if (arg1) {
            field10826 = true;
         }

         int var6 = class62.field1161.get(1);
         return Integer.toString(var4 / 10) + var4 % 10 + "/" + var5 / 10 + var5 % 10 + "/" + var6 % 100 / 10 + var6 % 10;
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field10830[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wn",
      name = "a",
      descriptor = "(IIB)Z",
      line = 87
   )
   public static final boolean method5446(int arg0, int arg1, byte arg2) {
      try {
         ++field10822;
         if (arg1 >= 1000 && ~arg0 > -1001) {
            return true;
         } else if (arg2 > -74) {
            return true;
         } else if (arg1 < 1000 && arg0 < 1000) {
            if (class688.method5011((byte)-113, arg0)) {
               return true;
            } else {
               return !class688.method5011((byte)-114, arg1);
            }
         } else {
            return ~arg1 <= -1001 && ~arg0 <= -1001;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field10830[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wn",
      name = "a",
      descriptor = "(JIZI)Ljava/lang/String;",
      line = 118
   )
   public static final String method5447(long arg0, int arg1, boolean arg2, int arg3) {
      try {
         Calendar var5;
         label18: {
            ++field10824;
            if (!arg2) {
               class62.method673(arg0, (byte)110);
               var5 = class62.field1161;
               if (!client.field4564) {
                  break label18;
               }
            }

            class164.method1496(30401, arg0);
            var5 = class62.field1158;
         }

         int var6 = var5.get(5);
         int var7 = var5.get(2) + 1;
         if (arg1 < 112) {
            method5448((class473)null, false);
         }

         int var8 = var5.get(1);
         int var9 = var5.get(11);
         int var10 = var5.get(12);
         return Integer.toString(var6 / 10) + var6 % 10 + "/" + var7 / 10 + var7 % 10 + "/" + var8 % 100 / 10 + var8 % 10 + " " + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
      } catch (RuntimeException var12) {
         throw class608.method4462(var12, field10830[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wn",
      name = "a",
      descriptor = "(Luda;Z)V",
      line = 153
   )
   public static final void method5448(class473 arg0, boolean arg1) {
      boolean var2 = client.field4564;

      try {
         ++field10821;
         int var3 = arg0.method3586(113);
         class373.field5544 = new class168[var3];
         int var4 = 0;
         if (var2) {
            class373.field5544[var4] = new class168();
            class373.field5544[var4].field2633 = arg0.method3586(112);
            class373.field5544[var4].field2632 = arg0.method3570(arg1 == 0);
            ++var4;
         }

         while(true) {
            while(~var3 < ~var4) {
               class373.field5544[var4] = new class168();
               class373.field5544[var4].field2633 = arg0.method3586(112);
               class373.field5544[var4].field2632 = arg0.method3570(arg1 == 0);
               ++var4;
            }

            class36.field888 = arg0.method3586(126);
            class262.field3733 = arg0.method3586(120);
            class194.field2936 = arg0.method3586(114);
            class604.field8700 = new class203[-class36.field888 + 1 + class262.field3733];
            int var5 = 0;
            if (!var2) {
               int var10000;
               if (var2) {
                  var10000 = arg0.method3586(119);
               } else if (class194.field2936 <= var5) {
                  class128.field2148 = arg0.method3567(31871);
                  var10000 = arg1;
                  if (!var2) {
                     class660.field9613 = (boolean)arg1;
                     return;
                  }
               } else {
                  var10000 = arg0.method3586(119);
               }

               while(true) {
                  int var6 = var10000;
                  class203 var7 = class604.field8700[var6] = new class203();
                  var7.field9589 = arg0.method3564((byte)-77);
                  var7.field9587 = arg0.method3567(31871);
                  var7.field3032 = class36.field888 + var6;
                  var7.field3042 = arg0.method3570(false);
                  var7.field3033 = arg0.method3570(false);
                  ++var5;
                  if (class194.field2936 <= var5) {
                     class128.field2148 = arg0.method3567(31871);
                     var10000 = arg1;
                     if (!var2) {
                        class660.field9613 = (boolean)arg1;
                        return;
                     }
                  } else {
                     var10000 = arg0.method3586(119);
                  }
               }
            }

            class373.field5544[var4].field2632 = arg0.method3570(arg1 == 0);
            ++var4;
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field10830[1] + (arg0 != null ? field10830[2] : field10830[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wn",
      name = "<init>",
      descriptor = "(Lrk;II[BI)V",
      line = 197
   )
   public class752(class35 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
      super(arg0, 3552, arg1, arg2, false);

      try {
         this.field10828 = arg2;
         super.field10269.method252(this, (byte)-128);
         OpenGL.glPixelStorei(3317, 1);
         OpenGL.glTexImage1Dub(super.field10277, 0, super.field10270, this.field10828, 0, arg4, 5121, arg3, 0);
         OpenGL.glPixelStorei(3317, 4);
         this.method5132(true, 0);
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field10830[9] + (arg0 != null ? field10830[2] : field10830[3]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10830[2] : field10830[3]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wn",
      name = "a",
      descriptor = "(I)V",
      line = 214
   )
   public final void method96(int arg0) {
      try {
         ++field10819;
         int var2 = 27 / ((arg0 - 6) / 46);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field10830[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5449(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 62);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5450(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 20;
            break;
         case 1:
            var10005 = 15;
            break;
         case 2:
            var10005 = 77;
            break;
         case 3:
            var10005 = 64;
            break;
         default:
            var10005 = 62;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
