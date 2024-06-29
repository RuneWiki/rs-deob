import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pja")
public class class42 extends class573 {
   @OriginalMember(
      owner = "client!pja",
      name = "I",
      descriptor = "I"
   )
   private int field484 = -1;
   @OriginalMember(
      owner = "client!pja",
      name = "J",
      descriptor = "I"
   )
   private int field489 = -1;
   @OriginalMember(
      owner = "client!pja",
      name = "z",
      descriptor = "I"
   )
   public int field486;
   @OriginalMember(
      owner = "client!pja",
      name = "A",
      descriptor = "I"
   )
   public int field492;
   @OriginalMember(
      owner = "client!pja",
      name = "y",
      descriptor = "I"
   )
   public int field490;
   @OriginalMember(
      owner = "client!pja",
      name = "F",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field496 = new String[]{method319(method318("\u0017\\\u0010qJ")), method319(method318("\u0002\u0007R3")), method319(method318("\u001c\u0018_q\u000b\u0005\u001cW+\tD")), method319(method318("\u001c\u0018_qvD")), method319(method318("\u001c\u0018_quD")), method319(method318("\u001c\u0018_qtD")), method319(method318("\u001c\u0018_qrD")), method319(method318("\u001c\u0018_qsD"))};
   @OriginalMember(
      owner = "client!pja",
      name = "D",
      descriptor = "Lsg;"
   )
   public static class421 field491 = class694.method5045(-8489);
   @OriginalMember(
      owner = "client!pja",
      name = "w",
      descriptor = "I"
   )
   public static int field494 = 0;
   @OriginalMember(
      owner = "client!pja",
      name = "B",
      descriptor = "Lnm;"
   )
   public static class502 field493 = new class502();
   @OriginalMember(
      owner = "client!pja",
      name = "v",
      descriptor = "I"
   )
   public static int field482;
   @OriginalMember(
      owner = "client!pja",
      name = "x",
      descriptor = "I"
   )
   public static int field485;
   @OriginalMember(
      owner = "client!pja",
      name = "G",
      descriptor = "I"
   )
   public static int field487;
   @OriginalMember(
      owner = "client!pja",
      name = "H",
      descriptor = "I"
   )
   public static int field488;
   @OriginalMember(
      owner = "client!pja",
      name = "C",
      descriptor = "Lpc;"
   )
   public static class701 field495;
   @OriginalMember(
      owner = "client!pja",
      name = "E",
      descriptor = "[I"
   )
   public static int[] field483;

   @OriginalMember(
      owner = "client!pja",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public final void method313(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         ++field487;
         super.field7877.method4848(false, this);
         OpenGL.glCopyTexSubImage3D(super.field7876, 0, arg7, arg0, arg2, arg4, arg5, arg3, arg1);
         if (arg6 != -1) {
            this.field490 = 22;
         }

         OpenGL.glFlush();
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field496[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pja",
      name = "a",
      descriptor = "(IIILaka;)V"
   )
   public static final void method314(int arg0, int arg1, int arg2, class85 arg3) {
      boolean var4 = client.field4273;

      try {
         ++field485;
         if (class666.field9473) {
            int var5 = 0;
            class241 var6 = (class241)arg3.field1105.method3964((byte)-125);
            int var7;
            if (var4) {
               var7 = class244.method1833((byte)97, var6);
               if (~var5 > ~var7) {
                  var5 = var7;
               }

               var6 = (class241)arg3.field1105.method3965(true);
            }

            while(true) {
               int var10000;
               if (var6 == null) {
                  var5 += 8;
                  var10000 = arg3.field1099 * 16;
                  if (!var4) {
                     class746.field10850 = var10000 + (!class336.field4817 ? 22 : 26);
                     if (arg2 != -8270) {
                        return;
                     }

                     int var8 = arg3.field1099 * 16 - -21;
                     int var9 = class67.field776 + class441.field6118;
                     if (~class252.field3194 > ~(var5 + var9)) {
                        var9 = -var5 + class441.field6118;
                     }

                     if (~var9 > -1) {
                        var9 = 0;
                     }

                     int var10 = !class336.field4817 ? 31 : 33;
                     int var11 = -var10 + arg0 + 13;
                     if (~class41.field479 > ~(var11 - -var8)) {
                        var11 = class41.field479 - var8;
                     }

                     class46.field535 = var9;
                     if (var11 < 0) {
                        var11 = 0;
                     }

                     class594.field8244 = var11;
                     class275.field3671 = var5;
                     class423.field5947 = arg3;
                     return;
                  }
               } else {
                  var10000 = class244.method1833((byte)97, var6);
               }

               var7 = var10000;
               if (~var5 > ~var7) {
                  var5 = var7;
               }

               var6 = (class241)arg3.field1105.method3965(true);
            }
         }
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field496[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field496[0] : field496[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pja",
      name = "<init>",
      descriptor = "(Lor;IIII[BI)V"
   )
   public class42(class670 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
      super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);

      try {
         this.field486 = arg4;
         this.field492 = arg2;
         this.field490 = arg3;
         super.field7877.method4848(false, this);
         OpenGL.glPixelStorei(3317, 1);
         OpenGL.glTexImage3Dub(super.field7876, 0, super.field7890, this.field492, this.field490, this.field486, 0, arg6, 5121, arg5, 0);
         OpenGL.glPixelStorei(3317, 4);
         this.method4129(-1323776991, true);
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field496[2] + (arg0 != null ? field496[0] : field496[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field496[0] : field496[1]) + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pja",
      name = "a",
      descriptor = "(Lwia;Z)V"
   )
   public static final void method315(class794 arg0, boolean arg1) {
      boolean var2 = client.field4273;

      try {
         ++field488;
         arg0.field11600 = null;
         int var3 = arg0.field11601.length;
         int var4 = 0;
         if (arg1) {
            method315((class794)null, false);
            if (var2) {
               arg0.field11601[var4].field572 = false;
               ++var4;
            }
         }

         while(true) {
            while(var4 < var3) {
               arg0.field11601[var4].field572 = false;
               ++var4;
            }

            class411[] var5 = class558.field7652;
            synchronized(class558.field7652) {
               if (!var2) {
                  if (~var3 > ~class558.field7652.length && class580.field7964[var3] < 200) {
                     class558.field7652[var3].method3116(arg0, 39);
                     int var10002 = class580.field7964[var3]++;
                  }

                  return;
               }
            }

            ++var4;
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field496[6] + (arg0 != null ? field496[0] : field496[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pja",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method316(int arg0) {
      try {
         int var1 = -26 % ((-24 - arg0) / 63);
         field483 = null;
         field491 = null;
         field493 = null;
         field495 = null;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field496[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pja",
      name = "<init>",
      descriptor = "(Lor;IIII)V"
   )
   public class42(class670 arg0, int arg1, int arg2, int arg3, int arg4) {
      super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);

      try {
         this.field486 = arg4;
         this.field490 = arg3;
         this.field492 = arg2;
         super.field7877.method4848(false, this);
         OpenGL.glTexImage3Dub(super.field7876, 0, super.field7890, this.field492, this.field490, this.field486, 0, class393.method2995(super.field7890, 6410), 5121, (byte[])null, 0);
         this.method4129(-1323776991, true);
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field496[2] + (arg0 != null ? field496[0] : field496[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pja",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method317(int arg0) {
      try {
         OpenGL.glFramebufferTexture3DEXT(this.field484, this.field489, super.field7876, 0, 0, arg0);
         ++field482;
         this.field489 = -1;
         this.field484 = -1;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field496[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method318(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 55);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method319(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 108;
            break;
         case 1:
            var10005 = 114;
            break;
         case 2:
            var10005 = 62;
            break;
         case 3:
            var10005 = 95;
            break;
         default:
            var10005 = 55;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
