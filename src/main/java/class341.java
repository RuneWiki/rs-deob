import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class341 extends class14 {
   @OriginalMember(
      owner = "client!dh",
      name = "v",
      descriptor = "Lds;"
   )
   private class16 field4628;
   @OriginalMember(
      owner = "client!dh",
      name = "x",
      descriptor = "Lcf;"
   )
   private class631 field4634;
   @OriginalMember(
      owner = "client!dh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4635 = new String[]{method2505(method2504("=\u0016\u0004!\u0013")), method2505(method2504("=\u0016\u0004*\u0013")), method2505(method2504("7\u000bF\u0005")), method2505(method2504("\"P\u0004GF")), method2505(method2504("=\u0016\u0004UR7\u0017^W\u0013")), method2505(method2504("=\u0016\u0004+\u0013")), method2505(method2504("=\u0016\u0004 \u0013")), method2505(method2504("=\u0016\u0004(\u0013")), method2505(method2504("=\u0016\u0004#\u0013")), method2505(method2504("=\u0016\u0004\"\u0013")), method2505(method2504("=\u0016\u0004,\u0013")), method2505(method2504("=\u0016\u0004.\u0013"))};
   @OriginalMember(
      owner = "client!dh",
      name = "w",
      descriptor = "[S"
   )
   public static short[] field4625 = new short[256];
   @OriginalMember(
      owner = "client!dh",
      name = "q",
      descriptor = "I"
   )
   public static int field4623;
   @OriginalMember(
      owner = "client!dh",
      name = "m",
      descriptor = "I"
   )
   public static int field4624;
   @OriginalMember(
      owner = "client!dh",
      name = "s",
      descriptor = "I"
   )
   public static int field4626;
   @OriginalMember(
      owner = "client!dh",
      name = "p",
      descriptor = "I"
   )
   public static int field4627;
   @OriginalMember(
      owner = "client!dh",
      name = "n",
      descriptor = "I"
   )
   public static int field4629;
   @OriginalMember(
      owner = "client!dh",
      name = "r",
      descriptor = "I"
   )
   public static int field4630;
   @OriginalMember(
      owner = "client!dh",
      name = "t",
      descriptor = "I"
   )
   public static int field4632;
   @OriginalMember(
      owner = "client!dh",
      name = "u",
      descriptor = "I"
   )
   public static int field4633;
   @OriginalMember(
      owner = "client!dh",
      name = "o",
      descriptor = "[[I"
   )
   public static int[][] field4631;

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(I)Z",
      line = 3
   )
   public final boolean method87(int arg0) {
      try {
         if (arg0 >= -49) {
            this.field4628 = null;
         }

         ++field4623;
         return true;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field4635[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(IZ)V",
      line = 14
   )
   public final void method88(int arg0, boolean arg1) {
      try {
         ++field4632;
         if (arg0 != 16) {
            this.field4628 = null;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field4635[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(BLsl;I)V",
      line = 28
   )
   public final void method86(byte arg0, class486 arg1, int arg2) {
      try {
         ++field4626;
         super.field157.method4107(12, arg1);
         super.field157.method4134(arg2, 2);
         if (arg0 <= 75) {
            method2503(-26);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field4635[11] + arg0 + ',' + (arg1 != null ? field4635[3] : field4635[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(ZI)V",
      line = 40
   )
   public final void method84(boolean arg0, int arg1) {
      try {
         this.field4634.method4571(false, '\u0000');
         if (arg1 != 13254) {
            field4625 = null;
         }

         ++field4624;
         if (this.field4628.field179) {
            super.field157.method4112((byte)114, 1);
            super.field157.method4107(-126, this.field4628.field180);
            super.field157.method4112((byte)-19, 0);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field4635[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "d",
      descriptor = "(I)V",
      line = 58
   )
   public static void method2501(int arg0) {
      try {
         field4625 = null;
         field4631 = null;
         if (arg0 != -27909) {
            field4625 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4635[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "b",
      descriptor = "(I)V",
      line = 69
   )
   public final void method85(int arg0) {
      try {
         this.field4634.method4571(false, '\u0001');
         ++field4629;
         super.field157.method4112((byte)107, 1);
         super.field157.method4107(72, (class486)null);
         if (arg0 != 17328) {
            field4625 = null;
         }

         super.field157.method4112((byte)-14, 0);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field4635[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(II)I",
      line = 83
   )
   public static final int method2502(int arg0, int arg1) {
      try {
         if (arg0 >= -67) {
            field4631 = null;
         }

         ++field4630;
         return arg1 >>> 8;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field4635[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "<init>",
      descriptor = "(Lea;Lds;)V",
      line = 96
   )
   public class341(class573 arg0, class16 arg1) {
      super(arg0);

      try {
         this.field4628 = arg1;
         this.field4634 = new class631(arg0, 2);
         this.field4634.method4569(0, (byte)-109);
         super.field157.method4112((byte)114, 1);
         if (this.field4628.field179) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
         }

         OpenGL.glTexGeni(8192, 9472, 9216);
         OpenGL.glTexGeni(8193, 9472, 9216);
         OpenGL.glEnable(3168);
         OpenGL.glEnable(3169);
         super.field157.method4112((byte)9, 0);
         this.field4634.method4570(256);
         this.field4634.method4569(1, (byte)-118);
         super.field157.method4112((byte)108, 1);
         if (this.field4628.field179) {
            OpenGL.glDisable(3170);
         }

         OpenGL.glDisable(3168);
         OpenGL.glDisable(3169);
         super.field157.method4112((byte)-112, 0);
         this.field4634.method4570(256);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field4635[4] + (arg0 != null ? field4635[3] : field4635[2]) + ',' + (arg1 != null ? field4635[3] : field4635[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "a",
      descriptor = "(III)V",
      line = 133
   )
   public final void method82(int arg0, int arg1, int arg2) {
      boolean var4 = client.field4360;

      try {
         float var5;
         float var6;
         float var7;
         label39: {
            ++field4633;
            var5 = (float)((arg1 & 3) + 1) * -5.0E-4F;
            var6 = (float)((3 & arg1 >> 3) + 1) * 5.0E-4F;
            var7 = ~(arg1 & 64) != -1 ? 9.765625E-4F : 4.8828125E-4F;
            boolean var8 = ~(arg1 & 128) != -1;
            super.field157.method4112((byte)105, 1);
            if (!var8) {
               class611.field8971[2] = var7;
               class611.field8971[1] = 0.0F;
               class611.field8971[0] = 0.0F;
               class611.field8971[3] = 0.0F;
               if (!var4) {
                  break label39;
               }
            }

            class611.field8971[1] = 0.0F;
            class611.field8971[2] = 0.0F;
            class611.field8971[3] = 0.0F;
            class611.field8971[0] = var7;
         }

         OpenGL.glTexGenfv(8192, 9474, class611.field8971, 0);
         if (arg0 != 13880) {
            this.field4628 = null;
         }

         label33: {
            class611.field8971[1] = var7;
            class611.field8971[2] = 0.0F;
            class611.field8971[3] = (float)super.field157.field8355 * var5 % 1.0F;
            class611.field8971[0] = 0.0F;
            OpenGL.glTexGenfv(8193, 9474, class611.field8971, 0);
            if (this.field4628.field179) {
               class611.field8971[1] = 0.0F;
               class611.field8971[0] = 0.0F;
               class611.field8971[2] = 0.0F;
               class611.field8971[3] = (float)super.field157.field8355 * var6 % 1.0F;
               OpenGL.glTexGenfv(8194, 9473, class611.field8971, 0);
               if (!var4) {
                  break label33;
               }
            }

            int var9 = (int)((float)super.field157.field8355 * var6 * 16.0F);
            super.field157.method4107(-124, this.field4628.field185[var9 % 16]);
         }

         super.field157.method4112((byte)113, 0);
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field4635[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "c",
      descriptor = "(I)V",
      line = 191
   )
   public static final void method2503(int arg0) {
      try {
         class287.field3964 = null;
         class138.field1765 = -1;
         class269.field3721 = null;
         class12.field133 = null;
         class751.field11114 = -1;
         class64.field772 = -1;
         class106.field1344 = null;
         class614.field9025 = -1;
         class603.field8876 = null;
         if (arg0 > -21) {
            field4625 = null;
         }

         class50.field660 = null;
         ++field4627;
         class706.field10310 = null;
         class790.field11583.method2008(true);
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4635[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2504(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 59);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2505(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 89;
            break;
         case 1:
            var10005 = 126;
            break;
         case 2:
            var10005 = 42;
            break;
         case 3:
            var10005 = 105;
            break;
         default:
            var10005 = 59;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
