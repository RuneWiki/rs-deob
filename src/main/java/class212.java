import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class212 extends class125 {
   @OriginalMember(
      owner = "client!vn",
      name = "h",
      descriptor = "Luda;"
   )
   private class56 field2693;
   @OriginalMember(
      owner = "client!vn",
      name = "i",
      descriptor = "Ljea;"
   )
   private class249 field2701;
   @OriginalMember(
      owner = "client!vn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2702 = new String[]{method1743(method1742("E^\u0016c:")), method1743(method1742("E^\u0016\u0015{]YL\u0017:")), method1743(method1742("]ETE")), method1743(method1742("H\u001e\u0016\u0007o")), method1743(method1742("E^\u0016n:")), method1743(method1742("E^\u0016h:")), method1743(method1742("E^\u0016j:")), method1743(method1742("E^\u0016m:")), method1743(method1742("E^\u0016k:")), method1743(method1742("E^\u0016o:")), method1743(method1742("E^\u0016l:"))};
   @OriginalMember(
      owner = "client!vn",
      name = "g",
      descriptor = "Lse;"
   )
   public static class6 field2691 = new class6(10, 7);
   @OriginalMember(
      owner = "client!vn",
      name = "o",
      descriptor = "Z"
   )
   public static boolean field2698 = true;
   @OriginalMember(
      owner = "client!vn",
      name = "f",
      descriptor = "I"
   )
   public static int field2692;
   @OriginalMember(
      owner = "client!vn",
      name = "n",
      descriptor = "I"
   )
   public static int field2694;
   @OriginalMember(
      owner = "client!vn",
      name = "p",
      descriptor = "I"
   )
   public static int field2695;
   @OriginalMember(
      owner = "client!vn",
      name = "l",
      descriptor = "I"
   )
   public static int field2696;
   @OriginalMember(
      owner = "client!vn",
      name = "m",
      descriptor = "I"
   )
   public static int field2697;
   @OriginalMember(
      owner = "client!vn",
      name = "k",
      descriptor = "I"
   )
   public static int field2699;
   @OriginalMember(
      owner = "client!vn",
      name = "j",
      descriptor = "I"
   )
   public static int field2700;

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method343(boolean arg0, int arg1) {
      try {
         if (arg1 != 3) {
            field2698 = false;
         }

         this.field2701.method1979('\u0000', -1);
         ++field2695;
         if (this.field2693.field752) {
            super.field1630.method3988(-128, 1);
            super.field1630.method4006(this.field2693.field749, (byte)27);
            super.field1630.method3988(-128, 0);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2702[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(ILoca;BI)V"
   )
   public static final void method1740(int arg0, class642 arg1, byte arg2, int arg3) {
      try {
         ++field2697;
         class87 var4 = arg1.method4732(class629.field9294, 1618484232);
         if (arg2 != 35) {
            field2691 = null;
         }

         if (var4 != null) {
            class629.field9294.method460(arg3, arg0, arg1.field9629 + arg3, arg1.field9572 + arg0);
            if (class779.field11361 < 3) {
               class350.field4787.method4759((float)arg1.field9629 / 2.0F + (float)arg3, (float)arg1.field9572 / 2.0F + (float)arg0, 4096, 65532 & (int)(-class623.field9202) << 2, var4, arg3, arg0);
            } else {
               class629.field9294.method421(-16777216, var4, arg3, arg0);
            }
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field2702[8] + arg0 + ',' + (arg1 != null ? field2702[3] : field2702[2]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vn",
      name = "b",
      descriptor = "(Z)Z"
   )
   public final boolean method347(boolean arg0) {
      try {
         if (arg0) {
            this.method345((class549)null, -83, -53);
         }

         ++field2694;
         return true;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2702[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method346(boolean arg0, boolean arg1) {
      try {
         if (!arg0) {
            method1740(-87, (class642)null, (byte)42, 48);
         }

         ++field2699;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2702[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(Lll;II)V"
   )
   public final void method345(class549 arg0, int arg1, int arg2) {
      try {
         ++field2700;
         if (arg1 != -23385) {
            this.method341(-54, 9, -28);
         }

         super.field1630.method4006(arg0, (byte)102);
         super.field1630.method4009(arg2, 1);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field2702[7] + (arg0 != null ? field2702[3] : field2702[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method340(int arg0) {
      try {
         ++field2696;
         this.field2701.method1979('\u0001', -1);
         if (arg0 == 5) {
            super.field1630.method3988(-128, 1);
            super.field1630.method4006((class549)null, (byte)-123);
            super.field1630.method3988(arg0 + -133, 0);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2702[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vn",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method341(int arg0, int arg1, int arg2) {
      boolean var4 = client.field1481;

      try {
         float var5;
         float var6;
         float var7;
         label39: {
            ++field2692;
            var5 = (float)((arg2 & 3) + 1) * -5.0E-4F;
            var6 = (float)((3 & arg2 >> 3) - -1) * 5.0E-4F;
            var7 = ~(arg2 & 64) != -1 ? 9.765625E-4F : 4.8828125E-4F;
            super.field1630.method3988(-128, 1);
            boolean var8 = (arg2 & 128) != 0;
            if (var8) {
               class616.field9071[3] = 0.0F;
               class616.field9071[0] = var7;
               class616.field9071[1] = 0.0F;
               class616.field9071[2] = 0.0F;
               if (!var4) {
                  break label39;
               }
            }

            class616.field9071[1] = 0.0F;
            class616.field9071[2] = var7;
            class616.field9071[3] = 0.0F;
            class616.field9071[0] = 0.0F;
         }

         OpenGL.glTexGenfv(8192, 9474, class616.field9071, 0);
         class616.field9071[1] = var7;
         class616.field9071[0] = 0.0F;
         class616.field9071[2] = 0.0F;
         if (arg0 >= -125) {
            this.method343(false, 10);
         }

         label33: {
            class616.field9071[3] = (float)super.field1630.field7640 * var5 % 1.0F;
            OpenGL.glTexGenfv(8193, 9474, class616.field9071, 0);
            if (this.field2693.field752) {
               class616.field9071[2] = 0.0F;
               class616.field9071[1] = 0.0F;
               class616.field9071[0] = 0.0F;
               class616.field9071[3] = (float)super.field1630.field7640 * var6 % 1.0F;
               OpenGL.glTexGenfv(8194, 9473, class616.field9071, 0);
               if (!var4) {
                  break label33;
               }
            }

            int var9 = (int)((float)super.field1630.field7640 * var6 * 16.0F);
            super.field1630.method4006(this.field2693.field747[var9 % 16], (byte)-125);
         }

         super.field1630.method3988(-128, 0);
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field2702[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vn",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method1741(int arg0) {
      try {
         field2691 = null;
         if (arg0 != 1) {
            field2691 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2702[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vn",
      name = "<init>",
      descriptor = "(Liu;Luda;)V"
   )
   public class212(class530 arg0, class56 arg1) {
      super(arg0);

      try {
         this.field2693 = arg1;
         this.field2701 = new class249(arg0, 2);
         this.field2701.method1977(4864, 0);
         super.field1630.method3988(-128, 1);
         if (this.field2693.field752) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
         }

         OpenGL.glTexGeni(8192, 9472, 9216);
         OpenGL.glTexGeni(8193, 9472, 9216);
         OpenGL.glEnable(3168);
         OpenGL.glEnable(3169);
         super.field1630.method3988(-128, 0);
         this.field2701.method1976(-109);
         this.field2701.method1977(4864, 1);
         super.field1630.method3988(-128, 1);
         if (this.field2693.field752) {
            OpenGL.glDisable(3170);
         }

         OpenGL.glDisable(3168);
         OpenGL.glDisable(3169);
         super.field1630.method3988(-128, 0);
         this.field2701.method1976(-114);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2702[1] + (arg0 != null ? field2702[3] : field2702[2]) + ',' + (arg1 != null ? field2702[3] : field2702[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1742(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 18);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1743(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 51;
            break;
         case 1:
            var10005 = 48;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 41;
            break;
         default:
            var10005 = 18;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
