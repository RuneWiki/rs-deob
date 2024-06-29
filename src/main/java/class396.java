import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public class class396 extends class743 {
   @OriginalMember(
      owner = "client!mea",
      name = "q",
      descriptor = "Liu;"
   )
   private class530 field5466;
   @OriginalMember(
      owner = "client!mea",
      name = "u",
      descriptor = "Lph;"
   )
   private class789 field5467;
   @OriginalMember(
      owner = "client!mea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5472 = new String[]{method3124(method3123("\u000b/\u0002\u001f3N")), method3124(method3123("\u001ddM\u001f\r")), method3124(method3123("\b?\u000f]")), method3124(method3123("\u000b/\u0002\u001f:N")), method3124(method3123("\u000b/\u0002\u001f1N")), method3124(method3123("\u000b/\u0002\u001fL\u000f$\nENN")), method3124(method3123("\u000b/\u0002\u001f2N")), method3124(method3123("\b9\r\u0002")), method3124(method3123("\u000b/\u0002\u001f;N")), method3124(method3123("\b9\r\u0000")), method3124(method3123("\b9\r\u0003")), method3124(method3123("\b9\r\u0001"))};
   @OriginalMember(
      owner = "client!mea",
      name = "s",
      descriptor = "I"
   )
   public static int field5463;
   @OriginalMember(
      owner = "client!mea",
      name = "r",
      descriptor = "I"
   )
   public static int field5464;
   @OriginalMember(
      owner = "client!mea",
      name = "t",
      descriptor = "I"
   )
   public static int field5465;
   @OriginalMember(
      owner = "client!mea",
      name = "n",
      descriptor = "I"
   )
   public static int field5468;
   @OriginalMember(
      owner = "client!mea",
      name = "m",
      descriptor = "I"
   )
   public static int field5469;
   @OriginalMember(
      owner = "client!mea",
      name = "p",
      descriptor = "I"
   )
   public static int field5470;
   @OriginalMember(
      owner = "client!mea",
      name = "o",
      descriptor = "I"
   )
   public static int field5471;

   @OriginalMember(
      owner = "client!mea",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method3119(int arg0) {
      try {
         ++field5469;
         if (arg0 != 2) {
            this.method3119(-26);
         }

         return this.field5467.field11498;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5472[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mea",
      name = "a",
      descriptor = "(Lph;BLph;F)Z"
   )
   public final boolean method3120(class789 arg0, byte arg1, class789 arg2, float arg3) {
      boolean var5 = client.field1481;

      try {
         ++field5470;
         byte var6 = 1;
         class734 var7 = this.field5466.field7701;
         this.field5466.method417(class544.field7955);
         this.field5466.method443();
         this.field5466.method3967((byte)2);
         OpenGL.glMatrixMode(5889);
         OpenGL.glLoadIdentity();
         OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
         OpenGL.glMatrixMode(5888);
         OpenGL.glLoadIdentity();
         OpenGL.glPushAttrib(2048);
         OpenGL.glViewport(0, 0, this.field5467.field11498, this.field5467.field11498);
         this.field5466.method3957(false, arg1 + 240);
         if (arg1 != -122) {
            this.method1100(81);
         }

         this.field5466.method4016(false, -15655);
         this.field5466.method4005(90, false);
         this.field5466.method4020(105, false);
         this.field5466.method4030(-2, true);
         this.field5466.method3988(arg1 + -6, 1);
         this.field5466.method4001(0.0F, 29361, arg3, 0.0F, 0.0F);
         this.field5466.method4022(34165, 34161, 34165);
         this.field5466.method4006(arg2, (byte)-128);
         this.field5466.method3988(-128, 0);
         this.field5466.method4009(1, arg1 ^ -121);
         this.field5466.method4006(arg0, (byte)-126);
         this.field5466.method3955(var7, (byte)-52);
         int var8 = 0;
         int var10000;
         if (var5) {
            var10000 = 34069 - -var8;
         } else if (var8 >= 6) {
            var7.method5307(0, (byte)86);
            this.field5466.method3995(var7, (byte)-29);
            this.field5466.method3988(-128, 1);
            this.field5466.method4006((class549)null, (byte)-127);
            this.field5466.method4022(8448, 34161, 8448);
            this.field5466.method3988(-128, 0);
            this.field5466.method4006((class549)null, (byte)-22);
            OpenGL.glPopAttrib();
            this.field5466.method460(class544.field7955[0], class544.field7955[1], class544.field7955[2], class544.field7955[3]);
            var10000 = var6;
            if (!var5) {
               if (var6 != 0 && !this.field5466.field7738) {
                  this.field5467.method4153(1);
               }

               return (boolean)var6;
            }
         } else {
            var10000 = 34069 - -var8;
         }

         while(true) {
            while(true) {
               int var9 = var10000;
               var7.method5315(0, this.field5467, var9, (byte)-119);
               var7.method5308(0, -5806);
               if (var7.method5309(-36054)) {
                  label159: {
                     label158: {
                        label157: {
                           label156: {
                              OpenGL.glBegin(7);
                              if (var9 != 34069) {
                                 if (~var9 == -34071) {
                                    break label156;
                                 }

                                 if (~var9 == -34072) {
                                    break label157;
                                 }

                                 if (var9 == 34072) {
                                    break label158;
                                 }

                                 if (~var9 == -34074) {
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
                     var7.method5307(0, (byte)86);
                     this.field5466.method3995(var7, (byte)-29);
                     this.field5466.method3988(-128, 1);
                     this.field5466.method4006((class549)null, (byte)-127);
                     this.field5466.method4022(8448, 34161, 8448);
                     this.field5466.method3988(-128, 0);
                     this.field5466.method4006((class549)null, (byte)-22);
                     OpenGL.glPopAttrib();
                     this.field5466.method460(class544.field7955[0], class544.field7955[1], class544.field7955[2], class544.field7955[3]);
                     var10000 = var6;
                     if (!var5) {
                        if (var6 != 0 && !this.field5466.field7738) {
                           this.field5467.method4153(1);
                        }

                        return (boolean)var6;
                     }
                  } else {
                     ++var8;
                     if (var8 >= 6) {
                        var7.method5307(0, (byte)86);
                        this.field5466.method3995(var7, (byte)-29);
                        this.field5466.method3988(-128, 1);
                        this.field5466.method4006((class549)null, (byte)-127);
                        this.field5466.method4022(8448, 34161, 8448);
                        this.field5466.method3988(-128, 0);
                        this.field5466.method4006((class549)null, (byte)-22);
                        OpenGL.glPopAttrib();
                        this.field5466.method460(class544.field7955[0], class544.field7955[1], class544.field7955[2], class544.field7955[3]);
                        var10000 = var6;
                        if (!var5) {
                           if (var6 != 0 && !this.field5466.field7738) {
                              this.field5467.method4153(1);
                           }

                           return (boolean)var6;
                        }
                     } else {
                        var10000 = 34069 - -var8;
                     }
                  }
               } else {
                  var6 = 0;
                  var7.method5307(0, (byte)86);
                  this.field5466.method3995(var7, (byte)-29);
                  this.field5466.method3988(-128, 1);
                  this.field5466.method4006((class549)null, (byte)-127);
                  this.field5466.method4022(8448, 34161, 8448);
                  this.field5466.method3988(-128, 0);
                  this.field5466.method4006((class549)null, (byte)-22);
                  OpenGL.glPopAttrib();
                  this.field5466.method460(class544.field7955[0], class544.field7955[1], class544.field7955[2], class544.field7955[3]);
                  var10000 = var6;
                  if (!var5) {
                     if (var6 != 0 && !this.field5466.field7738) {
                        this.field5467.method4153(1);
                     }

                     return (boolean)var6;
                  }
               }
            }
         }
      } catch (RuntimeException var12) {
         throw class93.method866(var12, field5472[3] + (arg0 != null ? field5472[1] : field5472[2]) + ',' + arg1 + ',' + (arg2 != null ? field5472[1] : field5472[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mea",
      name = "a",
      descriptor = "(ZLmb;)V"
   )
   public static final void method3121(boolean param0, class431 param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!mea",
      name = "a",
      descriptor = "(I)Lph;"
   )
   public final class789 method1100(int arg0) {
      try {
         ++field5463;
         return arg0 != 20341 ? null : this.field5467;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5472[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mea",
      name = "<init>",
      descriptor = "(Liu;I)V"
   )
   public class396(class530 arg0, int arg1) {
      try {
         this.field5466 = arg0;
         this.field5467 = new class789(arg0, 6408, arg1);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field5472[5] + (arg0 != null ? field5472[1] : field5472[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mea",
      name = "a",
      descriptor = "(IIIIB)V"
   )
   public static final void method3122(int arg0, int arg1, int arg2, int arg3, byte arg4) {
      boolean var5 = client.field1481;

      try {
         ++field5464;
         int var6 = 0;
         int var7 = arg2;
         int var8 = -arg2;
         byte var9 = -1;
         int var10 = class180.method1522(25495, class415.field5689, class282.field3921, arg1 - -arg2);
         if (arg4 < -116) {
            int var11 = class180.method1522(25495, class415.field5689, class282.field3921, -arg2 + arg1);
            class385.method3045(arg3, var10, class237.field3001[arg0], var11, (byte)-80);
            int var10000;
            int var10001;
            int var22;
            if (var5) {
               var22 = var9 + 2;
               var8 += var22;
               var10000 = ~var8;
               var10001 = -1;
            } else {
               if (~arg2 >= ~var6) {
                  return;
               }

               var22 = var9 + 2;
               var8 += var22;
               var10000 = ~var8;
               var10001 = -1;
            }

            while(true) {
               while(true) {
                  if (var10000 < var10001) {
                     --var7;
                     var8 -= var7 << 1;
                     int var12 = -var7 + arg0;
                     int var13 = arg0 + var7;
                     if (class577.field8561 <= var13 && var12 <= class586.field8647) {
                        int var14 = class180.method1522(25495, class415.field5689, class282.field3921, arg1 + var6);
                        int var15 = class180.method1522(25495, class415.field5689, class282.field3921, -var6 + arg1);
                        if (~class586.field8647 <= ~var13) {
                           class385.method3045(arg3, var14, class237.field3001[var13], var15, (byte)-85);
                        }

                        if (var12 >= class577.field8561) {
                           class385.method3045(arg3, var14, class237.field3001[var12], var15, (byte)-67);
                        }
                     }
                  }

                  ++var6;
                  int var16 = -var6 + arg0;
                  int var17 = arg0 - -var6;
                  if (~var17 > ~class577.field8561) {
                     break;
                  }

                  var10000 = class586.field8647;
                  var10001 = var16;
                  if (!var5) {
                     if (var10000 >= var16) {
                        int var18 = class180.method1522(25495, class415.field5689, class282.field3921, arg1 + var7);
                        int var19 = class180.method1522(25495, class415.field5689, class282.field3921, arg1 - var7);
                        if (var17 <= class586.field8647) {
                           class385.method3045(arg3, var18, class237.field3001[var17], var19, (byte)-98);
                        }

                        if (~class577.field8561 >= ~var16) {
                           class385.method3045(arg3, var18, class237.field3001[var16], var19, (byte)-68);
                        }
                     }
                     break;
                  }
               }

               if (~var7 >= ~var6) {
                  return;
               }

               var22 += 2;
               var8 += var22;
               var10000 = ~var8;
               var10001 = -1;
            }
         }
      } catch (RuntimeException var21) {
         throw class93.method866(var21, field5472[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3123(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 112);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3124(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 102;
            break;
         case 1:
            var10005 = 74;
            break;
         case 2:
            var10005 = 99;
            break;
         case 3:
            var10005 = 49;
            break;
         default:
            var10005 = 112;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
