import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class152 {
   @OriginalMember(
      owner = "client!hc",
      name = "o",
      descriptor = "I"
   )
   private int field2118 = 1;
   @OriginalMember(
      owner = "client!hc",
      name = "b",
      descriptor = "I"
   )
   private int field2125 = 0;
   @OriginalMember(
      owner = "client!hc",
      name = "r",
      descriptor = "I"
   )
   private int field2123 = 0;
   @OriginalMember(
      owner = "client!hc",
      name = "n",
      descriptor = "I"
   )
   private int field2130 = 1;
   @OriginalMember(
      owner = "client!hc",
      name = "y",
      descriptor = "Lll;"
   )
   private class387 field2124 = new class387();
   @OriginalMember(
      owner = "client!hc",
      name = "k",
      descriptor = "Z"
   )
   private boolean field2135 = true;
   @OriginalMember(
      owner = "client!hc",
      name = "x",
      descriptor = "[Lbha;"
   )
   private class601[] field2136 = new class601[2];
   @OriginalMember(
      owner = "client!hc",
      name = "w",
      descriptor = "Z"
   )
   private boolean field2133 = true;
   @OriginalMember(
      owner = "client!hc",
      name = "c",
      descriptor = "I"
   )
   private int field2144 = -1;
   @OriginalMember(
      owner = "client!hc",
      name = "e",
      descriptor = "Z"
   )
   private boolean field2138 = true;
   @OriginalMember(
      owner = "client!hc",
      name = "f",
      descriptor = "Z"
   )
   private boolean field2139 = false;
   @OriginalMember(
      owner = "client!hc",
      name = "h",
      descriptor = "Z"
   )
   private boolean field2141 = true;
   @OriginalMember(
      owner = "client!hc",
      name = "s",
      descriptor = "I"
   )
   private int field2146 = 0;
   @OriginalMember(
      owner = "client!hc",
      name = "i",
      descriptor = "Lea;"
   )
   private class573 field2120;
   @OriginalMember(
      owner = "client!hc",
      name = "B",
      descriptor = "Lnh;"
   )
   private class780 field2119;
   @OriginalMember(
      owner = "client!hc",
      name = "p",
      descriptor = "Lnh;"
   )
   private class780 field2128;
   @OriginalMember(
      owner = "client!hc",
      name = "j",
      descriptor = "Lnh;"
   )
   private class780 field2132;
   @OriginalMember(
      owner = "client!hc",
      name = "F",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2147 = new String[]{method1274(method1273("%lD,\u0001")), method1274(method1273("#z\u0006\u0003")), method1274(method1273("%lD&\u0001")), method1274(method1273("6!DAT")), method1274(method1273("%lD(\u0001")), method1274(method1273("%lDS@#f\u001eQ\u0001")), method1274(method1273("%lD.\u0001")), method1274(method1273("%lD*\u0001")), method1274(method1273("%lD)\u0001")), method1274(method1273("%lD'\u0001")), method1274(method1273("%lD+\u0001")), method1274(method1273("%lD-\u0001"))};
   @OriginalMember(
      owner = "client!hc",
      name = "g",
      descriptor = "Lno;"
   )
   public static class732 field2126 = new class732(method1274(method1273(">{\u000f\u0003E,}\u000e\u000e^#")), method1274(method1273("\u001e{\u000f\u0003E,}J+H:a")), 1);
   @OriginalMember(
      owner = "client!hc",
      name = "D",
      descriptor = "I"
   )
   public static int field2116;
   @OriginalMember(
      owner = "client!hc",
      name = "z",
      descriptor = "I"
   )
   public static int field2117;
   @OriginalMember(
      owner = "client!hc",
      name = "A",
      descriptor = "I"
   )
   public static int field2121;
   @OriginalMember(
      owner = "client!hc",
      name = "C",
      descriptor = "I"
   )
   public static int field2127;
   @OriginalMember(
      owner = "client!hc",
      name = "q",
      descriptor = "I"
   )
   public static int field2129;
   @OriginalMember(
      owner = "client!hc",
      name = "l",
      descriptor = "I"
   )
   public static int field2131;
   @OriginalMember(
      owner = "client!hc",
      name = "E",
      descriptor = "I"
   )
   public static int field2137;
   @OriginalMember(
      owner = "client!hc",
      name = "m",
      descriptor = "I"
   )
   public static int field2140;
   @OriginalMember(
      owner = "client!hc",
      name = "t",
      descriptor = "I"
   )
   public static int field2145;
   @OriginalMember(
      owner = "client!hc",
      name = "u",
      descriptor = "Lbha;"
   )
   private class601 field2142;
   @OriginalMember(
      owner = "client!hc",
      name = "v",
      descriptor = "Ljm;"
   )
   private class719 field2134;
   @OriginalMember(
      owner = "client!hc",
      name = "d",
      descriptor = "Ljm;"
   )
   private class719 field2143;
   @OriginalMember(
      owner = "client!hc",
      name = "a",
      descriptor = "Z"
   )
   private boolean field2122;

   @OriginalMember(
      owner = "client!hc",
      name = "b",
      descriptor = "(Z)V",
      line = 3
   )
   private final void method1264(boolean arg0) {
      boolean var2 = client.field4360;

      try {
         ++field2117;
         boolean var3 = false;
         int var4 = 0;
         int var5 = 0;
         class354 var6 = (class354)this.field2124.method2933(2);
         int var7;
         if (var2) {
            var7 = var6.method2652(-2467);
            if (~var7 < ~var4) {
               var4 = var7;
            }

            var5 += var6.method2650(0);
            var3 |= var6.method2642(12412);
            var6 = (class354)this.field2124.method2940(false);
         }

         while(true) {
            int var10000;
            if (var6 == null) {
               var10000 = arg0;
               if (!var2) {
                  if (arg0 != 1) {
                     this.field2138 = true;
                  }

                  int var8;
                  label94: {
                     if (~var4 == -3) {
                        var8 = 34836;
                        if (!var2) {
                           break label94;
                        }
                     }

                     if (var4 != 1) {
                        var8 = 6408;
                        if (!var2) {
                           break label94;
                        }
                     }

                     var8 = 34842;
                  }

                  if (this.field2144 != var8) {
                     this.field2135 = true;
                     this.field2144 = var8;
                  }

                  int var9 = this.field2146 > 2 ? 2 : this.field2146;
                  int var10 = ~var5 < -3 ? 2 : var5;
                  this.field2146 = var5;
                  if (!var3 != !this.field2139) {
                     this.field2139 = var3;
                     this.field2141 = true;
                  }

                  if (~var9 != ~var10) {
                     this.field2133 = this.field2135 = true;
                     return;
                  }

                  return;
               }
            } else {
               var10000 = var6.method2652(-2467);
            }

            var7 = var10000;
            if (~var7 < ~var4) {
               var4 = var7;
            }

            var5 += var6.method2650(0);
            var3 |= var6.method2642(12412);
            var6 = (class354)this.field2124.method2940(false);
         }
      } catch (RuntimeException var12) {
         throw class237.method1823(var12, field2147[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "a",
      descriptor = "(B)V",
      line = 66
   )
   public final void method1265(byte arg0) {
      boolean var2 = client.field4360;

      try {
         ++field2140;
         if (this.field2122) {
            if (this.field2132 != null) {
               this.field2120.method4118(this.field2132, (byte)124);
               int var3 = 16384;
               this.field2120.method4142(this.field2119, (byte)-34);
               this.field2132.method5624(false, 0);
               this.field2119.method5625(-1, 0);
               if (this.field2139) {
                  var3 |= 256;
               }

               OpenGL.glBlitFramebufferEXT(0, 0, this.field2130, this.field2118, 0, 0, this.field2130, this.field2118, var3, 9728);
               this.field2120.method4178(94, this.field2132);
               this.field2120.method4114(this.field2119, 18294);
            }

            this.field2120.method4131(-2);
            this.field2120.method4098(0, -16757);
            this.field2120.method4134(1, 2);
            if (arg0 == 31) {
               this.field2120.method574();
               int var4 = 0;
               int var5 = 1;
               class354 var6 = (class354)this.field2124.method2933(2);
               class152 var10000;
               if (var2) {
                  var10000 = this;
               } else if (var6 == null) {
                  var10000 = this;
                  if (!var2) {
                     this.field2122 = false;
                     return;
                  }
               } else {
                  var10000 = this;
               }

               while(true) {
                  class354 var12;
                  label84: {
                     class354 var7 = (class354)var10000.field2124.method2940(false);
                     int var8 = var6.method2650(arg0 ^ 31);
                     int var9 = 0;
                     if (var2) {
                        var6.method2649(this.field2142, var9, this.field2136[var4], arg0 ^ 30);
                        var12 = var7;
                     } else if (~var9 <= ~var8) {
                        var12 = var7;
                        if (!var2) {
                           break label84;
                        }
                     } else {
                        var6.method2649(this.field2142, var9, this.field2136[var4], arg0 ^ 30);
                        var12 = var7;
                     }

                     while(true) {
                        label99: {
                           if (var12 != null || var8 - 1 != var9) {
                              this.field2119.method5625(-1, -(-var5));
                              OpenGL.glBegin(7);
                              OpenGL.glTexCoord2f(0.0F, (float)this.field2118);
                              OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                              OpenGL.glVertex2i(0, 0);
                              OpenGL.glTexCoord2f(0.0F, 0.0F);
                              OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                              OpenGL.glVertex2i(0, this.field2118);
                              OpenGL.glTexCoord2f((float)this.field2130, 0.0F);
                              OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                              OpenGL.glVertex2i(this.field2130, this.field2118);
                              OpenGL.glTexCoord2f((float)this.field2130, (float)this.field2118);
                              OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                              OpenGL.glVertex2i(this.field2130, 0);
                              OpenGL.glEnd();
                              if (!var2) {
                                 var6.method2644(true, var9);
                                 var4 = 1 & var4 + 1;
                                 var5 = 1 & var5 - -1;
                                 ++var9;
                                 break label99;
                              }
                           }

                           this.field2120.method4115(true, this.field2119);
                           this.field2120.method4146(-89, 0, 0);
                           OpenGL.glBegin(7);
                           OpenGL.glTexCoord2f(0.0F, (float)this.field2118);
                           OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                           OpenGL.glVertex2i(this.field2125, this.field2123);
                           OpenGL.glTexCoord2f(0.0F, 0.0F);
                           OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                           OpenGL.glVertex2i(this.field2125, this.field2123 + this.field2118);
                           OpenGL.glTexCoord2f((float)this.field2130, 0.0F);
                           OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                           OpenGL.glVertex2i(this.field2125 - -this.field2130, this.field2123 + this.field2118);
                           OpenGL.glTexCoord2f((float)this.field2130, (float)this.field2118);
                           OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                           OpenGL.glVertex2i(this.field2125 - -this.field2130, this.field2123);
                           OpenGL.glEnd();
                           var6.method2644(true, var9);
                           var4 = 1 & var4 + 1;
                           var5 = 1 & var5 - -1;
                           ++var9;
                        }

                        if (~var9 <= ~var8) {
                           var12 = var7;
                           if (!var2) {
                              break;
                           }
                        } else {
                           var6.method2649(this.field2142, var9, this.field2136[var4], arg0 ^ 30);
                           var12 = var7;
                        }
                     }
                  }

                  var6 = var12;
                  if (var6 == null) {
                     var10000 = this;
                     if (!var2) {
                        this.field2122 = false;
                        return;
                     }
                  } else {
                     var10000 = this;
                  }
               }
            }
         }
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field2147[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "a",
      descriptor = "(ILb;)V",
      line = 176
   )
   public final void method1266(int arg0, class354 arg1) {
      try {
         arg1.field4774 = false;
         ++field2121;
         arg1.method2647(-509013496);
         arg1.method3165(124);
         if (arg0 != 3710) {
            this.method1267(-39, -88, 63, 23, 50);
         }

         this.method1264(true);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field2147[2] + arg0 + ',' + (arg1 != null ? field2147[3] : field2147[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "<init>",
      descriptor = "(Lea;)V",
      line = 521
   )
   public class152(class573 arg0) {
      try {
         this.field2120 = arg0;
         if (this.field2120.field8445 && this.field2120.field8397) {
            this.field2128 = this.field2119 = new class780(this.field2120);
            if (~this.field2120.field8341 < -2 && this.field2120.field8447 && this.field2120.field8411) {
               this.field2128 = this.field2132 = new class780(this.field2120);
               return;
            }
         }

      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field2147[5] + (arg0 != null ? field2147[3] : field2147[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "a",
      descriptor = "(IIIII)Z",
      line = 203
   )
   public final boolean method1267(int arg0, int arg1, int arg2, int arg3, int arg4) {
      boolean var6 = client.field4360;

      try {
         ++field2137;
         if (this.field2128 != null && !this.field2124.method2942(0)) {
            if (this.field2130 != arg3 || this.field2118 != arg2) {
               this.field2130 = arg3;
               this.field2118 = arg2;
               class428 var7 = this.field2124.method2933(2);
               if (var6) {
                  ((class354)var7).method2643(this.field2118, this.field2130, -30466);
                  var7 = var7.field6126;
               }

               while(true) {
                  while(this.field2124.field5611 != var7) {
                     ((class354)var7).method2643(this.field2118, this.field2130, -30466);
                     var7 = var7.field6126;
                  }

                  this.field2135 = true;
                  this.field2133 = true;
                  if (!var6) {
                     this.field2141 = true;
                     break;
                  }

                  var7 = var7.field6126;
               }
            }

            if (arg0 > -112) {
               this.method1268(-26);
            }

            if (this.method1269(false)) {
               this.field2123 = arg4;
               this.field2122 = true;
               this.field2125 = arg1;
               this.field2120.method4123((byte)-48, this.field2128);
               this.field2128.method5625(-1, 0);
               this.field2120.method4146(-97, -this.field2125, this.field2118 - -this.field2123 + -this.field2120.field8264);
               return true;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field2147[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "c",
      descriptor = "(I)V",
      line = 247
   )
   public final void method1268(int arg0) {
      boolean var2 = client.field4360;

      try {
         this.field2134 = null;
         ++field2116;
         this.field2143 = null;
         this.field2136 = null;
         if (arg0 != 34836) {
            this.method1271(-79);
         }

         this.field2128 = this.field2132 = this.field2119 = null;
         this.field2142 = null;
         if (!this.field2124.method2942(0)) {
            class428 var3 = this.field2124.method2933(2);
            if (var2 || this.field2124.field5611 != var3) {
               do {
                  ((class354)var3).method2647(-509013496);
                  var3 = var3.field6126;
               } while(this.field2124.field5611 != var3);
            }
         }

         this.field2130 = this.field2118 = 1;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field2147[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "a",
      descriptor = "(Z)Z",
      line = 281
   )
   private final boolean method1269(boolean arg0) {
      boolean var2 = client.field4360;

      try {
         ++field2129;
         if (this.field2141) {
            if (this.field2134 != null) {
               this.field2134.method5228((byte)122);
               this.field2134 = null;
            }

            if (this.field2142 != null) {
               this.field2142.method3522((byte)-91);
               this.field2142 = null;
            }

            if (this.field2132 != null) {
               this.field2134 = new class719(this.field2120, 6402, this.field2130, this.field2118, this.field2120.field8341);
            }

            label126: {
               if (!this.field2139) {
                  if (this.field2134 != null) {
                     break label126;
                  }

                  this.field2134 = new class719(this.field2120, 6402, this.field2130, this.field2118);
                  if (!var2) {
                     break label126;
                  }
               }

               this.field2142 = new class601(this.field2120, 34037, 6402, this.field2130, this.field2118);
            }

            this.field2141 = false;
            this.field2133 = true;
            this.field2138 = true;
         }

         if (this.field2135) {
            if (this.field2143 != null) {
               this.field2143.method5228((byte)118);
               this.field2143 = null;
            }

            if (this.field2136[0] != null) {
               this.field2136[0].method3522((byte)-91);
               this.field2136[0] = null;
            }

            if (this.field2136[1] != null) {
               this.field2136[1].method3522((byte)-91);
               this.field2136[1] = null;
            }

            if (this.field2132 != null) {
               this.field2143 = new class719(this.field2120, this.field2144, this.field2130, this.field2118, this.field2120.field8341);
            }

            this.field2136[0] = new class601(this.field2120, 34037, this.field2144, this.field2130, this.field2118);
            this.field2136[1] = this.field2146 <= 1 ? null : new class601(this.field2120, 34037, this.field2144, this.field2130, this.field2118);
            this.field2135 = false;
            this.field2138 = true;
            this.field2133 = true;
         }

         if (arg0) {
            this.field2135 = false;
         }

         if (this.field2133) {
            label139: {
               if (this.field2132 != null) {
                  this.field2120.method4123((byte)-58, this.field2119);
                  this.field2119.method5617(0, 102);
                  this.field2119.method5617(1, -50);
                  this.field2119.method5617(8, 119);
                  this.field2119.method5622(113, this.field2136[0], 0);
                  if (this.field2146 > 1) {
                     this.field2119.method5622(103, this.field2136[1], 1);
                  }

                  if (this.field2139) {
                     this.field2119.method5622(59, this.field2142, 8);
                  }

                  this.field2120.method4115(true, this.field2119);
                  this.field2120.method4123((byte)-59, this.field2132);
                  this.field2132.method5617(0, -73);
                  this.field2132.method5617(8, -128);
                  this.field2132.method5618(-1, this.field2143, 0);
                  this.field2132.method5618(-1, this.field2134, 8);
                  this.field2120.method4115(!arg0, this.field2132);
                  if (!var2) {
                     break label139;
                  }
               }

               this.field2120.method4123((byte)88, this.field2119);
               this.field2119.method5617(0, 113);
               this.field2119.method5617(1, -78);
               this.field2119.method5617(8, 69);
               this.field2119.method5622(97, this.field2136[0], 0);
               if (~this.field2146 < -2) {
                  this.field2119.method5622(100, this.field2136[1], 1);
               }

               label110: {
                  if (this.field2139) {
                     this.field2119.method5622(63, this.field2142, 8);
                     if (!var2) {
                        break label110;
                     }
                  }

                  this.field2119.method5618(-1, this.field2134, 8);
               }

               this.field2120.method4115(!arg0, this.field2119);
            }

            this.field2133 = false;
            this.field2138 = true;
         }

         if (this.field2138) {
            this.field2120.method4123((byte)117, this.field2128);
            this.field2138 = !this.field2128.method5619(false);
            this.field2120.method4115(!arg0, this.field2128);
         }

         return !this.field2138;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field2147[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "b",
      descriptor = "(ILb;)Z",
      line = 415
   )
   public final boolean method1270(int arg0, class354 arg1) {
      try {
         ++field2131;
         if (this.field2128 != null) {
            if (arg1.method2648(true) || arg1.method2646((byte)-26)) {
               this.field2124.method2930((byte)-54, arg1);
               this.method1264(true);
               if (this.method1269(false)) {
                  if (this.field2130 != -1 && this.field2118 != -1) {
                     arg1.method2643(this.field2118, this.field2130, -30466);
                  }

                  arg1.field4774 = true;
                  return true;
               }
            }

            this.method1266(3710, arg1);
         }

         return arg0 >= -74 ? false : false;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field2147[9] + arg0 + ',' + (arg1 != null ? field2147[3] : field2147[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "a",
      descriptor = "(I)Z",
      line = 451
   )
   public final boolean method1271(int arg0) {
      try {
         ++field2127;
         if (arg0 != 0) {
            return false;
         } else {
            return this.field2128 != null;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field2147[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "b",
      descriptor = "(I)V",
      line = 509
   )
   public static void method1272(int arg0) {
      try {
         field2126 = null;
         if (arg0 != 0) {
            method1272(-93);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field2147[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1273(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 41);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1274(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 77;
            break;
         case 1:
            var10005 = 15;
            break;
         case 2:
            var10005 = 106;
            break;
         case 3:
            var10005 = 111;
            break;
         default:
            var10005 = 41;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
