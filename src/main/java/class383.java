import jaggl.OpenGL;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class383 {
   @OriginalMember(
      owner = "client!ll",
      name = "d",
      descriptor = "I"
   )
   private int field5867;
   @OriginalMember(
      owner = "client!ll",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5874 = new String[]{method2951(method2950("&GJIY")), method2951(method2950("&GJOY")), method2951(method2950("$^\ba")), method2951(method2950("&GJ1\u0018$B\u00103Y")), method2951(method2950("1\u0005J#\f")), method2951(method2950("&GJNY")), method2951(method2950("&GJHY")), method2951(method2950("&GJLY")), method2951(method2950("&GJKY"))};
   @OriginalMember(
      owner = "client!ll",
      name = "c",
      descriptor = "I"
   )
   public static int field5866;
   @OriginalMember(
      owner = "client!ll",
      name = "a",
      descriptor = "I"
   )
   public static int field5868;
   @OriginalMember(
      owner = "client!ll",
      name = "g",
      descriptor = "I"
   )
   public static int field5869;
   @OriginalMember(
      owner = "client!ll",
      name = "f",
      descriptor = "I"
   )
   public static int field5870;
   @OriginalMember(
      owner = "client!ll",
      name = "b",
      descriptor = "I"
   )
   public static int field5871;
   @OriginalMember(
      owner = "client!ll",
      name = "h",
      descriptor = "I"
   )
   public static int field5872;
   @OriginalMember(
      owner = "client!ll",
      name = "e",
      descriptor = "I"
   )
   public static int field5873;

   @OriginalMember(
      owner = "client!ll",
      name = "a",
      descriptor = "([BB)Lat;",
      line = 5
   )
   public static final class396 method2944(byte[] arg0, byte arg1) {
      try {
         ++field5873;
         if (arg1 <= 56) {
            method2944((byte[])null, (byte)-6);
         }

         if (arg0 == null) {
            throw new RuntimeException("");
         } else {
            while(true) {
               try {
                  Image var2 = Toolkit.getDefaultToolkit().createImage(arg0);
                  MediaTracker var3 = new MediaTracker(class158.field2008);
                  var3.addImage(var2, 0);
                  var3.waitForAll();
                  int var4 = var2.getWidth(class158.field2008);
                  int var5 = var2.getHeight(class158.field2008);
                  if (!var3.isErrorAny() && ~var4 <= -1 && var5 >= 0) {
                     int[] var6 = new int[var4 * var5];
                     PixelGrabber var7 = new PixelGrabber(var2, 0, 0, var4, var5, var6, 0, var4);
                     var7.grabPixels();
                     return class786.field11439.method589(var4, 0, 0, var6, var4, var5);
                  }

                  throw new RuntimeException("");
               } catch (InterruptedException var9) {
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field5874[8] + (arg0 != null ? field5874[4] : field5874[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "a",
      descriptor = "(BC)Z",
      line = 45
   )
   public static final boolean method2945(byte arg0, char arg1) {
      try {
         int var2 = -110 % ((34 - arg0) / 42);
         ++field5870;
         return ~arg1 <= -49 && ~arg1 >= -58;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5874[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "a",
      descriptor = "(I)V",
      line = 56
   )
   public final void method2946(int arg0) {
      try {
         ++field5868;
         if (arg0 == 407554050) {
            OpenGL.glEndList();
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5874[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "b",
      descriptor = "(I)V",
      line = 71
   )
   public static final void method2947(int arg0) {
      int var1 = client.field4530;

      try {
         if (arg0 != 31332) {
            method2944((byte[])null, (byte)112);
         }

         ++field5869;
         short var2 = 1024;
         short var3 = 3072;
         if (class88.field1076) {
            var3 = 4096;
            if (class485.field7180) {
               var2 = 2048;
            }
         }

         if ((float)var2 > class317.field4533) {
            class317.field4533 = (float)var2;
            if (var1 != 0) {
               class56.field706 -= 16384.0F;
            }
         }

         while(true) {
            float var10000;
            float var10001;
            if (!(class56.field706 >= 16384.0F)) {
               var10000 = (float)var3;
               var10001 = class317.field4533;
               if (var1 == 0) {
                  if (var10000 < var10001) {
                     class317.field4533 = (float)var3;
                     if (var1 != 0) {
                        class56.field706 += 16384.0F;
                     }
                  }

                  while(class56.field706 < 0.0F) {
                     class56.field706 += 16384.0F;
                  }

                  int var4 = class573.field8527 >> 9;
                  int var5 = class747.field11068 >> 9;
                  int var6 = class368.method2858(class747.field11068, (byte)-11, class573.field8527, class551.field8158);
                  int var7 = 0;
                  int var8;
                  int var9;
                  int var10;
                  int var11;
                  int var12;
                  if (var4 > 3) {
                     if (var5 > 3) {
                        if (~(class323.field4603 + -4) < ~var4) {
                           if (var5 < class178.field2197 + -4) {
                              var8 = var4 + -4;
                              if (var1 != 0) {
                                 var9 = -4 + var5;
                                 if (var1 != 0) {
                                    var10 = class551.field8158;
                                    if (~var10 > -4 && class598.method4378(var8, (byte)-64, var9)) {
                                       ++var10;
                                    }

                                    var11 = 0;
                                    if (class221.field2832.field7615 != null && class221.field2832.field7615[var10] != null) {
                                       var11 = (255 & class221.field2832.field7615[var10][var8][var9]) * 8 << 2;
                                    }

                                    if (class377.field5711 != null && class377.field5711[var10] != null) {
                                       var12 = var6 + -class377.field5711[var10].method2235(var9, arg0 ^ 2116943789, var8) + var11;
                                       if (~var12 < ~var7) {
                                          var7 = var12;
                                       }
                                    }

                                    ++var9;
                                 }
                              } else if (~var8 < ~(var4 + 4)) {
                                 var8 = (var7 >> 2) * 1536;
                                 if (var1 == 0) {
                                    if (var8 > 786432) {
                                       var8 = 786432;
                                    }

                                    if (~var8 > -262145) {
                                       var8 = 262144;
                                    }

                                    if (var8 <= class781.field11398) {
                                       if (class781.field11398 > var8) {
                                          class781.field11398 += (-class781.field11398 + var8) / 80;
                                          return;
                                       }
                                    } else {
                                       class781.field11398 += (var8 - class781.field11398) / 24;
                                    }

                                    return;
                                 }

                                 var9 = var8 + 786432;
                                 if (var1 != 0) {
                                    var10 = class551.field8158;
                                    if (~var10 > -4 && class598.method4378(var8, (byte)-64, var9)) {
                                       ++var10;
                                    }

                                    var11 = 0;
                                    if (class221.field2832.field7615 != null && class221.field2832.field7615[var10] != null) {
                                       var11 = (255 & class221.field2832.field7615[var10][var8][var9]) * 8 << 2;
                                    }

                                    if (class377.field5711 != null && class377.field5711[var10] != null) {
                                       var12 = var6 + -class377.field5711[var10].method2235(var9, arg0 ^ 2116943789, var8) + var11;
                                       if (~var12 < ~var7) {
                                          var7 = var12;
                                       }
                                    }

                                    ++var9;
                                 }
                              } else {
                                 var9 = -4 + var5;
                                 if (var1 != 0) {
                                    var10 = class551.field8158;
                                    if (~var10 > -4 && class598.method4378(var8, (byte)-64, var9)) {
                                       ++var10;
                                    }

                                    var11 = 0;
                                    if (class221.field2832.field7615 != null && class221.field2832.field7615[var10] != null) {
                                       var11 = (255 & class221.field2832.field7615[var10][var8][var9]) * 8 << 2;
                                    }

                                    if (class377.field5711 != null && class377.field5711[var10] != null) {
                                       var12 = var6 + -class377.field5711[var10].method2235(var9, arg0 ^ 2116943789, var8) + var11;
                                       if (~var12 < ~var7) {
                                          var7 = var12;
                                       }
                                    }

                                    ++var9;
                                 }
                              }
                           } else {
                              var8 = (var7 >> 2) * 1536;
                              if (var1 == 0) {
                                 if (var8 > 786432) {
                                    var8 = 786432;
                                 }

                                 if (~var8 > -262145) {
                                    var8 = 262144;
                                 }

                                 if (var8 <= class781.field11398) {
                                    if (class781.field11398 > var8) {
                                       class781.field11398 += (-class781.field11398 + var8) / 80;
                                       return;
                                    }
                                 } else {
                                    class781.field11398 += (var8 - class781.field11398) / 24;
                                 }

                                 return;
                              }

                              var9 = var8 + 786432;
                              if (var1 != 0) {
                                 var10 = class551.field8158;
                                 if (~var10 > -4 && class598.method4378(var8, (byte)-64, var9)) {
                                    ++var10;
                                 }

                                 var11 = 0;
                                 if (class221.field2832.field7615 != null && class221.field2832.field7615[var10] != null) {
                                    var11 = (255 & class221.field2832.field7615[var10][var8][var9]) * 8 << 2;
                                 }

                                 if (class377.field5711 != null && class377.field5711[var10] != null) {
                                    var12 = var6 + -class377.field5711[var10].method2235(var9, arg0 ^ 2116943789, var8) + var11;
                                    if (~var12 < ~var7) {
                                       var7 = var12;
                                    }
                                 }

                                 ++var9;
                              }
                           }
                        } else {
                           var8 = (var7 >> 2) * 1536;
                           if (var1 == 0) {
                              if (var8 > 786432) {
                                 var8 = 786432;
                              }

                              if (~var8 > -262145) {
                                 var8 = 262144;
                              }

                              if (var8 <= class781.field11398) {
                                 if (class781.field11398 > var8) {
                                    class781.field11398 += (-class781.field11398 + var8) / 80;
                                    return;
                                 }
                              } else {
                                 class781.field11398 += (var8 - class781.field11398) / 24;
                              }

                              return;
                           }

                           var9 = var8 + 786432;
                           if (var1 != 0) {
                              var10 = class551.field8158;
                              if (~var10 > -4 && class598.method4378(var8, (byte)-64, var9)) {
                                 ++var10;
                              }

                              var11 = 0;
                              if (class221.field2832.field7615 != null && class221.field2832.field7615[var10] != null) {
                                 var11 = (255 & class221.field2832.field7615[var10][var8][var9]) * 8 << 2;
                              }

                              if (class377.field5711 != null && class377.field5711[var10] != null) {
                                 var12 = var6 + -class377.field5711[var10].method2235(var9, arg0 ^ 2116943789, var8) + var11;
                                 if (~var12 < ~var7) {
                                    var7 = var12;
                                 }
                              }

                              ++var9;
                           }
                        }
                     } else {
                        var8 = (var7 >> 2) * 1536;
                        if (var1 == 0) {
                           if (var8 > 786432) {
                              var8 = 786432;
                           }

                           if (~var8 > -262145) {
                              var8 = 262144;
                           }

                           if (var8 <= class781.field11398) {
                              if (class781.field11398 > var8) {
                                 class781.field11398 += (-class781.field11398 + var8) / 80;
                                 return;
                              }
                           } else {
                              class781.field11398 += (var8 - class781.field11398) / 24;
                           }

                           return;
                        }

                        var9 = var8 + 786432;
                        if (var1 != 0) {
                           var10 = class551.field8158;
                           if (~var10 > -4 && class598.method4378(var8, (byte)-64, var9)) {
                              ++var10;
                           }

                           var11 = 0;
                           if (class221.field2832.field7615 != null && class221.field2832.field7615[var10] != null) {
                              var11 = (255 & class221.field2832.field7615[var10][var8][var9]) * 8 << 2;
                           }

                           if (class377.field5711 != null && class377.field5711[var10] != null) {
                              var12 = var6 + -class377.field5711[var10].method2235(var9, arg0 ^ 2116943789, var8) + var11;
                              if (~var12 < ~var7) {
                                 var7 = var12;
                              }
                           }

                           ++var9;
                        }
                     }
                  } else {
                     var8 = (var7 >> 2) * 1536;
                     if (var1 == 0) {
                        if (var8 > 786432) {
                           var8 = 786432;
                        }

                        if (~var8 > -262145) {
                           var8 = 262144;
                        }

                        if (var8 <= class781.field11398) {
                           if (class781.field11398 > var8) {
                              class781.field11398 += (-class781.field11398 + var8) / 80;
                              return;
                           }
                        } else {
                           class781.field11398 += (var8 - class781.field11398) / 24;
                        }

                        return;
                     }

                     var9 = var8 + 786432;
                     if (var1 != 0) {
                        var10 = class551.field8158;
                        if (~var10 > -4 && class598.method4378(var8, (byte)-64, var9)) {
                           ++var10;
                        }

                        var11 = 0;
                        if (class221.field2832.field7615 != null && class221.field2832.field7615[var10] != null) {
                           var11 = (255 & class221.field2832.field7615[var10][var8][var9]) * 8 << 2;
                        }

                        if (class377.field5711 != null && class377.field5711[var10] != null) {
                           var12 = var6 + -class377.field5711[var10].method2235(var9, arg0 ^ 2116943789, var8) + var11;
                           if (~var12 < ~var7) {
                              var7 = var12;
                           }
                        }

                        ++var9;
                     }
                  }

                  while(true) {
                     while(~var9 >= ~(var5 + 4)) {
                        var10 = class551.field8158;
                        if (~var10 > -4 && class598.method4378(var8, (byte)-64, var9)) {
                           ++var10;
                        }

                        var11 = 0;
                        if (class221.field2832.field7615 != null && class221.field2832.field7615[var10] != null) {
                           var11 = (255 & class221.field2832.field7615[var10][var8][var9]) * 8 << 2;
                        }

                        if (class377.field5711 != null && class377.field5711[var10] != null) {
                           var12 = var6 + -class377.field5711[var10].method2235(var9, arg0 ^ 2116943789, var8) + var11;
                           if (~var12 < ~var7) {
                              var7 = var12;
                           }
                        }

                        ++var9;
                     }

                     ++var8;
                     if (~var8 < ~(var4 + 4)) {
                        var8 = (var7 >> 2) * 1536;
                        if (var1 == 0) {
                           if (var8 > 786432) {
                              var8 = 786432;
                           }

                           if (~var8 > -262145) {
                              var8 = 262144;
                           }

                           if (var8 <= class781.field11398) {
                              if (class781.field11398 > var8) {
                                 class781.field11398 += (-class781.field11398 + var8) / 80;
                                 return;
                              }
                           } else {
                              class781.field11398 += (var8 - class781.field11398) / 24;
                           }

                           return;
                        }

                        var9 = var8 + 786432;
                        if (var1 != 0) {
                           var10 = class551.field8158;
                           if (~var10 > -4 && class598.method4378(var8, (byte)-64, var9)) {
                              ++var10;
                           }

                           var11 = 0;
                           if (class221.field2832.field7615 != null && class221.field2832.field7615[var10] != null) {
                              var11 = (255 & class221.field2832.field7615[var10][var8][var9]) * 8 << 2;
                           }

                           if (class377.field5711 != null && class377.field5711[var10] != null) {
                              var12 = var6 + -class377.field5711[var10].method2235(var9, arg0 ^ 2116943789, var8) + var11;
                              if (~var12 < ~var7) {
                                 var7 = var12;
                              }
                           }

                           ++var9;
                        }
                     } else {
                        var9 = -4 + var5;
                        if (var1 != 0) {
                           var10 = class551.field8158;
                           if (~var10 > -4 && class598.method4378(var8, (byte)-64, var9)) {
                              ++var10;
                           }

                           var11 = 0;
                           if (class221.field2832.field7615 != null && class221.field2832.field7615[var10] != null) {
                              var11 = (255 & class221.field2832.field7615[var10][var8][var9]) * 8 << 2;
                           }

                           if (class377.field5711 != null && class377.field5711[var10] != null) {
                              var12 = var6 + -class377.field5711[var10].method2235(var9, arg0 ^ 2116943789, var8) + var11;
                              if (~var12 < ~var7) {
                                 var7 = var12;
                              }
                           }

                           ++var9;
                        }
                     }
                  }
               }
            } else {
               var10000 = class56.field706;
               var10001 = 16384.0F;
            }

            class56.field706 = var10000 - var10001;
         }
      } catch (RuntimeException var14) {
         throw class670.method4877(var14, field5874[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "a",
      descriptor = "(CB)V",
      line = 171
   )
   public final void method2948(char arg0, byte arg1) {
      try {
         if (arg1 != -69) {
            this.field5867 = 90;
         }

         OpenGL.glCallList(this.field5867 - -arg0);
         ++field5872;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5874[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "a",
      descriptor = "(ZI)V",
      line = 182
   )
   public final void method2949(boolean arg0, int arg1) {
      try {
         ++field5866;
         OpenGL.glNewList(this.field5867 + arg1, 4864);
         if (arg0) {
            this.method2949(false, -71);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5874[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "<init>",
      descriptor = "(Lck;I)V",
      line = 193
   )
   public class383(class667 arg0, int arg1) {
      try {
         this.field5867 = OpenGL.glGenLists(arg1);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5874[3] + (arg0 != null ? field5874[4] : field5874[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ll",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2950(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 113);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ll",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2951(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 74;
            break;
         case 1:
            var10005 = 43;
            break;
         case 2:
            var10005 = 100;
            break;
         case 3:
            var10005 = 13;
            break;
         default:
            var10005 = 113;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
