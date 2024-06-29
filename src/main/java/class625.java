import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class625 extends class588 {
   @OriginalMember(
      owner = "client!ke",
      name = "n",
      descriptor = "Lea;"
   )
   private class573 field9189;
   @OriginalMember(
      owner = "client!ke",
      name = "m",
      descriptor = "Lwfa;"
   )
   private class212 field9185;
   @OriginalMember(
      owner = "client!ke",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9192 = new String[]{method4544(method4543("\u0013\u0004OP}")), method4544(method4543("\u0013\u0004OW}")), method4544(method4543("\u0013\u0004OQ}")), method4544(method4543("\u0003OO;(")), method4544(method4543("\u0016\u0014\ry")), method4544(method4543("\u0013\u0004OV}")), method4544(method4543("\u0013\u0004OT}")), method4544(method4543("\u0013\u0004O)<\u0016\b\u0015+}"))};
   @OriginalMember(
      owner = "client!ke",
      name = "g",
      descriptor = "I"
   )
   public static int field9187 = 999999;
   @OriginalMember(
      owner = "client!ke",
      name = "i",
      descriptor = "[[Z"
   )
   public static boolean[][] field9186 = new boolean[][]{new boolean[13], {false, false, true, true, true, true, true, false, false, false, false, false, true}, {true, true, true, true, true, true, false, false, false, false, false, false, false}, {true, true, true, false, false, true, true, true, false, false, false, false, false}, {true, false, false, false, false, true, true, true, false, false, false, false, false}, {false, false, true, true, true, true, false, false, false, false, false, false, false}, {false, true, true, true, true, true, false, false, false, false, false, false, true}, {false, true, true, true, true, true, true, true, false, false, false, false, true}, {true, true, false, false, false, false, false, true, false, false, false, false, false}, {true, true, true, true, true, false, false, false, true, true, false, false, false}, {true, false, false, false, true, true, true, true, true, true, false, false, false}, {true, false, true, true, true, true, true, true, false, false, true, true, false}, {true, true, true, true, true, true, true, true, true, true, true, true, true}, new boolean[13], {true, true, true, true, true, true, true, true, true, true, true, true, true}};
   @OriginalMember(
      owner = "client!ke",
      name = "k",
      descriptor = "I"
   )
   public static int field9184;
   @OriginalMember(
      owner = "client!ke",
      name = "h",
      descriptor = "I"
   )
   public static int field9188;
   @OriginalMember(
      owner = "client!ke",
      name = "l",
      descriptor = "I"
   )
   public static int field9190;
   @OriginalMember(
      owner = "client!ke",
      name = "j",
      descriptor = "I"
   )
   public static int field9191;

   @OriginalMember(
      owner = "client!ke",
      name = "a",
      descriptor = "(FILwfa;Lwfa;)Z"
   )
   public final boolean method4539(float arg0, int arg1, class212 arg2, class212 arg3) {
      boolean var5 = client.field4360;

      try {
         ++field9191;
         byte var6 = 1;
         class780 var7 = this.field9189.field8410;
         this.field9189.method605(class565.field8060);
         this.field9189.method574();
         this.field9189.method4116((byte)74);
         OpenGL.glMatrixMode(5889);
         OpenGL.glLoadIdentity();
         OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
         OpenGL.glMatrixMode(5888);
         OpenGL.glLoadIdentity();
         OpenGL.glPushAttrib(2048);
         OpenGL.glViewport(0, 0, this.field9185.field3028, this.field9185.field3028);
         this.field9189.method4106((byte)127, false);
         this.field9189.method4124(120, false);
         this.field9189.method4180((byte)111, false);
         this.field9189.method4148(false, (byte)-64);
         this.field9189.method4105(4, -2);
         this.field9189.method4112((byte)19, 1);
         this.field9189.method4132(0.0F, -30838, 0.0F, 0.0F, arg0);
         if (arg1 > -91) {
            this.field9185 = null;
         }

         this.field9189.method4117(34165, 34165, -1);
         this.field9189.method4107(73, arg3);
         this.field9189.method4112((byte)6, 0);
         this.field9189.method4134(1, 2);
         this.field9189.method4107(21, arg2);
         this.field9189.method4123((byte)89, var7);
         int var8 = 0;
         int var10000;
         if (var5) {
            var10000 = var8 + 34069;
         } else if (~var8 <= -7) {
            var7.method5617(0, -25);
            this.field9189.method4115(true, var7);
            this.field9189.method4112((byte)-9, 1);
            this.field9189.method4107(-126, (class486)null);
            this.field9189.method4117(8448, 8448, -1);
            this.field9189.method4112((byte)-92, 0);
            this.field9189.method4107(-124, (class486)null);
            OpenGL.glPopAttrib();
            this.field9189.method592(class565.field8060[0], class565.field8060[1], class565.field8060[2], class565.field8060[3]);
            var10000 = var6;
            if (!var5) {
               if (var6 != 0 && !this.field9189.field8399) {
                  this.field9185.method3528((byte)-96);
               }

               return (boolean)var6;
            }
         } else {
            var10000 = var8 + 34069;
         }

         while(true) {
            while(true) {
               int var9 = var10000;
               var7.method5614(0, var9, this.field9185, (byte)40);
               var7.method5625(-1, 0);
               if (var7.method5619(false)) {
                  label159: {
                     label158: {
                        label157: {
                           label156: {
                              OpenGL.glBegin(7);
                              if (var9 != 34069) {
                                 if (~var9 == -34071) {
                                    break label156;
                                 }

                                 if (var9 == 34071) {
                                    break label157;
                                 }

                                 if (~var9 == -34073) {
                                    break label158;
                                 }

                                 if (var9 == 34073) {
                                    OpenGL.glTexCoord3i(-65534, 65534, 65535);
                                    OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
                                    OpenGL.glVertex2f(0.0F, 0.0F);
                                    OpenGL.glTexCoord3i(65534, 65534, 65535);
                                    OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
                                    OpenGL.glVertex2f(1.0F, 0.0F);
                                    OpenGL.glTexCoord3i(65534, -65534, 65535);
                                    OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
                                    OpenGL.glVertex2f(1.0F, 1.0F);
                                    OpenGL.glTexCoord3i(-65534, -65534, 65535);
                                    OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
                                    OpenGL.glVertex2f(0.0F, 1.0F);
                                    if (var5) {
                                       OpenGL.glTexCoord3i(65534, 65534, -65535);
                                       OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
                                       OpenGL.glVertex2f(0.0F, 0.0F);
                                       OpenGL.glTexCoord3i(-65534, 65534, -65535);
                                       OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
                                       OpenGL.glVertex2f(1.0F, 0.0F);
                                       OpenGL.glTexCoord3i(-65534, -65534, -65535);
                                       OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
                                       OpenGL.glVertex2f(1.0F, 1.0F);
                                       OpenGL.glTexCoord3i(65534, -65534, -65535);
                                       OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
                                       OpenGL.glVertex2f(0.0F, 1.0F);
                                    }
                                    break label159;
                                 }

                                 if (~var9 != -34075) {
                                    break label159;
                                 }

                                 if (!var5) {
                                    OpenGL.glTexCoord3i(65534, 65534, -65535);
                                    OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
                                    OpenGL.glVertex2f(0.0F, 0.0F);
                                    OpenGL.glTexCoord3i(-65534, 65534, -65535);
                                    OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
                                    OpenGL.glVertex2f(1.0F, 0.0F);
                                    OpenGL.glTexCoord3i(-65534, -65534, -65535);
                                    OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
                                    OpenGL.glVertex2f(1.0F, 1.0F);
                                    OpenGL.glTexCoord3i(65534, -65534, -65535);
                                    OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
                                    OpenGL.glVertex2f(0.0F, 1.0F);
                                    break label159;
                                 }
                              }

                              OpenGL.glTexCoord3i(65535, 65534, 65534);
                              OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
                              OpenGL.glVertex2f(0.0F, 0.0F);
                              OpenGL.glTexCoord3i(65535, 65534, -65534);
                              OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
                              OpenGL.glVertex2f(1.0F, 0.0F);
                              OpenGL.glTexCoord3i(65535, -65534, -65534);
                              OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
                              OpenGL.glVertex2f(1.0F, 1.0F);
                              OpenGL.glTexCoord3i(65535, -65534, 65534);
                              OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
                              OpenGL.glVertex2f(0.0F, 1.0F);
                              if (!var5) {
                                 break label159;
                              }
                           }

                           OpenGL.glTexCoord3i(-65535, 65534, -65534);
                           OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
                           OpenGL.glVertex2f(0.0F, 0.0F);
                           OpenGL.glTexCoord3i(-65535, 65534, 65534);
                           OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
                           OpenGL.glVertex2f(1.0F, 0.0F);
                           OpenGL.glTexCoord3i(-65535, -65534, 65534);
                           OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
                           OpenGL.glVertex2f(1.0F, 1.0F);
                           OpenGL.glTexCoord3i(-65535, -65534, -65534);
                           OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
                           OpenGL.glVertex2f(0.0F, 1.0F);
                           if (!var5) {
                              break label159;
                           }
                        }

                        OpenGL.glTexCoord3i(-65534, 65535, -65534);
                        OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
                        OpenGL.glVertex2f(0.0F, 0.0F);
                        OpenGL.glTexCoord3i(65534, 65535, -65534);
                        OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
                        OpenGL.glVertex2f(1.0F, 0.0F);
                        OpenGL.glTexCoord3i(65534, 65535, 65534);
                        OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
                        OpenGL.glVertex2f(1.0F, 1.0F);
                        OpenGL.glTexCoord3i(-65534, 65535, 65534);
                        OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
                        OpenGL.glVertex2f(0.0F, 1.0F);
                        if (!var5) {
                           break label159;
                        }
                     }

                     OpenGL.glTexCoord3i(-65534, -65535, 65534);
                     OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
                     OpenGL.glVertex2f(0.0F, 0.0F);
                     OpenGL.glTexCoord3i(65534, -65535, 65534);
                     OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
                     OpenGL.glVertex2f(1.0F, 0.0F);
                     OpenGL.glTexCoord3i(65534, -65535, -65534);
                     OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
                     OpenGL.glVertex2f(1.0F, 1.0F);
                     OpenGL.glTexCoord3i(-65534, -65535, -65534);
                     OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
                     OpenGL.glVertex2f(0.0F, 1.0F);
                     if (var5) {
                        OpenGL.glTexCoord3i(-65534, 65534, 65535);
                        OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
                        OpenGL.glVertex2f(0.0F, 0.0F);
                        OpenGL.glTexCoord3i(65534, 65534, 65535);
                        OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
                        OpenGL.glVertex2f(1.0F, 0.0F);
                        OpenGL.glTexCoord3i(65534, -65534, 65535);
                        OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
                        OpenGL.glVertex2f(1.0F, 1.0F);
                        OpenGL.glTexCoord3i(-65534, -65534, 65535);
                        OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
                        OpenGL.glVertex2f(0.0F, 1.0F);
                        if (var5) {
                           OpenGL.glTexCoord3i(65534, 65534, -65535);
                           OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
                           OpenGL.glVertex2f(0.0F, 0.0F);
                           OpenGL.glTexCoord3i(-65534, 65534, -65535);
                           OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
                           OpenGL.glVertex2f(1.0F, 0.0F);
                           OpenGL.glTexCoord3i(-65534, -65534, -65535);
                           OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
                           OpenGL.glVertex2f(1.0F, 1.0F);
                           OpenGL.glTexCoord3i(65534, -65534, -65535);
                           OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
                           OpenGL.glVertex2f(0.0F, 1.0F);
                        }
                     }
                  }

                  OpenGL.glEnd();
                  if (var5) {
                     var6 = 0;
                     var7.method5617(0, -25);
                     this.field9189.method4115(true, var7);
                     this.field9189.method4112((byte)-9, 1);
                     this.field9189.method4107(-126, (class486)null);
                     this.field9189.method4117(8448, 8448, -1);
                     this.field9189.method4112((byte)-92, 0);
                     this.field9189.method4107(-124, (class486)null);
                     OpenGL.glPopAttrib();
                     this.field9189.method592(class565.field8060[0], class565.field8060[1], class565.field8060[2], class565.field8060[3]);
                     var10000 = var6;
                     if (!var5) {
                        if (var6 != 0 && !this.field9189.field8399) {
                           this.field9185.method3528((byte)-96);
                        }

                        return (boolean)var6;
                     }
                  } else {
                     ++var8;
                     if (~var8 <= -7) {
                        var7.method5617(0, -25);
                        this.field9189.method4115(true, var7);
                        this.field9189.method4112((byte)-9, 1);
                        this.field9189.method4107(-126, (class486)null);
                        this.field9189.method4117(8448, 8448, -1);
                        this.field9189.method4112((byte)-92, 0);
                        this.field9189.method4107(-124, (class486)null);
                        OpenGL.glPopAttrib();
                        this.field9189.method592(class565.field8060[0], class565.field8060[1], class565.field8060[2], class565.field8060[3]);
                        var10000 = var6;
                        if (!var5) {
                           if (var6 != 0 && !this.field9189.field8399) {
                              this.field9185.method3528((byte)-96);
                           }

                           return (boolean)var6;
                        }
                     } else {
                        var10000 = var8 + 34069;
                     }
                  }
               } else {
                  var6 = 0;
                  var7.method5617(0, -25);
                  this.field9189.method4115(true, var7);
                  this.field9189.method4112((byte)-9, 1);
                  this.field9189.method4107(-126, (class486)null);
                  this.field9189.method4117(8448, 8448, -1);
                  this.field9189.method4112((byte)-92, 0);
                  this.field9189.method4107(-124, (class486)null);
                  OpenGL.glPopAttrib();
                  this.field9189.method592(class565.field8060[0], class565.field8060[1], class565.field8060[2], class565.field8060[3]);
                  var10000 = var6;
                  if (!var5) {
                     if (var6 != 0 && !this.field9189.field8399) {
                        this.field9185.method3528((byte)-96);
                     }

                     return (boolean)var6;
                  }
               }
            }
         }
      } catch (RuntimeException var12) {
         throw class237.method1823(var12, field9192[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9192[3] : field9192[4]) + ',' + (arg3 != null ? field9192[3] : field9192[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ke",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method4540(boolean arg0) {
      try {
         if (!arg0) {
            field9187 = 95;
         }

         field9186 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field9192[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ke",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method4541(int arg0) {
      try {
         ++field9184;
         return arg0 != -65535 ? -54 : this.field9185.field3028;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9192[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ke",
      name = "b",
      descriptor = "(I)Lwfa;"
   )
   public final class212 method484(int arg0) {
      try {
         if (arg0 != -10) {
            this.method484(-40);
         }

         ++field9188;
         return this.field9185;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9192[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ke",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method4542(boolean arg0) {
      try {
         class394.field5701 = -2;
         class542.field7787 = 0;
         if (arg0) {
            method4542(false);
         }

         ++field9190;
         class722.field10544 = -2;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field9192[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ke",
      name = "<init>",
      descriptor = "(Lea;I)V"
   )
   public class625(class573 arg0, int arg1) {
      try {
         this.field9189 = arg0;
         this.field9185 = new class212(arg0, 6408, arg1);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field9192[7] + (arg0 != null ? field9192[3] : field9192[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ke",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4543(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 85);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ke",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4544(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 120;
            break;
         case 1:
            var10005 = 97;
            break;
         case 2:
            var10005 = 97;
            break;
         case 3:
            var10005 = 21;
            break;
         default:
            var10005 = 85;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
