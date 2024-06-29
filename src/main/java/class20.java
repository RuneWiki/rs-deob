import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class20 extends class550 {
   @OriginalMember(
      owner = "client!qm",
      name = "D",
      descriptor = "Z"
   )
   private boolean field260 = false;
   @OriginalMember(
      owner = "client!qm",
      name = "k",
      descriptor = "[F"
   )
   private float[] field259 = new float[4];
   @OriginalMember(
      owner = "client!qm",
      name = "E",
      descriptor = "Lcca;"
   )
   private class129 field268;
   @OriginalMember(
      owner = "client!qm",
      name = "w",
      descriptor = "Lcca;"
   )
   private class129 field267;
   @OriginalMember(
      owner = "client!qm",
      name = "n",
      descriptor = "Lcca;"
   )
   private class129 field253;
   @OriginalMember(
      owner = "client!qm",
      name = "j",
      descriptor = "Lcca;"
   )
   private class129 field252;
   @OriginalMember(
      owner = "client!qm",
      name = "m",
      descriptor = "Lbc;"
   )
   private class282 field251;
   @OriginalMember(
      owner = "client!qm",
      name = "B",
      descriptor = "Z"
   )
   private boolean field258;
   @OriginalMember(
      owner = "client!qm",
      name = "F",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field269 = new String[]{method150(method149("U3\\\u0015F")), method150(method149("U3\\\u0012F")), method150(method149("U3\\\u001cF")), method150(method149("U3\\\u001bF")), method150(method149("U3\\\u001aF")), method150(method149("U3\\\u0014F")), method150(method149("U3\\\u0011F")), method150(method149("_p\\y\u0013")), method150(method149("J+\u001e;")), method150(method149("U3\\\u001eF")), method150(method149("U3\\\u0016F")), method150(method149("Q)-:\u0001@;\u001e\b\u001bJ2\u001b#")), method150(method149("Q)-:\u0001@;\u001e\b\u0002M*")), method150(method149("Q)-0\u001cK+\u001c31Q0\u001e>\u001a")), method150(method149("U3\\k\u0007J7\u0006iF")), method150(method149("C2")), method150(method149("Q)-0\u001cK+\u001c31H7\u0006")), method150(method149("U3\\\u0019F"))};
   @OriginalMember(
      owner = "client!qm",
      name = "p",
      descriptor = "[[I"
   )
   public static int[][] field249 = new int[6][];
   @OriginalMember(
      owner = "client!qm",
      name = "u",
      descriptor = "I"
   )
   public static int field254 = -1;
   @OriginalMember(
      owner = "client!qm",
      name = "y",
      descriptor = "I"
   )
   public static int field247;
   @OriginalMember(
      owner = "client!qm",
      name = "A",
      descriptor = "I"
   )
   public static int field248;
   @OriginalMember(
      owner = "client!qm",
      name = "q",
      descriptor = "I"
   )
   public static int field255;
   @OriginalMember(
      owner = "client!qm",
      name = "t",
      descriptor = "I"
   )
   public static int field256;
   @OriginalMember(
      owner = "client!qm",
      name = "l",
      descriptor = "I"
   )
   public static int field257;
   @OriginalMember(
      owner = "client!qm",
      name = "s",
      descriptor = "I"
   )
   public static int field261;
   @OriginalMember(
      owner = "client!qm",
      name = "r",
      descriptor = "I"
   )
   public static int field262;
   @OriginalMember(
      owner = "client!qm",
      name = "o",
      descriptor = "I"
   )
   public static int field263;
   @OriginalMember(
      owner = "client!qm",
      name = "v",
      descriptor = "I"
   )
   public static int field264;
   @OriginalMember(
      owner = "client!qm",
      name = "z",
      descriptor = "I"
   )
   public static int field265;
   @OriginalMember(
      owner = "client!qm",
      name = "C",
      descriptor = "Z"
   )
   private boolean field250;
   @OriginalMember(
      owner = "client!qm",
      name = "x",
      descriptor = "Z"
   )
   private boolean field266;

   @OriginalMember(
      owner = "client!qm",
      name = "b",
      descriptor = "(I)V",
      line = 5
   )
   public final void method72(int arg0) {
      try {
         ++field257;
         super.field8234.method2220(1, 14);
         super.field8234.method2193((class428)null, (byte)-19);
         super.field8234.method2212((byte)119, class716.field10733, class716.field10733);
         super.field8234.method2185((byte)-115, 0, class751.field11122);
         super.field8234.method2185((byte)-110, 2, class700.field10441);
         super.field8234.method2221(0, (byte)51, class751.field11122);
         super.field8234.method2220(0, 14);
         if (this.field260) {
            super.field8234.method2185((byte)-125, 0, class751.field11122);
            super.field8234.method2221(0, (byte)51, class751.field11122);
            this.field260 = false;
         }

         if (this.field250) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field250 = false;
         }

         if (arg0 != -2) {
            this.field253 = null;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field269[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qm",
      name = "a",
      descriptor = "(ZB)V",
      line = 40
   )
   public final void method73(boolean arg0, byte arg1) {
      try {
         this.field266 = arg0;
         ++field261;
         if (arg1 > -44) {
            this.method76((byte)88);
         }

         super.field8234.method2220(1, 14);
         super.field8234.method2193(this.field251, (byte)-19);
         super.field8234.method2212((byte)119, class582.field8586, class453.field6943);
         super.field8234.method2185((byte)-99, 0, class700.field10441);
         super.field8234.method1494(0, true, 2, class751.field11122, false);
         super.field8234.method2221(0, (byte)51, class36.field435);
         super.field8234.method2220(0, 14);
         this.method75((byte)-97);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field269[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qm",
      name = "<init>",
      descriptor = "(Lcka;Lrr;)V",
      line = 59
   )
   public class20(class174 arg0, class678 arg1) {
      super(arg0);

      try {
         if (arg1 != null && arg0.field2728) {
            this.field268 = class5.method21(arg0, 79, 34336, arg1.method5023(field269[13], field269[15], 0));
            this.field267 = class5.method21(arg0, -107, 34336, arg1.method5023(field269[16], field269[15], 0));
            this.field253 = class5.method21(arg0, 67, 34336, arg1.method5023(field269[11], field269[15], 0));
            this.field252 = class5.method21(arg0, -127, 34336, arg1.method5023(field269[12], field269[15], 0));
            if (this.field253 != null & this.field268 != null & this.field267 != null & this.field252 != null) {
               this.field251 = super.field8234.method2177(false, -1, 2, new int[]{0, -1}, 1);
               this.field251.method2358(-3545, false, false);
               this.field258 = true;
            } else {
               this.field258 = false;
            }
         } else {
            this.field258 = false;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field269[14] + (arg0 != null ? field269[7] : field269[8]) + ',' + (arg1 != null ? field269[7] : field269[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qm",
      name = "a",
      descriptor = "(BZ)V",
      line = 86
   )
   public final void method78(byte arg0, boolean arg1) {
      try {
         ++field256;
         if (arg0 < 82) {
            this.field250 = true;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field269[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qm",
      name = "g",
      descriptor = "(I)V",
      line = 96
   )
   public static void method147(int arg0) {
      try {
         field249 = null;
         if (arg0 <= 105) {
            method147(-102);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field269[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qm",
      name = "a",
      descriptor = "(IBLwm;)V",
      line = 110
   )
   public final void method71(int arg0, byte arg1, class428 arg2) {
      try {
         label30: {
            ++field263;
            if (arg2 != null) {
               if (this.field260) {
                  super.field8234.method2185((byte)-99, 0, class751.field11122);
                  super.field8234.method2221(0, (byte)51, class751.field11122);
                  this.field260 = false;
               }

               super.field8234.method2193(arg2, (byte)-19);
               super.field8234.method2255(arg0, (byte)90);
               if (!client.field1786) {
                  break label30;
               }
            }

            if (!this.field260) {
               super.field8234.method2193(super.field8234.field4153, (byte)-19);
               super.field8234.method2255(1, (byte)90);
               super.field8234.method2185((byte)-126, 0, class36.field435);
               super.field8234.method2221(0, (byte)51, class36.field435);
               this.field260 = true;
            }
         }

         int var4 = -9 % ((arg1 - 18) / 60);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field269[9] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field269[7] : field269[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qm",
      name = "c",
      descriptor = "(B)Z",
      line = 145
   )
   public final boolean method69(byte arg0) {
      try {
         ++field262;
         if (arg0 != 120) {
            this.field251 = null;
         }

         return this.field258;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field269[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qm",
      name = "a",
      descriptor = "(BII)V",
      line = 161
   )
   public final void method67(byte arg0, int arg1, int arg2) {
      try {
         if (arg0 != 90) {
            field249 = null;
         }

         ++field248;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field269[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qm",
      name = "a",
      descriptor = "(III)Z",
      line = 173
   )
   public static final boolean method148(int arg0, int arg1, int arg2) {
      try {
         ++field247;
         if (arg2 != 2048) {
            field249 = null;
         }

         return ~(2048 & arg0) != -1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field269[17] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qm",
      name = "d",
      descriptor = "(B)V",
      line = 192
   )
   public final void method76(byte arg0) {
      try {
         ++field264;
         if (arg0 != 71) {
            this.field250 = true;
         }

         if (this.field250) {
            int var2 = super.field8234.method616();
            int var3 = super.field8234.method635();
            float var4 = (float)var2 - (float)(-var3 + var2) * 0.125F;
            float var5 = (float)var2 - (float)(var2 - var3) * 0.25F;
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float)super.field8234.method2201((byte)-112), (float)super.field8234.method2253((byte)-82) / 255.0F);
            super.field8234.method2220(1, arg0 ^ 73);
            super.field8234.method2218(super.field8234.method2238((byte)-115), arg0 ^ 22062);
            super.field8234.method2220(0, 14);
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field269[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qm",
      name = "a",
      descriptor = "(B)V",
      line = 226
   )
   public final void method75(byte arg0) {
      try {
         int var2;
         class504 var3;
         label30: {
            ++field265;
            var2 = super.field8234.method2210(-9155);
            var3 = super.field8234.method2240(-122);
            if (!this.field266) {
               OpenGL.glBindProgramARB(34336, var2 == Integer.MAX_VALUE ? this.field268.field1847 : this.field253.field1847);
               if (!client.field1786) {
                  break label30;
               }
            }

            OpenGL.glBindProgramARB(34336, var2 != Integer.MAX_VALUE ? this.field252.field1847 : this.field267.field1847);
         }

         OpenGL.glEnable(34336);
         this.field250 = true;
         int var4 = 1 % ((39 - arg0) / 58);
         var3.method3917((float)var2, 0.0F, 0, 0.0F, -1.0F, this.field259);
         OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field259[0], this.field259[1], this.field259[2], this.field259[3]);
         this.method76((byte)71);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field269[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method149(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 110);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method150(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 36;
            break;
         case 1:
            var10005 = 94;
            break;
         case 2:
            var10005 = 114;
            break;
         case 3:
            var10005 = 87;
            break;
         default:
            var10005 = 110;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
