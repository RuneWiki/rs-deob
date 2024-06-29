import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sja")
public class class11 extends class242 {
   @OriginalMember(
      owner = "client!sja",
      name = "B",
      descriptor = "[F"
   )
   private float[] field109 = new float[4];
   @OriginalMember(
      owner = "client!sja",
      name = "u",
      descriptor = "Z"
   )
   private boolean field114 = false;
   @OriginalMember(
      owner = "client!sja",
      name = "D",
      descriptor = "Lwj;"
   )
   private class412 field113;
   @OriginalMember(
      owner = "client!sja",
      name = "F",
      descriptor = "Lwj;"
   )
   private class412 field111;
   @OriginalMember(
      owner = "client!sja",
      name = "r",
      descriptor = "Lwj;"
   )
   private class412 field106;
   @OriginalMember(
      owner = "client!sja",
      name = "I",
      descriptor = "Lwj;"
   )
   private class412 field110;
   @OriginalMember(
      owner = "client!sja",
      name = "C",
      descriptor = "Z"
   )
   private boolean field103;
   @OriginalMember(
      owner = "client!sja",
      name = "A",
      descriptor = "Lnfa;"
   )
   private class706 field117;
   @OriginalMember(
      owner = "client!sja",
      name = "J",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field122 = new String[]{method76(method75("Ht!6")), method76(method75("]/ct\u001d")), method76(method75("Uk,t)\u000e")), method76(method75("Uk,t$\u000e")), method76(method75("Uk,t!\u000e")), method76(method75("Uk,t-\u000e")), method76(method75("Uk,t,\u000e")), method76(method75("Uk,t.\u000e")), method76(method75("Uk,t\"\u000e")), method76(method75("Uk,t'\u000e")), method76(method75("Uk,t\\Oo$.^\u000e")), method76(method75("Sv\u00127\u000fBd!\u0005\fOu")), method76(method75("Am")), method76(method75("Sv\u0012=\u0012It#>?Jh9")), method76(method75("Sv\u0012=\u0012It#>?So!3\u0014")), method76(method75("Sv\u00127\u000fBd!\u0005\u0015Hm$.")), method76(method75("Uk,t*\u000e")), method76(method75("Uk,t(\u000e"))};
   @OriginalMember(
      owner = "client!sja",
      name = "H",
      descriptor = "Z"
   )
   public static boolean field119 = true;
   @OriginalMember(
      owner = "client!sja",
      name = "E",
      descriptor = "Lgw;"
   )
   public static class179 field112 = new class179(4);
   @OriginalMember(
      owner = "client!sja",
      name = "q",
      descriptor = "I"
   )
   public static int field100;
   @OriginalMember(
      owner = "client!sja",
      name = "w",
      descriptor = "I"
   )
   public static int field101;
   @OriginalMember(
      owner = "client!sja",
      name = "n",
      descriptor = "I"
   )
   public static int field102;
   @OriginalMember(
      owner = "client!sja",
      name = "z",
      descriptor = "I"
   )
   public static int field104;
   @OriginalMember(
      owner = "client!sja",
      name = "y",
      descriptor = "I"
   )
   public static int field105;
   @OriginalMember(
      owner = "client!sja",
      name = "p",
      descriptor = "I"
   )
   public static int field108;
   @OriginalMember(
      owner = "client!sja",
      name = "G",
      descriptor = "I"
   )
   public static int field116;
   @OriginalMember(
      owner = "client!sja",
      name = "o",
      descriptor = "I"
   )
   public static int field118;
   @OriginalMember(
      owner = "client!sja",
      name = "x",
      descriptor = "I"
   )
   public static int field120;
   @OriginalMember(
      owner = "client!sja",
      name = "s",
      descriptor = "I"
   )
   public static int field121;
   @OriginalMember(
      owner = "client!sja",
      name = "t",
      descriptor = "Z"
   )
   private boolean field107;
   @OriginalMember(
      owner = "client!sja",
      name = "v",
      descriptor = "Z"
   )
   private boolean field115;

   @OriginalMember(
      owner = "client!sja",
      name = "a",
      descriptor = "(IIB)V"
   )
   public final void method65(int arg0, int arg1, byte arg2) {
      try {
         ++field100;
         if (arg2 >= -64) {
            this.field115 = false;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field122[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sja",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method66(int arg0) {
      try {
         if (arg0 != 29015) {
            this.field115 = false;
         }

         int var2;
         class104 var3;
         label35: {
            ++field104;
            var2 = super.field3498.method2733(0);
            var3 = super.field3498.method2808(0);
            if (!this.field107) {
               OpenGL.glBindProgramARB(34336, ~var2 != Integer.MIN_VALUE ? this.field106.field6034 : this.field113.field6034);
               if (!client.field4564) {
                  break label35;
               }
            }

            OpenGL.glBindProgramARB(34336, var2 != Integer.MAX_VALUE ? this.field110.field6034 : this.field111.field6034);
         }

         OpenGL.glEnable(34336);
         this.field115 = true;
         var3.method983(-1.0F, (float)var2, (byte)-34, this.field109, 0.0F, 0.0F);
         OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field109[0], this.field109[1], this.field109[2], this.field109[3]);
         this.method74(-1);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field122[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sja",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method67(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         class560.field8152 = arg3;
         ++field121;
         if (arg4 == 0) {
            class678.field9947 = arg0;
            class769.field11198 = arg2;
            class109.field1783 = arg1;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field122[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sja",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method68(int arg0) {
      try {
         ++field118;
         super.field3498.method2767((byte)-112, 1);
         super.field3498.method2806(false, (class47)null);
         super.field3498.method2761(class621.field9036, (byte)-69, class621.field9036);
         super.field3498.method2779(8, 0, class540.field7850);
         super.field3498.method2779(8, 2, class295.field4119);
         super.field3498.method2783(3592, class540.field7850, 0);
         super.field3498.method2767((byte)-112, 0);
         int var2 = -29 / ((arg0 - 27) / 34);
         if (this.field114) {
            super.field3498.method2779(8, 0, class540.field7850);
            super.field3498.method2783(3592, class540.field7850, 0);
            this.field114 = false;
         }

         if (this.field115) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field115 = false;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field122[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sja",
      name = "e",
      descriptor = "(I)Z"
   )
   public final boolean method69(int arg0) {
      try {
         ++field120;
         if (arg0 != 30453) {
            this.method66(-45);
         }

         return this.field103;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field122[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sja",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method70(boolean arg0, boolean arg1) {
      try {
         if (!arg0) {
            this.method65(-114, 72, (byte)-103);
         }

         ++field105;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field122[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sja",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method71(int arg0) {
      try {
         if (arg0 != 1) {
            method71(-126);
         }

         field112 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field122[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sja",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method72(boolean arg0, int arg1) {
      try {
         if (arg1 != -29461) {
            this.field103 = true;
         }

         ++field108;
         this.field107 = arg0;
         super.field3498.method2767((byte)-112, 1);
         super.field3498.method2806(false, this.field117);
         super.field3498.method2761(class226.field3348, (byte)-69, class641.field9348);
         super.field3498.method2779(8, 0, class295.field4119);
         super.field3498.method1177(false, 2, true, class540.field7850, arg1 + 29369);
         super.field3498.method2783(3592, class315.field4537, 0);
         super.field3498.method2767((byte)-112, 0);
         this.method66(arg1 + 58476);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field122[17] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sja",
      name = "a",
      descriptor = "(IILbt;)V"
   )
   public final void method73(int arg0, int arg1, class47 arg2) {
      try {
         if (arg1 <= 12) {
            this.method69(106);
         }

         label40: {
            if (arg2 == null) {
               if (this.field114) {
                  break label40;
               }

               super.field3498.method2806(false, super.field3498.field5295);
               super.field3498.method2738(-104, 1);
               super.field3498.method2779(8, 0, class315.field4537);
               super.field3498.method2783(3592, class315.field4537, 0);
               this.field114 = true;
               if (!client.field4564) {
                  break label40;
               }
            }

            if (this.field114) {
               super.field3498.method2779(8, 0, class540.field7850);
               super.field3498.method2783(3592, class540.field7850, 0);
               this.field114 = false;
            }

            super.field3498.method2806(false, arg2);
            super.field3498.method2738(-112, arg0);
         }

         ++field102;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field122[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field122[1] : field122[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sja",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method74(int arg0) {
      try {
         if (this.field115) {
            int var2 = super.field3498.method437();
            int var3 = super.field3498.method291();
            float var4 = (float)var2 - (float)(-var3 + var2) * 0.125F;
            float var5 = (float)var2 - (float)(-var3 + var2) * 0.25F;
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float)super.field3498.method2750(1), (float)super.field3498.method2770((byte)-41) / 255.0F);
            super.field3498.method2767((byte)-112, 1);
            super.field3498.method2754(super.field3498.method2809(true), (byte)-115);
            super.field3498.method2767((byte)-112, 0);
         }

         if (arg0 != -1) {
            this.method73(49, 87, (class47)null);
         }

         ++field101;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field122[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sja",
      name = "<init>",
      descriptor = "(Lbba;Lhw;)V"
   )
   public class11(class124 arg0, class141 arg1) {
      super(arg0);

      try {
         if (arg1 != null && arg0.field2088) {
            this.field113 = class600.method4433(arg0, arg1.method1348(field122[12], field122[14], 25), 34336, 24048);
            this.field111 = class600.method4433(arg0, arg1.method1348(field122[12], field122[13], 102), 34336, 24048);
            this.field106 = class600.method4433(arg0, arg1.method1348(field122[12], field122[15], 49), 34336, 24048);
            this.field110 = class600.method4433(arg0, arg1.method1348(field122[12], field122[11], 22), 34336, 24048);
            if (!(this.field110 != null & this.field113 != null & this.field111 != null & this.field106 != null)) {
               this.field103 = false;
            } else {
               this.field117 = super.field3498.method2766(false, 2, 1, (byte)104, new int[]{0, -1});
               this.field117.method884(false, -92, false);
               this.field103 = true;
            }
         } else {
            this.field103 = false;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field122[10] + (arg0 != null ? field122[1] : field122[0]) + ',' + (arg1 != null ? field122[1] : field122[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method75(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 96);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method76(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 38;
            break;
         case 1:
            var10005 = 1;
            break;
         case 2:
            var10005 = 77;
            break;
         case 3:
            var10005 = 90;
            break;
         default:
            var10005 = 96;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
