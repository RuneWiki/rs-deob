import jaggl.OpenGL;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class131 extends class575 {
   @OriginalMember(
      owner = "client!rc",
      name = "l",
      descriptor = "Lqc;"
   )
   private class497 field2124;
   @OriginalMember(
      owner = "client!rc",
      name = "u",
      descriptor = "Lqs;"
   )
   private class771 field2113;
   @OriginalMember(
      owner = "client!rc",
      name = "x",
      descriptor = "Lwd;"
   )
   private class79 field2120;
   @OriginalMember(
      owner = "client!rc",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2130 = new String[]{method1341(method1340("Tk")), method1341(method1340("H)U])")), method1341(method1340("Gu\u001a\u001d'Cf\t\u0016:GX\f\u0012 Vu")), method1341(method1340("]r\u0017\u001f")), method1341(method1340("AdUO=]n\u000fM|")), method1341(method1340("AdU0|")), method1341(method1340("AdU4|")), method1341(method1340("AdU |")), method1341(method1340("AdU2|")), method1341(method1340("AdU!|")), method1341(method1340("AdU7|")), method1341(method1340("AdU1|")), method1341(method1340("AdU6|")), method1341(method1340("AdU'|")), method1341(method1340("AdU5|"))};
   @OriginalMember(
      owner = "client!rc",
      name = "y",
      descriptor = "Lhf;"
   )
   public static class198 field2123 = new class198("", 16);
   @OriginalMember(
      owner = "client!rc",
      name = "o",
      descriptor = "I"
   )
   public static int field2126 = -1;
   @OriginalMember(
      owner = "client!rc",
      name = "B",
      descriptor = "I"
   )
   public static int field2127 = -1;
   @OriginalMember(
      owner = "client!rc",
      name = "v",
      descriptor = "I"
   )
   public static int field2114;
   @OriginalMember(
      owner = "client!rc",
      name = "p",
      descriptor = "I"
   )
   public static int field2115;
   @OriginalMember(
      owner = "client!rc",
      name = "w",
      descriptor = "I"
   )
   public static int field2116;
   @OriginalMember(
      owner = "client!rc",
      name = "m",
      descriptor = "I"
   )
   public static int field2117;
   @OriginalMember(
      owner = "client!rc",
      name = "n",
      descriptor = "I"
   )
   public static int field2118;
   @OriginalMember(
      owner = "client!rc",
      name = "z",
      descriptor = "I"
   )
   public static int field2119;
   @OriginalMember(
      owner = "client!rc",
      name = "s",
      descriptor = "I"
   )
   public static int field2121;
   @OriginalMember(
      owner = "client!rc",
      name = "q",
      descriptor = "I"
   )
   public static int field2122;
   @OriginalMember(
      owner = "client!rc",
      name = "A",
      descriptor = "I"
   )
   public static int field2125;
   @OriginalMember(
      owner = "client!rc",
      name = "r",
      descriptor = "I"
   )
   public static int field2128;
   @OriginalMember(
      owner = "client!rc",
      name = "t",
      descriptor = "Ljava/io/FileOutputStream;"
   )
   public static FileOutputStream field2129;

   @OriginalMember(
      owner = "client!rc",
      name = "a",
      descriptor = "(IBLua;Lha;ILju;IILjca;)V"
   )
   public static final void method1336(int arg0, byte arg1, class569 arg2, class17 arg3, int arg4, class270 arg5, int arg6, int arg7, class541 arg8) {
      boolean var9 = client.field10022;

      try {
         ++field2121;
         int var10 = -(arg7 / 2) - 5 + arg0;
         int var11 = arg4 + 2;
         if (arg8.field7593 != 0) {
            arg3.method223(var11, arg7 + 10, 1, var10, arg8.field7593, -var11 + arg4 + arg2.method4215() * arg6 + 1);
         }

         if (arg8.field7594 != 0) {
            arg3.method186(arg7 + 10, -var11 + 1 + (arg4 - -(arg6 * arg2.method4215())), (byte)-11, arg8.field7594, var11, var10);
         }

         int var12 = arg8.field7587;
         if (arg5.field4137 && arg8.field7592 != -1) {
            var12 = arg8.field7592;
         }

         if (arg1 < -42) {
            int var13 = 0;
            if (var9 || ~arg6 < ~var13) {
               do {
                  String var14 = class720.field10314[var13];
                  if (~var13 > ~(arg6 - 1)) {
                     var14 = var14.substring(0, -4 + var14.length());
                  }

                  arg2.method4216(arg3, var14, arg0, arg4, var12, true);
                  arg4 += arg2.method4215();
                  ++var13;
               } while(~arg6 < ~var13);

            }
         }
      } catch (RuntimeException var16) {
         throw class612.method4503(var16, field2130[9] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2130[1] : field2130[3]) + ',' + (arg3 != null ? field2130[1] : field2130[3]) + ',' + arg4 + ',' + (arg5 != null ? field2130[1] : field2130[3]) + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field2130[1] : field2130[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rc",
      name = "c",
      descriptor = "(Z)V"
   )
   public final void method85(boolean arg0) {
      try {
         super.field8129.method2009(0, 0, class339.field5001);
         ++field2116;
         if (arg0) {
            this.method87(true, true);
         }

         OpenGL.glBindProgramARB(34336, 0);
         OpenGL.glDisable(34820);
         OpenGL.glDisable(34336);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2130[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rc",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method86(int arg0) {
      try {
         if (arg0 != 15385) {
            field2123 = null;
         }

         ++field2125;
         return this.field2120 != null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2130[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rc",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method1337(int arg0) {
      try {
         field2123 = null;
         field2129 = null;
         if (arg0 != -9019) {
            method1338((byte)87, true, true, 125, -70);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2130[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rc",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method87(boolean arg0, boolean arg1) {
      try {
         if (!arg1) {
            method1336(-84, (byte)1, (class569)null, (class17)null, 103, (class270)null, 88, 7, (class541)null);
         }

         ++field2115;
         OpenGL.glBindProgramARB(34336, this.field2120.field1249);
         OpenGL.glEnable(34336);
         super.field8129.method2009(0, 0, class77.field1238);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2130[14] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rc",
      name = "a",
      descriptor = "(BZZII)V"
   )
   public static final void method1338(byte arg0, boolean arg1, boolean arg2, int arg3, int arg4) {
      try {
         int var5 = -119 / ((arg0 - -20) / 33);
         ++field2122;
         class283.method2373(class616.field8759.length + -1, 107, arg2, arg3, 0, arg4, arg1);
         class44.field653 = null;
         class379.field5553 = 0;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field2130[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rc",
      name = "a",
      descriptor = "(IIB)V"
   )
   public final void method84(int arg0, int arg1, byte arg2) {
      try {
         if (arg2 <= 61) {
            method1337(-67);
         }

         label18: {
            if (!this.field2124.field7090) {
               int var4 = super.field8129.field3488 % 4000 * 16 / 4000;
               super.field8129.method1943(0, this.field2124.field7085[var4]);
               OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
               if (!client.field10022) {
                  break label18;
               }
            }

            float var5 = (float)(super.field8129.field3488 % 4000) / 4000.0F;
            super.field8129.method1943(0, this.field2124.field7083);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, 0.0F, 0.0F, 1.0F);
         }

         ++field2118;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field2130[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rc",
      name = "a",
      descriptor = "(ZB)V"
   )
   public final void method82(boolean arg0, byte arg1) {
      try {
         if (arg1 != 23) {
            this.method86(-36);
         }

         ++field2114;
         super.field8129.method1945((byte)-86, class717.field10280, class74.field1189);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2130[12] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rc",
      name = "a",
      descriptor = "(IIIIIZIF)[I"
   )
   public static final int[] method1339(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, float arg7) {
      try {
         ++field2117;
         int[] var8 = new int[arg2];
         class76 var9 = new class76();
         var9.field1219 = arg4;
         var9.field1223 = arg1;
         var9.field1212 = arg5;
         if (arg0 != 2) {
            field2128 = 104;
         }

         var9.field1225 = arg6;
         var9.field1221 = (int)(arg7 * 4096.0F);
         var9.field1227 = arg3;
         var9.method270((byte)127);
         class261.method2250(arg2, 1, 32);
         var9.method843(var8, 19077, 0);
         return var8;
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field2130[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rc",
      name = "<init>",
      descriptor = "(Lqs;Lsa;Lqc;)V"
   )
   public class131(class771 arg0, class39 arg1, class497 arg2) {
      super(arg0);

      try {
         this.field2124 = arg2;
         this.field2113 = arg0;
         if (arg1 != null && this.field2124.method3771(true) && this.field2113.field11159) {
            this.field2120 = class644.method4688(this.field2113, (byte)108, 34336, arg1.method458(0, field2130[0], field2130[2]));
         } else {
            this.field2120 = null;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field2130[4] + (arg0 != null ? field2130[1] : field2130[3]) + ',' + (arg1 != null ? field2130[1] : field2130[3]) + ',' + (arg2 != null ? field2130[1] : field2130[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rc",
      name = "a",
      descriptor = "(IZLqf;)V"
   )
   public final void method88(int arg0, boolean arg1, class683 arg2) {
      try {
         ++field2119;
         if (!arg1) {
            field2127 = 97;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field2130[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2130[1] : field2130[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1340(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 84);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1341(char[] arg0) {
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
            var10005 = 7;
            break;
         case 2:
            var10005 = 123;
            break;
         case 3:
            var10005 = 115;
            break;
         default:
            var10005 = 84;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
