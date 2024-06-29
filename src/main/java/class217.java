import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class217 extends class486 implements class610 {
   @OriginalMember(
      owner = "client!hi",
      name = "A",
      descriptor = "I"
   )
   private int field2701;
   @OriginalMember(
      owner = "client!hi",
      name = "H",
      descriptor = "I"
   )
   private int field2703;
   @OriginalMember(
      owner = "client!hi",
      name = "L",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2705 = new String[]{method1655(method1654("^\u0012R)R")), method1655(method1654("MURE\u0007")), method1655(method1654("KI\u0010k")), method1655(method1654("MURN\u0007")), method1655(method1654("MURA\u0007")), method1655(method1654("MURD\u0007")), method1655(method1654("MURB\u0007")), method1655(method1654("MUR;FKU\b9\u0007")), method1655(method1654("MURO\u0007")), method1655(method1654("MURF\u0007")), method1655(method1654("MURM\u0007")), method1655(method1654("MURL\u0007")), method1655(method1654("MURC\u0007")), method1655(method1654("MUR@\u0007"))};
   @OriginalMember(
      owner = "client!hi",
      name = "D",
      descriptor = "I"
   )
   public static int field2692;
   @OriginalMember(
      owner = "client!hi",
      name = "F",
      descriptor = "I"
   )
   public static int field2693;
   @OriginalMember(
      owner = "client!hi",
      name = "C",
      descriptor = "I"
   )
   public static int field2694;
   @OriginalMember(
      owner = "client!hi",
      name = "J",
      descriptor = "I"
   )
   public static int field2695;
   @OriginalMember(
      owner = "client!hi",
      name = "I",
      descriptor = "I"
   )
   public static int field2696;
   @OriginalMember(
      owner = "client!hi",
      name = "B",
      descriptor = "I"
   )
   public static int field2697;
   @OriginalMember(
      owner = "client!hi",
      name = "E",
      descriptor = "I"
   )
   public static int field2698;
   @OriginalMember(
      owner = "client!hi",
      name = "z",
      descriptor = "I"
   )
   public static int field2699;
   @OriginalMember(
      owner = "client!hi",
      name = "y",
      descriptor = "I"
   )
   public static int field2700;
   @OriginalMember(
      owner = "client!hi",
      name = "G",
      descriptor = "I"
   )
   public static int field2702;
   @OriginalMember(
      owner = "client!hi",
      name = "K",
      descriptor = "I"
   )
   public static int field2704;

   @OriginalMember(
      owner = "client!hi",
      name = "a",
      descriptor = "(IILtga;IIIB[FI)V"
   )
   public final void method1652(int arg0, int arg1, class63 arg2, int arg3, int arg4, int arg5, byte arg6, float[] arg7, int arg8) {
      try {
         ++field2694;
         super.field6694.method2581(this, 112);
         OpenGL.glPixelStorei(3314, arg1);
         int var10 = -71 / ((44 - arg6) / 34);
         OpenGL.glTexSubImage2Df(super.field6681, 0, arg3, arg0, arg8, arg4, class133.method1124(arg2, 217), 5121, arg7, arg5);
         OpenGL.glPixelStorei(3314, 0);
      } catch (RuntimeException var12) {
         throw class534.method3846(var12, field2705[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2705[0] : field2705[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field2705[0] : field2705[2]) + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hi",
      name = "<init>",
      descriptor = "(Lkfa;IIZ[III)V"
   )
   public class217(class632 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
      super(arg0, 3553, class622.field8682, class335.field4803, arg1 * arg2, arg3);

      try {
         this.field2701 = arg2;
         this.field2703 = arg1;
         super.field6694.method2581(this, 107);
         if (arg3 && arg6 == 0 && arg5 == 0) {
            this.method3536(255, super.field6681, arg2, arg1, arg4);
         } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field6681, 0, 6408, this.field2703, this.field2701, 0, 32993, super.field6694.field8941, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field2705[7] + (arg0 != null ? field2705[0] : field2705[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field2705[0] : field2705[2]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hi",
      name = "<init>",
      descriptor = "(Lkfa;Ltga;IIZ[FII)V"
   )
   public class217(class632 arg0, class63 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
      super(arg0, 3553, arg1, class335.field4807, arg2 * arg3, arg4);

      try {
         this.field2703 = arg2;
         this.field2701 = arg3;
         super.field6694.method2581(this, 105);
         if (!arg4 && ~arg7 == -1 && arg6 == 0) {
            this.method3535(arg2, false, arg5, arg3, super.field6681);
         } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field6681, 0, this.method3537((byte)-54), arg2, arg3, 0, class133.method1124(super.field6695, 217), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field2705[7] + (arg0 != null ? field2705[0] : field2705[2]) + ',' + (arg1 != null ? field2705[0] : field2705[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field2705[0] : field2705[2]) + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hi",
      name = "a",
      descriptor = "(BF)F"
   )
   public final float method42(byte arg0, float arg1) {
      try {
         if (arg0 != 15) {
            this.method45(3);
         }

         ++field2700;
         return arg1 / (float)this.field2703;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2705[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hi",
      name = "a",
      descriptor = "(IIIII[III)V"
   )
   public final void method35(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7) {
      try {
         super.field6694.method2581(this, -115);
         ++field2704;
         OpenGL.glPixelStorei(3314, arg6);
         OpenGL.glTexSubImage2Di(super.field6681, 0, arg3, arg4, arg1, arg2, 32993, super.field6694.field8941, arg5, arg0);
         OpenGL.glPixelStorei(3314, 0);
         if (arg7 != -16856) {
            this.method44((byte)-96);
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field2705[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field2705[0] : field2705[2]) + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hi",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method45(int arg0) {
      try {
         if (arg0 != -23234) {
            return true;
         } else {
            ++field2692;
            return true;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2705[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hi",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method44(byte arg0) {
      try {
         if (arg0 != 64) {
            this.method44((byte)108);
         }

         ++field2696;
         return this.field2703;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2705[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hi",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method39(int arg0) {
      try {
         if (arg0 > -14) {
            this.method36(-13, false, false);
         }

         ++field2698;
         return this.field2701;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2705[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hi",
      name = "f",
      descriptor = "(I)V"
   )
   public static final void method1653(int arg0) {
      try {
         ++field2699;
         class639.field9015 = arg0;
         class14.field189 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2705[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hi",
      name = "a",
      descriptor = "(III[IIII)V"
   )
   public final void method46(int param1, int param2, int param3, int[] param4, int param5, int param6, int param7) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!hi",
      name = "<init>",
      descriptor = "(Lkfa;Ltga;Liw;II)V"
   )
   public class217(class632 arg0, class63 arg1, class335 arg2, int arg3, int arg4) {
      super(arg0, 3553, arg1, arg2, arg3 * arg4, false);

      try {
         this.field2703 = arg3;
         this.field2701 = arg4;
         super.field6694.method2581(this, 123);
         OpenGL.glTexImage2Dub(super.field6681, 0, this.method3537((byte)112), arg3, arg4, 0, class133.method1124(super.field6695, 217), class317.method2377(super.field6698, (byte)-66), (byte[])null, 0);
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field2705[7] + (arg0 != null ? field2705[0] : field2705[2]) + ',' + (arg1 != null ? field2705[0] : field2705[2]) + ',' + (arg2 != null ? field2705[0] : field2705[2]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hi",
      name = "a",
      descriptor = "(IZZ)V"
   )
   public final void method36(int arg0, boolean arg1, boolean arg2) {
      try {
         if (arg0 != 10251) {
            this.method35(-92, -23, 28, -123, -117, (int[])null, -14, 124);
         }

         ++field2695;
         super.field6694.method2581(this, 126);
         OpenGL.glTexParameteri(super.field6681, 10242, !arg2 ? 33071 : 10497);
         OpenGL.glTexParameteri(super.field6681, 10243, arg1 ? 10497 : 33071);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field2705[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hi",
      name = "a",
      descriptor = "(FI)F"
   )
   public final float method37(float arg0, int arg1) {
      try {
         ++field2702;
         if (arg1 >= -29) {
            this.method39(-97);
         }

         return arg0 / (float)this.field2701;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2705[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hi",
      name = "a",
      descriptor = "(II[BLtga;IIZII)V"
   )
   public final void method38(int arg0, int arg1, byte[] arg2, class63 arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
      try {
         ++field2693;
         super.field6694.method2581(this, -49);
         OpenGL.glPixelStorei(3317, 1);
         OpenGL.glPixelStorei(3314, arg7);
         OpenGL.glTexSubImage2Dub(super.field6681, 0, arg0, arg5, arg8, arg4, class133.method1124(arg3, 217), 5121, arg2, arg1);
         OpenGL.glPixelStorei(3314, 0);
         if (arg6) {
            OpenGL.glPixelStorei(3317, 4);
         }
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field2705[13] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2705[0] : field2705[2]) + ',' + (arg3 != null ? field2705[0] : field2705[2]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hi",
      name = "<init>",
      descriptor = "(Lkfa;Ltga;IIZ[BII)V"
   )
   public class217(class632 arg0, class63 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
      super(arg0, 3553, arg1, class335.field4803, arg2 * arg3, arg4);

      try {
         label53: {
            this.field2701 = arg3;
            this.field2703 = arg2;
            super.field6694.method2581(this, 22);
            OpenGL.glPixelStorei(3317, 1);
            if (!arg4 || ~arg7 != -1 || arg6 != 0) {
               OpenGL.glPixelStorei(3314, arg7);
               OpenGL.glTexImage2Dub(super.field6681, 0, this.method3537((byte)-96), arg2, arg3, 0, class133.method1124(super.field6695, 217), 5121, arg5, arg6);
               OpenGL.glPixelStorei(3314, 0);
               if (!client.field4273) {
                  break label53;
               }
            }

            this.method3529((byte)127, arg5, arg3, arg2, super.field6681);
         }

         OpenGL.glPixelStorei(3317, 4);
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field2705[7] + (arg0 != null ? field2705[0] : field2705[2]) + ',' + (arg1 != null ? field2705[0] : field2705[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field2705[0] : field2705[2]) + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1654(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 47);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1655(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 37;
            break;
         case 1:
            var10005 = 60;
            break;
         case 2:
            var10005 = 124;
            break;
         case 3:
            var10005 = 7;
            break;
         default:
            var10005 = 47;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
