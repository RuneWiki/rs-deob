import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class716 extends class329 {
   @OriginalMember(
      owner = "client!th",
      name = "q",
      descriptor = "Lc;"
   )
   private class652 field10730;
   @OriginalMember(
      owner = "client!th",
      name = "m",
      descriptor = "Lps;"
   )
   private class553 field10724;
   @OriginalMember(
      owner = "client!th",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10735 = new String[]{method5304(method5303("8\u0010K\u000e\u001c")), method5304(method5303("7VKeI")), method5304(method5303("8\u0010Kw]\"\u0011\u0011u\u001c")), method5304(method5303("\"\r\t'")), method5304(method5303("8\u0010K\b\u001c")), method5304(method5303("8\u0010K\n\u001c")), method5304(method5303("8\u0010K\t\u001c")), method5304(method5303("8\u0010K\u000f\u001c"))};
   @OriginalMember(
      owner = "client!th",
      name = "p",
      descriptor = "[I"
   )
   public static int[] field10726 = new int[1];
   @OriginalMember(
      owner = "client!th",
      name = "s",
      descriptor = "Lbda;"
   )
   public static class783 field10728 = new class783(0, 1);
   @OriginalMember(
      owner = "client!th",
      name = "r",
      descriptor = "Lhf;"
   )
   public static class588 field10733 = new class588();
   @OriginalMember(
      owner = "client!th",
      name = "t",
      descriptor = "J"
   )
   public static long field10734 = -1L;
   @OriginalMember(
      owner = "client!th",
      name = "v",
      descriptor = "I"
   )
   public static int field10725;
   @OriginalMember(
      owner = "client!th",
      name = "u",
      descriptor = "I"
   )
   public static int field10727;
   @OriginalMember(
      owner = "client!th",
      name = "n",
      descriptor = "I"
   )
   public static int field10729;
   @OriginalMember(
      owner = "client!th",
      name = "l",
      descriptor = "I"
   )
   public static int field10731;
   @OriginalMember(
      owner = "client!th",
      name = "o",
      descriptor = "I"
   )
   public static int field10732;

   @OriginalMember(
      owner = "client!th",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method5299(int arg0) {
      try {
         if (arg0 != -65534) {
            method5299(40);
         }

         field10733 = null;
         field10728 = null;
         field10726 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10735[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!th",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method5300(boolean arg0) {
      try {
         if (arg0) {
            this.method2683(-2);
         }

         ++field10731;
         return this.field10724.field8270;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10735[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!th",
      name = "f",
      descriptor = "(I)V"
   )
   public static final void method5301(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!th",
      name = "c",
      descriptor = "(I)Lps;"
   )
   public final class553 method2683(int arg0) {
      try {
         if (arg0 <= 38) {
            return null;
         } else {
            ++field10725;
            return this.field10724;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10735[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!th",
      name = "<init>",
      descriptor = "(Lc;I)V"
   )
   public class716(class652 arg0, int arg1) {
      try {
         this.field10730 = arg0;
         this.field10724 = new class553(arg0, 6408, arg1);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10735[2] + (arg0 != null ? field10735[1] : field10735[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!th",
      name = "a",
      descriptor = "(Lps;FZLps;)Z"
   )
   public final boolean method5302(class553 arg0, float arg1, boolean arg2, class553 arg3) {
      boolean var5 = client.field1786;

      try {
         ++field10732;
         byte var6 = 1;
         class358 var7 = this.field10730.field9669;
         this.field10730.method626(class680.field10144);
         this.field10730.method701();
         this.field10730.method4784(0);
         OpenGL.glMatrixMode(5889);
         OpenGL.glLoadIdentity();
         OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
         OpenGL.glMatrixMode(5888);
         OpenGL.glLoadIdentity();
         OpenGL.glPushAttrib(2048);
         OpenGL.glViewport(0, 0, this.field10724.field8270, this.field10724.field8270);
         this.field10730.method4762(arg2, (byte)33);
         this.field10730.method4749(true, false);
         this.field10730.method4807(false, false);
         this.field10730.method4779((byte)-35, false);
         this.field10730.method4805(-2, (byte)26);
         this.field10730.method4787(-68, 1);
         this.field10730.method4775(0.0F, arg1, 0.0F, (byte)-68, 0.0F);
         this.field10730.method4803(34165, 34165, true);
         this.field10730.method4792(-26367, arg0);
         this.field10730.method4787(-102, 0);
         this.field10730.method4765(1, (byte)-3);
         this.field10730.method4792(-26367, arg3);
         this.field10730.method4796(true, var7);
         int var8 = 0;
         int var10000;
         if (var5) {
            var10000 = 34069 - -var8;
         } else if (var8 >= 6) {
            var7.method2933(0, -16640);
            this.field10730.method4746(-1, var7);
            this.field10730.method4787(-59, 1);
            this.field10730.method4792(-26367, (class799)null);
            this.field10730.method4803(8448, 8448, true);
            this.field10730.method4787(-74, 0);
            this.field10730.method4792(-26367, (class799)null);
            OpenGL.glPopAttrib();
            this.field10730.method629(class680.field10144[0], class680.field10144[1], class680.field10144[2], class680.field10144[3]);
            var10000 = var6;
            if (!var5) {
               if (var6 != 0 && !this.field10730.field9718) {
                  this.field10724.method5757((byte)75);
               }

               return (boolean)var6;
            }
         } else {
            var10000 = 34069 - -var8;
         }

         while(true) {
            while(true) {
               int var9 = var10000;
               var7.method2931(0, 0, var9, this.field10724);
               var7.method2930((byte)118, 0);
               if (var7.method2929((byte)-80)) {
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
                                    break label155;
                                 }

                                 if (var9 != 34074) {
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
                     var7.method2933(0, -16640);
                     this.field10730.method4746(-1, var7);
                     this.field10730.method4787(-59, 1);
                     this.field10730.method4792(-26367, (class799)null);
                     this.field10730.method4803(8448, 8448, true);
                     this.field10730.method4787(-74, 0);
                     this.field10730.method4792(-26367, (class799)null);
                     OpenGL.glPopAttrib();
                     this.field10730.method629(class680.field10144[0], class680.field10144[1], class680.field10144[2], class680.field10144[3]);
                     var10000 = var6;
                     if (!var5) {
                        if (var6 != 0 && !this.field10730.field9718) {
                           this.field10724.method5757((byte)75);
                        }

                        return (boolean)var6;
                     }
                  } else {
                     ++var8;
                     if (var8 >= 6) {
                        var7.method2933(0, -16640);
                        this.field10730.method4746(-1, var7);
                        this.field10730.method4787(-59, 1);
                        this.field10730.method4792(-26367, (class799)null);
                        this.field10730.method4803(8448, 8448, true);
                        this.field10730.method4787(-74, 0);
                        this.field10730.method4792(-26367, (class799)null);
                        OpenGL.glPopAttrib();
                        this.field10730.method629(class680.field10144[0], class680.field10144[1], class680.field10144[2], class680.field10144[3]);
                        var10000 = var6;
                        if (!var5) {
                           if (var6 != 0 && !this.field10730.field9718) {
                              this.field10724.method5757((byte)75);
                           }

                           return (boolean)var6;
                        }
                     } else {
                        var10000 = 34069 - -var8;
                     }
                  }
               } else {
                  var6 = 0;
                  var7.method2933(0, -16640);
                  this.field10730.method4746(-1, var7);
                  this.field10730.method4787(-59, 1);
                  this.field10730.method4792(-26367, (class799)null);
                  this.field10730.method4803(8448, 8448, true);
                  this.field10730.method4787(-74, 0);
                  this.field10730.method4792(-26367, (class799)null);
                  OpenGL.glPopAttrib();
                  this.field10730.method629(class680.field10144[0], class680.field10144[1], class680.field10144[2], class680.field10144[3]);
                  var10000 = var6;
                  if (!var5) {
                     if (var6 != 0 && !this.field10730.field9718) {
                        this.field10724.method5757((byte)75);
                     }

                     return (boolean)var6;
                  }
               }
            }
         }
      } catch (RuntimeException var12) {
         throw class482.method3757(var12, field10735[7] + (arg0 != null ? field10735[1] : field10735[3]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10735[1] : field10735[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!th",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5303(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 52);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!th",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5304(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 76;
            break;
         case 1:
            var10005 = 120;
            break;
         case 2:
            var10005 = 101;
            break;
         case 3:
            var10005 = 75;
            break;
         default:
            var10005 = 52;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
