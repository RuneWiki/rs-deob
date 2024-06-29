import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pia")
public class class370 extends class117 {
   @OriginalMember(
      owner = "client!pia",
      name = "p",
      descriptor = "Laea;"
   )
   private class678 field5450;
   @OriginalMember(
      owner = "client!pia",
      name = "m",
      descriptor = "Lcfa;"
   )
   private class763 field5447;
   @OriginalMember(
      owner = "client!pia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5451 = new String[]{method2912(method2911("@\u001cY\u000f")), method2912(method2911("UG\u001bML")), method2912(method2911("^\u0000TMt\u0006")), method2912(method2911("^\u0000TM\rG\u0007\\\u0017\u000f\u0006")), method2912(method2911("^\u0000TMu\u0006")), method2912(method2911("^\u0000TMp\u0006")), method2912(method2911("^\u0000TMs\u0006")), method2912(method2911("^\u0000TMr\u0006"))};
   @OriginalMember(
      owner = "client!pia",
      name = "s",
      descriptor = "F"
   )
   public static float field5448;
   @OriginalMember(
      owner = "client!pia",
      name = "l",
      descriptor = "I"
   )
   public static int field5443;
   @OriginalMember(
      owner = "client!pia",
      name = "o",
      descriptor = "I"
   )
   public static int field5444;
   @OriginalMember(
      owner = "client!pia",
      name = "n",
      descriptor = "I"
   )
   public static int field5445;
   @OriginalMember(
      owner = "client!pia",
      name = "r",
      descriptor = "I"
   )
   public static int field5446;
   @OriginalMember(
      owner = "client!pia",
      name = "q",
      descriptor = "I"
   )
   public static int field5449;

   @OriginalMember(
      owner = "client!pia",
      name = "b",
      descriptor = "(III)I"
   )
   public static final int method2907(int arg0, int arg1, int arg2) {
      try {
         ++field5449;
         int var3 = class306.method2518((byte)100, arg0 + 91923, 4, arg2 + 45365) + -128 - (-(class306.method2518((byte)100, arg0 + 37821, 2, arg2 - -10294) + -128 >> 1) + -(class306.method2518((byte)100, arg0, 1, arg2) + -128 >> 2));
         int var4 = (int)((double)var3 * 0.3D) + 35;
         if (var4 < 10) {
            var4 = 10;
            if (!client.field10022) {
               return arg1 != 23629 ? 24 : var4;
            }
         }

         if (~var4 < -61) {
            var4 = 60;
         }

         return arg1 != 23629 ? 24 : var4;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field5451[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pia",
      name = "a",
      descriptor = "(I)Lcfa;"
   )
   public final class763 method1142(int arg0) {
      try {
         ++field5446;
         return arg0 > -70 ? null : this.field5447;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5451[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pia",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method2908(int arg0) {
      try {
         int var1 = -49 % ((arg0 - -57) / 60);
         class444.field6487 = new class272(class765.field10907.method5512(-2, class777.field11340), "", class357.field5276, 1012, -1, 0L, 0, 0, true, false, 0L, true);
         ++field5443;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5451[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pia",
      name = "<init>",
      descriptor = "(Laea;I)V"
   )
   public class370(class678 arg0, int arg1) {
      try {
         this.field5450 = arg0;
         this.field5447 = new class763(arg0, 6408, arg1);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5451[3] + (arg0 != null ? field5451[1] : field5451[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pia",
      name = "a",
      descriptor = "(Lcfa;Lcfa;FI)Z"
   )
   public final boolean method2909(class763 arg0, class763 arg1, float arg2, int arg3) {
      boolean var5 = client.field10022;

      try {
         ++field5444;
         byte var6 = 1;
         class603 var7 = this.field5450.field9810;
         this.field5450.method211(class377.field5507);
         this.field5450.method231();
         this.field5450.method4953((byte)119);
         OpenGL.glMatrixMode(5889);
         OpenGL.glLoadIdentity();
         OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
         OpenGL.glMatrixMode(5888);
         OpenGL.glLoadIdentity();
         OpenGL.glPushAttrib(2048);
         OpenGL.glViewport(0, 0, this.field5447.field10884, this.field5447.field10884);
         this.field5450.method4934(false, (byte)103);
         this.field5450.method4935(false, 3584);
         this.field5450.method4917(2929, false);
         this.field5450.method4894(false, (byte)39);
         this.field5450.method4954(2912, -2);
         this.field5450.method4958(1, false);
         this.field5450.method4921((float)arg3, 0.0F, (byte)69, 0.0F, arg2);
         this.field5450.method4931(34165, 34165, 0);
         this.field5450.method4906(-2, arg1);
         this.field5450.method4958(0, false);
         this.field5450.method4947(false, 1);
         this.field5450.method4906(-2, arg0);
         this.field5450.method4964(true, var7);
         int var8 = 0;
         int var10000;
         if (var5) {
            var10000 = 34069 - -var8;
         } else if (var8 >= 6) {
            var7.method4444(16, 0);
            this.field5450.method4951((byte)26, var7);
            this.field5450.method4958(1, false);
            this.field5450.method4906(-2, (class719)null);
            this.field5450.method4931(8448, 8448, 0);
            this.field5450.method4958(0, false);
            this.field5450.method4906(-2, (class719)null);
            OpenGL.glPopAttrib();
            this.field5450.method150(class377.field5507[0], class377.field5507[1], class377.field5507[2], class377.field5507[3]);
            var10000 = var6;
            if (!var5) {
               if (var6 != 0 && !this.field5450.field9825) {
                  this.field5447.method5211(true);
               }

               return (boolean)var6;
            }
         } else {
            var10000 = 34069 - -var8;
         }

         while(true) {
            while(true) {
               int var9 = var10000;
               var7.method4439(0, (byte)-107, this.field5447, var9);
               var7.method4445(0, (byte)99);
               if (var7.method4442(0)) {
                  label155: {
                     label154: {
                        label153: {
                           label152: {
                              OpenGL.glBegin(7);
                              if (~var9 != -34070) {
                                 if (~var9 == -34071) {
                                    break label152;
                                 }

                                 if (var9 == 34071) {
                                    break label153;
                                 }

                                 if (var9 == 34072) {
                                    break label154;
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
                                    break label155;
                                 }

                                 if (~var9 != -34075) {
                                    break label155;
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
                                    break label155;
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
                                 break label155;
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
                              break label155;
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
                           break label155;
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
                     var7.method4444(16, 0);
                     this.field5450.method4951((byte)26, var7);
                     this.field5450.method4958(1, false);
                     this.field5450.method4906(-2, (class719)null);
                     this.field5450.method4931(8448, 8448, 0);
                     this.field5450.method4958(0, false);
                     this.field5450.method4906(-2, (class719)null);
                     OpenGL.glPopAttrib();
                     this.field5450.method150(class377.field5507[0], class377.field5507[1], class377.field5507[2], class377.field5507[3]);
                     var10000 = var6;
                     if (!var5) {
                        if (var6 != 0 && !this.field5450.field9825) {
                           this.field5447.method5211(true);
                        }

                        return (boolean)var6;
                     }
                  } else {
                     ++var8;
                     if (var8 >= 6) {
                        var7.method4444(16, 0);
                        this.field5450.method4951((byte)26, var7);
                        this.field5450.method4958(1, false);
                        this.field5450.method4906(-2, (class719)null);
                        this.field5450.method4931(8448, 8448, 0);
                        this.field5450.method4958(0, false);
                        this.field5450.method4906(-2, (class719)null);
                        OpenGL.glPopAttrib();
                        this.field5450.method150(class377.field5507[0], class377.field5507[1], class377.field5507[2], class377.field5507[3]);
                        var10000 = var6;
                        if (!var5) {
                           if (var6 != 0 && !this.field5450.field9825) {
                              this.field5447.method5211(true);
                           }

                           return (boolean)var6;
                        }
                     } else {
                        var10000 = 34069 - -var8;
                     }
                  }
               } else {
                  var6 = 0;
                  var7.method4444(16, 0);
                  this.field5450.method4951((byte)26, var7);
                  this.field5450.method4958(1, false);
                  this.field5450.method4906(-2, (class719)null);
                  this.field5450.method4931(8448, 8448, 0);
                  this.field5450.method4958(0, false);
                  this.field5450.method4906(-2, (class719)null);
                  OpenGL.glPopAttrib();
                  this.field5450.method150(class377.field5507[0], class377.field5507[1], class377.field5507[2], class377.field5507[3]);
                  var10000 = var6;
                  if (!var5) {
                     if (var6 != 0 && !this.field5450.field9825) {
                        this.field5447.method5211(true);
                     }

                     return (boolean)var6;
                  }
               }
            }
         }
      } catch (RuntimeException var12) {
         throw class612.method4503(var12, field5451[2] + (arg0 != null ? field5451[1] : field5451[0]) + ',' + (arg1 != null ? field5451[1] : field5451[0]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pia",
      name = "d",
      descriptor = "(B)I"
   )
   public final int method2910(byte arg0) {
      try {
         if (arg0 != 73) {
            return -23;
         } else {
            ++field5445;
            return this.field5447.field10884;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5451[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2911(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 49);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2912(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 46;
            break;
         case 1:
            var10005 = 105;
            break;
         case 2:
            var10005 = 53;
            break;
         case 3:
            var10005 = 99;
            break;
         default:
            var10005 = 49;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
