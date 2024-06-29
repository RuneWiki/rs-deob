import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class442 extends class141 {
   @OriginalMember(
      owner = "client!nv",
      name = "y",
      descriptor = "[F"
   )
   private float[] field6296 = new float[4];
   @OriginalMember(
      owner = "client!nv",
      name = "x",
      descriptor = "Z"
   )
   private boolean field6299 = false;
   @OriginalMember(
      owner = "client!nv",
      name = "p",
      descriptor = "Lpk;"
   )
   private class211 field6298;
   @OriginalMember(
      owner = "client!nv",
      name = "H",
      descriptor = "Lpk;"
   )
   private class211 field6300;
   @OriginalMember(
      owner = "client!nv",
      name = "t",
      descriptor = "Lpk;"
   )
   private class211 field6291;
   @OriginalMember(
      owner = "client!nv",
      name = "m",
      descriptor = "Lpk;"
   )
   private class211 field6292;
   @OriginalMember(
      owner = "client!nv",
      name = "I",
      descriptor = "Lfc;"
   )
   private class272 field6295;
   @OriginalMember(
      owner = "client!nv",
      name = "E",
      descriptor = "Z"
   )
   private boolean field6301;
   @OriginalMember(
      owner = "client!nv",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6308 = new String[]{method3254(method3253("wfp\u001eG")), method3254(method3253("wfp\u001dG")), method3254(method3253("b>pt\u0012")), method3254(method3253("wfpf\u0006wy*dG")), method3254(method3253("lg\u0001=\u001dve0>0uy*")), method3254(method3253("we26")), method3254(method3253("lg\u00017\u0000}u2\u0005\u0003pd")), method3254(method3253("~|")), method3254(method3253("lg\u0001=\u001dve0>0l~23\u001b")), method3254(method3253("lg\u00017\u0000}u2\u0005\u001aw|7.")), method3254(method3253("wfp\u001bG")), method3254(method3253("wfp\u0018G")), method3254(method3253("wfp\u0013G")), method3254(method3253("wfp\u0017G")), method3254(method3253("wfp\u0019G")), method3254(method3253("wfp\u001cG")), method3254(method3253("wfp\u0014G")), method3254(method3253("wfp\u001fG"))};
   @OriginalMember(
      owner = "client!nv",
      name = "J",
      descriptor = "Leg;"
   )
   public static class118 field6303 = new class118(75, 7);
   @OriginalMember(
      owner = "client!nv",
      name = "C",
      descriptor = "I"
   )
   public static int field6307 = 2;
   @OriginalMember(
      owner = "client!nv",
      name = "D",
      descriptor = "I"
   )
   public static int field6285;
   @OriginalMember(
      owner = "client!nv",
      name = "A",
      descriptor = "I"
   )
   public static int field6286;
   @OriginalMember(
      owner = "client!nv",
      name = "o",
      descriptor = "I"
   )
   public static int field6287;
   @OriginalMember(
      owner = "client!nv",
      name = "v",
      descriptor = "I"
   )
   public static int field6288;
   @OriginalMember(
      owner = "client!nv",
      name = "u",
      descriptor = "I"
   )
   public static int field6289;
   @OriginalMember(
      owner = "client!nv",
      name = "q",
      descriptor = "I"
   )
   public static int field6293;
   @OriginalMember(
      owner = "client!nv",
      name = "w",
      descriptor = "I"
   )
   public static int field6294;
   @OriginalMember(
      owner = "client!nv",
      name = "r",
      descriptor = "I"
   )
   public static int field6302;
   @OriginalMember(
      owner = "client!nv",
      name = "K",
      descriptor = "I"
   )
   public static int field6304;
   @OriginalMember(
      owner = "client!nv",
      name = "n",
      descriptor = "I"
   )
   public static int field6305;
   @OriginalMember(
      owner = "client!nv",
      name = "z",
      descriptor = "Z"
   )
   private boolean field6290;
   @OriginalMember(
      owner = "client!nv",
      name = "G",
      descriptor = "Z"
   )
   private boolean field6297;
   @OriginalMember(
      owner = "client!nv",
      name = "s",
      descriptor = "[I"
   )
   public static int[] field6306;

   @OriginalMember(
      owner = "client!nv",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method317(int arg0, int arg1, int arg2) {
      try {
         if (arg0 != 0) {
            field6306 = null;
         }

         ++field6289;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field6308[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "e",
      descriptor = "(B)V"
   )
   public final void method1117(byte arg0) {
      try {
         ++field6288;
         if (arg0 > -43) {
            this.method311(false, false);
         }

         int var2;
         class716 var3;
         label35: {
            var2 = super.field1801.method2767((byte)48);
            var3 = super.field1801.method2817(120);
            if (!this.field6290) {
               OpenGL.glBindProgramARB(34336, ~var2 != Integer.MIN_VALUE ? this.field6291.field3016 : this.field6298.field3016);
               if (!client.field4360) {
                  break label35;
               }
            }

            OpenGL.glBindProgramARB(34336, var2 != Integer.MAX_VALUE ? this.field6292.field3016 : this.field6300.field3016);
         }

         OpenGL.glEnable(34336);
         this.field6297 = true;
         var3.method5205(-7122, 0.0F, -1.0F, 0.0F, this.field6296, (float)var2);
         OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field6296[0], this.field6296[1], this.field6296[2], this.field6296[3]);
         this.method314((byte)94);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field6308[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method311(boolean arg0, boolean arg1) {
      try {
         ++field6304;
         if (arg0) {
            this.field6290 = true;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6308[14] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method313(boolean arg0) {
      try {
         ++field6293;
         if (!arg0) {
            method3251(-31);
         }

         return this.field6301;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6308[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "f",
      descriptor = "(B)V"
   )
   public final void method307(byte arg0) {
      try {
         super.field1801.method2763(1, -54);
         ++field6285;
         super.field1801.method2804((class205)null, -2);
         super.field1801.method2745(-30, class458.field6587, class458.field6587);
         super.field1801.method2814(0, class10.field93, true);
         super.field1801.method2814(2, class304.field4150, true);
         super.field1801.method2787(class10.field93, (byte)-51, 0);
         if (arg0 < 102) {
            this.method307((byte)84);
         }

         super.field1801.method2763(0, -41);
         if (this.field6299) {
            super.field1801.method2814(0, class10.field93, true);
            super.field1801.method2787(class10.field93, (byte)-51, 0);
            this.field6299 = false;
         }

         if (this.field6297) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field6297 = false;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6308[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "a",
      descriptor = "(Lm;II)V"
   )
   public final void method310(class205 arg0, int arg1, int arg2) {
      try {
         if (arg2 == 0) {
            ++field6302;
            if (arg0 == null) {
               if (!this.field6299) {
                  super.field1801.method2804(super.field1801.field5259, -2);
                  super.field1801.method2747((byte)-123, 1);
                  super.field1801.method2814(0, class706.field10312, true);
                  super.field1801.method2787(class706.field10312, (byte)-51, 0);
                  this.field6299 = true;
                  return;
               }
            } else {
               if (this.field6299) {
                  super.field1801.method2814(0, class10.field93, true);
                  super.field1801.method2787(class10.field93, (byte)-51, 0);
                  this.field6299 = false;
               }

               super.field1801.method2804(arg0, arg2 ^ -2);
               super.field1801.method2747((byte)-85, arg1);
            }

         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field6308[11] + (arg0 != null ? field6308[2] : field6308[5]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method3251(int arg0) {
      try {
         int var1 = 108 / ((arg0 - 28) / 62);
         field6306 = null;
         field6303 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6308[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "<init>",
      descriptor = "(Lwi;Lkf;)V"
   )
   public class442(class494 arg0, class266 arg1) {
      super(arg0);

      try {
         if (arg1 != null && arg0.field7161) {
            this.field6298 = class405.method3058(0, arg1.method2032(field6308[8], (byte)-72, field6308[7]), arg0, 34336);
            this.field6300 = class405.method3058(0, arg1.method2032(field6308[4], (byte)-72, field6308[7]), arg0, 34336);
            this.field6291 = class405.method3058(0, arg1.method2032(field6308[9], (byte)-72, field6308[7]), arg0, 34336);
            this.field6292 = class405.method3058(0, arg1.method2032(field6308[6], (byte)-72, field6308[7]), arg0, 34336);
            if (this.field6291 != null & this.field6300 != null & this.field6298 != null & this.field6292 != null) {
               this.field6295 = super.field1801.method2759(false, 1, 0, new int[]{0, -1}, 2);
               this.field6295.method277(true, false, false);
               this.field6301 = true;
            } else {
               this.field6301 = false;
            }
         } else {
            this.field6301 = false;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6308[3] + (arg0 != null ? field6308[2] : field6308[5]) + ',' + (arg1 != null ? field6308[2] : field6308[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "g",
      descriptor = "(B)V"
   )
   public final void method314(byte arg0) {
      try {
         if (this.field6297) {
            int var2 = super.field1801.method504();
            int var3 = super.field1801.method595();
            float var4 = (float)var2 + -((float)(-var3 + var2) * 0.125F);
            float var5 = (float)var2 - (float)(var2 - var3) * 0.25F;
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float)super.field1801.method2777((byte)39), (float)super.field1801.method2773((byte)-105) / 255.0F);
            super.field1801.method2763(1, -115);
            super.field1801.method2752(super.field1801.method2793((byte)123), (byte)50);
            super.field1801.method2763(0, -123);
         }

         if (arg0 != 94) {
            this.field6300 = null;
         }

         ++field6287;
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field6308[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "a",
      descriptor = "(BII)Z"
   )
   public static final boolean method3252(byte arg0, int arg1, int arg2) {
      try {
         ++field6286;
         if (arg0 >= -6) {
            field6303 = null;
         }

         return (384 & arg2) != 0;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6308[15] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "b",
      descriptor = "(ZZ)V"
   )
   public final void method309(boolean arg0, boolean arg1) {
      try {
         ++field6294;
         this.field6290 = arg1;
         super.field1801.method2763(1, -122);
         super.field1801.method2804(this.field6295, -2);
         super.field1801.method2745(-30, class144.field1826, class603.field8872);
         super.field1801.method2814(0, class304.field4150, !arg0);
         super.field1801.method2635(class10.field93, 2, -127, true, arg0);
         super.field1801.method2787(class706.field10312, (byte)-51, 0);
         super.field1801.method2763(0, -100);
         this.method1117((byte)-122);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6308[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3253(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 111);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3254(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 25;
            break;
         case 1:
            var10005 = 16;
            break;
         case 2:
            var10005 = 94;
            break;
         case 3:
            var10005 = 90;
            break;
         default:
            var10005 = 111;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
