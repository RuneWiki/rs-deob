import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class330 {
   @OriginalMember(
      owner = "client!aj",
      name = "o",
      descriptor = "Z"
   )
   public boolean field4724 = false;
   @OriginalMember(
      owner = "client!aj",
      name = "h",
      descriptor = "Lgw;"
   )
   private class179 field4719 = new class179(64);
   @OriginalMember(
      owner = "client!aj",
      name = "d",
      descriptor = "Lgw;"
   )
   public class179 field4725 = new class179(500);
   @OriginalMember(
      owner = "client!aj",
      name = "l",
      descriptor = "Lgw;"
   )
   public class179 field4726 = new class179(30);
   @OriginalMember(
      owner = "client!aj",
      name = "r",
      descriptor = "Lgw;"
   )
   public class179 field4727 = new class179(50);
   @OriginalMember(
      owner = "client!aj",
      name = "a",
      descriptor = "Lhw;"
   )
   private class141 field4714;
   @OriginalMember(
      owner = "client!aj",
      name = "f",
      descriptor = "Z"
   )
   public boolean field4717;
   @OriginalMember(
      owner = "client!aj",
      name = "v",
      descriptor = "Lhw;"
   )
   public class141 field4708;
   @OriginalMember(
      owner = "client!aj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4729 = new String[]{method2564(method2563("i*\n -")), method2564(method2563("i*\n)-")), method2564(method2563("i*\n$-")), method2564(method2563("i*\n/-")), method2564(method2563("i*\n--")), method2564(method2563("i*\n+-")), method2564(method2563("i*\n.-")), method2564(method2563("i*\n&-")), method2564(method2563("f5H\u0000")), method2564(method2563("sn\nBx")), method2564(method2563("i*\n'-")), method2564(method2563("i*\n%-")), method2564(method2563("i*\nPlf)PR-")), method2564(method2563("i*\n(-")), method2564(method2563("i*\n*-"))};
   @OriginalMember(
      owner = "client!aj",
      name = "u",
      descriptor = "I"
   )
   public static int field4712 = -1;
   @OriginalMember(
      owner = "client!aj",
      name = "g",
      descriptor = "I"
   )
   public static int field4707;
   @OriginalMember(
      owner = "client!aj",
      name = "t",
      descriptor = "I"
   )
   public static int field4709;
   @OriginalMember(
      owner = "client!aj",
      name = "n",
      descriptor = "I"
   )
   public static int field4710;
   @OriginalMember(
      owner = "client!aj",
      name = "c",
      descriptor = "I"
   )
   public static int field4711;
   @OriginalMember(
      owner = "client!aj",
      name = "j",
      descriptor = "I"
   )
   public static int field4713;
   @OriginalMember(
      owner = "client!aj",
      name = "s",
      descriptor = "I"
   )
   public static int field4715;
   @OriginalMember(
      owner = "client!aj",
      name = "m",
      descriptor = "I"
   )
   public static int field4716;
   @OriginalMember(
      owner = "client!aj",
      name = "e",
      descriptor = "I"
   )
   public static int field4718;
   @OriginalMember(
      owner = "client!aj",
      name = "k",
      descriptor = "I"
   )
   public static int field4720;
   @OriginalMember(
      owner = "client!aj",
      name = "i",
      descriptor = "I"
   )
   public static int field4721;
   @OriginalMember(
      owner = "client!aj",
      name = "b",
      descriptor = "I"
   )
   public static int field4722;
   @OriginalMember(
      owner = "client!aj",
      name = "p",
      descriptor = "I"
   )
   public static int field4723;
   @OriginalMember(
      owner = "client!aj",
      name = "q",
      descriptor = "I"
   )
   public int field4728;

   @OriginalMember(
      owner = "client!aj",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method2551(int arg0) {
      boolean var1 = client.field4564;

      try {
         ++field4720;
         if (arg0 < -19) {
            if (class589.field8507 == null) {
               int var2 = class438.field6315;
               int var3 = class78.field1347;
               int var4 = -class720.field10406 + class693.field10156 + -var2;
               int var5 = -class218.field3296 + class620.field9009 - var3;
               if (var2 > 0 || var4 > 0 || ~var3 < -1 || var5 > 0) {
                  try {
                     Container var6;
                     label72: {
                        if (class123.field1971 != null) {
                           var6 = class123.field1971;
                           if (!var1) {
                              break label72;
                           }
                        }

                        if (class514.field7493 != null) {
                           var6 = class514.field7493;
                           if (!var1) {
                              break label72;
                           }
                        }

                        var6 = class346.field4928;
                     }

                     int var7 = 0;
                     int var8 = 0;
                     if (class123.field1971 == var6) {
                        Insets var9 = class123.field1971.getInsets();
                        var8 = var9.top;
                        var7 = var9.left;
                     }

                     Graphics var10 = var6.getGraphics();
                     var10.setColor(Color.black);
                     if (~var2 < -1) {
                        var10.fillRect(var7, var8, var2, class620.field9009);
                     }

                     if (~var3 < -1) {
                        var10.fillRect(var7, var8, class693.field10156, var3);
                     }

                     if (~var4 < -1) {
                        var10.fillRect(var7 - (-class693.field10156 - -var4), var8, var4, class620.field9009);
                     }

                     if (~var5 < -1) {
                        var10.fillRect(var7, var8 - -class620.field9009 - var5, class693.field10156, var5);
                        return;
                     }
                  } catch (Exception var12) {
                     return;
                  }
               }

            }
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field4729[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aj",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method2552(int arg0, int arg1, int arg2) {
      try {
         ++field4723;
         if (arg2 != -1) {
            field4712 = 73;
         }

         return class764.method5527((byte)-56, arg0, arg1) & class609.method4467(arg1, 22311, arg0);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4729[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aj",
      name = "a",
      descriptor = "(ZB)V"
   )
   public final void method2553(boolean arg0, byte arg1) {
      try {
         ++field4711;
         if (arg1 != 46) {
            field4712 = -116;
         }

         if (!arg0 != !this.field4717) {
            this.field4717 = arg0;
            this.method2557(arg1 + -21303);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4729[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aj",
      name = "a",
      descriptor = "(Lvia;I)V"
   )
   public static final void method2554(class587 arg0, int arg1) {
      boolean var2 = client.field4564;

      try {
         ++field4710;
         if (arg0 != null) {
            class685.field10080.method2585(arg0, -92);
            ++class103.field1686;
            if (arg1 > 49) {
               Object var3 = null;
               class59 var6;
               if (!arg0.field8476 && !"".equals(arg0.field8477)) {
                  class59 var10000;
                  long var4;
                  label75: {
                     var4 = arg0.field8492;
                     var6 = (class59)class471.field6845.method1572(var4, -16289);
                     if (var2) {
                        var10000 = var6;
                     } else if (var6 == null) {
                        var10000 = var6;
                        if (!var2) {
                           break label75;
                        }
                     } else {
                        var10000 = var6;
                     }

                     label74:
                     while(true) {
                        while(var10000.field1132.equals(arg0.field8477)) {
                           var10000 = var6;
                           if (!var2) {
                              break label74;
                           }
                        }

                        var6 = (class59)class471.field6845.method1568(0);
                        if (var6 == null) {
                           var10000 = var6;
                           if (!var2) {
                              break;
                           }
                        } else {
                           var10000 = var6;
                        }
                     }
                  }

                  if (var10000 == null) {
                     var6 = (class59)class310.field4478.method1584(var4, 1);
                     if (var6 != null && !var6.field1132.equals(arg0.field8477)) {
                        var6 = null;
                     }

                     if (var6 == null) {
                        var6 = new class59(arg0.field8477);
                     }

                     class471.field6845.method1566(var6, 24742, var4);
                     ++class255.field3622;
                  }
               } else {
                  var6 = new class59(arg0.field8477);
                  ++class255.field3622;
               }

               if (var6.method656(arg0, 3)) {
                  class432.method3254(true, var6);
               }
            }
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field4729[7] + (arg0 != null ? field4729[9] : field4729[8]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aj",
      name = "b",
      descriptor = "(II)V"
   )
   public final void method2555(int arg0, int arg1) {
      try {
         ++field4707;
         this.field4728 = arg1;
         if (arg0 != 4925) {
            this.field4725 = null;
         }

         class179 var3 = this.field4725;
         synchronized(this.field4725) {
            this.field4725.method1589((byte)87);
         }

         class179 var4 = this.field4726;
         synchronized(this.field4726) {
            this.field4726.method1589((byte)70);
         }

         class179 var5 = this.field4727;
         synchronized(this.field4727) {
            this.field4727.method1589((byte)91);
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field4729[14] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aj",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method2556(int arg0) {
      try {
         ++field4721;
         if (arg0 == 5390) {
            class179 var2 = this.field4719;
            synchronized(this.field4719) {
               this.field4719.method1591((byte)58);
            }

            class179 var3 = this.field4725;
            synchronized(this.field4725) {
               this.field4725.method1591((byte)58);
            }

            class179 var4 = this.field4726;
            synchronized(this.field4726) {
               this.field4726.method1591((byte)58);
            }

            class179 var5 = this.field4727;
            synchronized(this.field4727) {
               this.field4727.method1591((byte)58);
            }
         }
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field4729[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aj",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method2557(int arg0) {
      try {
         ++field4716;
         class179 var2 = this.field4719;
         synchronized(this.field4719) {
            this.field4719.method1589((byte)84);
         }

         class179 var3 = this.field4725;
         synchronized(this.field4725) {
            this.field4725.method1589((byte)110);
         }

         class179 var4 = this.field4726;
         synchronized(this.field4726) {
            this.field4726.method1589((byte)52);
         }

         class179 var5 = this.field4727;
         synchronized(this.field4727) {
            if (arg0 != -21257) {
               method2551(-7);
            }

            this.field4727.method1589((byte)119);
         }
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field4729[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aj",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method2558(int arg0, int arg1) {
      try {
         class179 var3 = this.field4719;
         synchronized(this.field4719) {
            this.field4719.method1579(-81, arg1);
         }

         ++field4709;
         class179 var4 = this.field4725;
         synchronized(this.field4725) {
            this.field4725.method1579(106, arg1);
         }

         class179 var5 = this.field4726;
         synchronized(this.field4726) {
            this.field4726.method1579(99, arg1);
         }

         if (arg0 != 0) {
            this.method2553(false, (byte)24);
         }

         class179 var6 = this.field4727;
         synchronized(this.field4727) {
            this.field4727.method1579(94, arg1);
         }
      } catch (RuntimeException var12) {
         throw class608.method4462(var12, field4729[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aj",
      name = "c",
      descriptor = "(II)Lnia;"
   )
   public final class670 method2559(int arg0, int arg1) {
      try {
         ++field4713;
         class179 var3 = this.field4719;
         class670 var4;
         synchronized(this.field4719) {
            var4 = (class670)this.field4719.method1584((long)arg0, 1);
         }

         if (var4 != null) {
            return var4;
         } else {
            class141 var5 = this.field4714;
            byte[] var6;
            synchronized(this.field4714) {
               var6 = this.field4714.method1347((byte)123, class487.method3679(-28876, arg0), class71.method750(-1381022974, arg0));
            }

            class670 var7 = new class670();
            var7.field9826 = arg0;
            var7.field9767 = this;
            if (var6 != null) {
               var7.method4891(new class473(var6), (byte)-94);
            }

            var7.method4910(arg1 ^ arg1);
            if (var7.field9760) {
               var7.field9838 = false;
               var7.field9761 = 0;
            }

            if (!this.field4717 && var7.field9842) {
               var7.field9819 = null;
               var7.field9748 = null;
            }

            class179 var8 = this.field4719;
            synchronized(this.field4719) {
               this.field4719.method1581((long)arg0, arg1, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field4729[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aj",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method2560(byte arg0, int arg1) {
      try {
         this.field4719 = new class179(arg1);
         if (arg0 != 65) {
            this.method2559(-20, 9);
         }

         ++field4722;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4729[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aj",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method2561(boolean arg0, boolean arg1) {
      try {
         if (arg0) {
            method2552(-115, -83, 9);
         }

         ++field4715;
         if (this.field4724 == !arg1) {
            this.field4724 = arg1;
            this.method2557(-21257);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4729[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aj",
      name = "a",
      descriptor = "(CZ)Z"
   )
   public static final boolean method2562(char arg0, boolean arg1) {
      boolean var2 = client.field4564;

      try {
         ++field4718;
         if (arg0 > 0 && ~arg0 > -129 || ~arg0 <= -161 && arg0 <= 255) {
            return true;
         } else {
            if (!arg1) {
               field4712 = -3;
            }

            if (~arg0 != -1) {
               char[] var3 = class685.field10078;
               int var4 = 0;
               if (var2 || var4 < var3.length) {
                  do {
                     char var5 = var3[var4];
                     if (arg0 == var5) {
                        return true;
                     }

                     ++var4;
                  } while(var4 < var3.length);
               }
            }

            return false;
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field4729[13] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aj",
      name = "<init>",
      descriptor = "(Lca;IZLhw;Lhw;)V"
   )
   public class330(class320 arg0, int arg1, boolean arg2, class141 arg3, class141 arg4) {
      try {
         this.field4714 = arg3;
         this.field4717 = arg2;
         this.field4708 = arg4;
         if (this.field4714 != null) {
            int var6 = this.field4714.method1337((byte)126) + -1;
            this.field4714.method1346(var6, 0);
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field4729[12] + (arg0 != null ? field4729[9] : field4729[8]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field4729[9] : field4729[8]) + ',' + (arg4 != null ? field4729[9] : field4729[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2563(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 5);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2564(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 8;
            break;
         case 1:
            var10005 = 64;
            break;
         case 2:
            var10005 = 36;
            break;
         case 3:
            var10005 = 108;
            break;
         default:
            var10005 = 5;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
