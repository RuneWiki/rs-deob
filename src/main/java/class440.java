import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wga")
public class class440 {
   @OriginalMember(
      owner = "client!wga",
      name = "g",
      descriptor = "I"
   )
   public int field6756 = -1;
   @OriginalMember(
      owner = "client!wga",
      name = "k",
      descriptor = "I"
   )
   public int field6758 = 16777215;
   @OriginalMember(
      owner = "client!wga",
      name = "a",
      descriptor = "I"
   )
   public int field6750 = 0;
   @OriginalMember(
      owner = "client!wga",
      name = "h",
      descriptor = "I"
   )
   private int field6757 = -1;
   @OriginalMember(
      owner = "client!wga",
      name = "x",
      descriptor = "I"
   )
   private int field6753 = -1;
   @OriginalMember(
      owner = "client!wga",
      name = "v",
      descriptor = "Ljava/lang/String;"
   )
   private String field6760 = "";
   @OriginalMember(
      owner = "client!wga",
      name = "f",
      descriptor = "I"
   )
   public int field6766 = -1;
   @OriginalMember(
      owner = "client!wga",
      name = "r",
      descriptor = "I"
   )
   private int field6765 = -1;
   @OriginalMember(
      owner = "client!wga",
      name = "b",
      descriptor = "I"
   )
   public int field6768 = 0;
   @OriginalMember(
      owner = "client!wga",
      name = "p",
      descriptor = "I"
   )
   public int field6763 = 70;
   @OriginalMember(
      owner = "client!wga",
      name = "u",
      descriptor = "I"
   )
   public int field6773 = -1;
   @OriginalMember(
      owner = "client!wga",
      name = "t",
      descriptor = "I"
   )
   public int field6767 = 0;
   @OriginalMember(
      owner = "client!wga",
      name = "d",
      descriptor = "I"
   )
   private int field6775 = -1;
   @OriginalMember(
      owner = "client!wga",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6779 = new String[]{method3472(method3471("0`1!Yo")), method3472(method3471("b6")), method3472(method3471("0`1!^o")), method3472(method3471(")r<c")), method3472(method3471("0`1![o")), method3472(method3471("<)~!`")), method3472(method3471("0`1!\\o")), method3472(method3471("0`1!_o")), method3472(method3471("0`1!Zo")), method3472(method3471("0`1!Vo")), method3472(method3471("0`1!To")), method3472(method3471("0`1!Xo")), method3472(method3471("0`1!Wo")), method3472(method3471("0`1!Uo"))};
   @OriginalMember(
      owner = "client!wga",
      name = "c",
      descriptor = "Luk;"
   )
   public static class498 field6762 = new class498(2, 9);
   @OriginalMember(
      owner = "client!wga",
      name = "n",
      descriptor = "Luk;"
   )
   public static class498 field6770 = new class498(104, 8);
   @OriginalMember(
      owner = "client!wga",
      name = "A",
      descriptor = "Lnaa;"
   )
   public static class113 field6774 = new class113(76, -1);
   @OriginalMember(
      owner = "client!wga",
      name = "e",
      descriptor = "[Ljava/awt/Color;"
   )
   public static Color[] field6777 = new Color[]{new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381)};
   @OriginalMember(
      owner = "client!wga",
      name = "o",
      descriptor = "Lnaa;"
   )
   public static class113 field6778 = new class113(39, 4);
   @OriginalMember(
      owner = "client!wga",
      name = "l",
      descriptor = "I"
   )
   public static int field6751;
   @OriginalMember(
      owner = "client!wga",
      name = "m",
      descriptor = "I"
   )
   public static int field6752;
   @OriginalMember(
      owner = "client!wga",
      name = "s",
      descriptor = "I"
   )
   public static int field6754;
   @OriginalMember(
      owner = "client!wga",
      name = "z",
      descriptor = "I"
   )
   public static int field6755;
   @OriginalMember(
      owner = "client!wga",
      name = "B",
      descriptor = "I"
   )
   public static int field6759;
   @OriginalMember(
      owner = "client!wga",
      name = "i",
      descriptor = "I"
   )
   public static int field6761;
   @OriginalMember(
      owner = "client!wga",
      name = "y",
      descriptor = "I"
   )
   public static int field6764;
   @OriginalMember(
      owner = "client!wga",
      name = "q",
      descriptor = "I"
   )
   public static int field6769;
   @OriginalMember(
      owner = "client!wga",
      name = "C",
      descriptor = "I"
   )
   public static int field6771;
   @OriginalMember(
      owner = "client!wga",
      name = "j",
      descriptor = "I"
   )
   public static int field6776;
   @OriginalMember(
      owner = "client!wga",
      name = "w",
      descriptor = "Lgm;"
   )
   public class204 field6772;

   @OriginalMember(
      owner = "client!wga",
      name = "a",
      descriptor = "(ILha;)Ljq;"
   )
   public final class672 method3460(int arg0, class610 arg1) {
      try {
         ++field6771;
         if (this.field6757 < 0) {
            return null;
         } else {
            class672 var3 = (class672)this.field6772.field3103.method2544(false, (long)this.field6757);
            if (var3 == null) {
               this.method3463(arg1, 0);
               var3 = (class672)this.field6772.field3103.method2544(false, (long)this.field6757);
            }

            return arg0 >= -103 ? null : var3;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field6779[11] + arg0 + ',' + (arg1 != null ? field6779[5] : field6779[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wga",
      name = "b",
      descriptor = "(IB)J"
   )
   public static final long method3461(int arg0, byte arg1) {
      try {
         ++field6769;
         if (arg1 > -36) {
            method3470(39);
         }

         return (long)(arg0 - -11745) * 86400000L;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6779[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wga",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3462(byte arg0) {
      try {
         field6762 = null;
         if (arg0 > -73) {
            field6774 = null;
         }

         field6777 = null;
         field6778 = null;
         field6774 = null;
         field6770 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6779[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wga",
      name = "a",
      descriptor = "(Lha;I)V"
   )
   private final void method3463(class610 arg0, int arg1) {
      try {
         ++field6751;
         class678 var3 = this.field6772.field3107;
         if (this.field6757 >= 0 && this.field6772.field3103.method2544(false, (long)this.field6757) == null && var3.method5002(this.field6757, (byte)82)) {
            class776 var4 = class776.method5650(var3, this.field6757);
            this.field6772.field3103.method2545((long)this.field6757, 115, arg0.method606(var4, true));
         }

         if (~this.field6765 <= -1 && this.field6772.field3103.method2544(false, (long)this.field6765) == null && var3.method5002(this.field6765, (byte)111)) {
            class776 var5 = class776.method5650(var3, this.field6765);
            this.field6772.field3103.method2545((long)this.field6765, 120, arg0.method606(var5, true));
         }

         if (this.field6753 >= arg1 && this.field6772.field3103.method2544(false, (long)this.field6753) == null && var3.method5002(this.field6753, (byte)88)) {
            class776 var6 = class776.method5650(var3, this.field6753);
            this.field6772.field3103.method2545((long)this.field6753, 113, arg0.method606(var6, true));
         }

         if (this.field6775 >= 0 && this.field6772.field3103.method2544(false, (long)this.field6775) == null && var3.method5002(this.field6775, (byte)90)) {
            class776 var7 = class776.method5650(var3, this.field6775);
            this.field6772.field3103.method2545((long)this.field6775, 113, arg0.method606(var7, true));
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field6779[6] + (arg0 != null ? field6779[5] : field6779[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wga",
      name = "a",
      descriptor = "(Lha;Z)Ljq;"
   )
   public final class672 method3464(class610 arg0, boolean arg1) {
      try {
         ++field6754;
         if (this.field6753 < 0) {
            return null;
         } else {
            if (arg1) {
               field6774 = null;
            }

            class672 var3 = (class672)this.field6772.field3103.method2544(arg1, (long)this.field6753);
            if (var3 == null) {
               this.method3463(arg0, 0);
               var3 = (class672)this.field6772.field3103.method2544(false, (long)this.field6753);
            }

            return var3;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field6779[13] + (arg0 != null ? field6779[5] : field6779[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wga",
      name = "b",
      descriptor = "(Lha;I)Ljq;"
   )
   public final class672 method3465(class610 arg0, int arg1) {
      try {
         ++field6759;
         if (this.field6775 < 0) {
            return null;
         } else {
            if (arg1 >= -123) {
               this.method3465((class610)null, -21);
            }

            class672 var3 = (class672)this.field6772.field3103.method2544(false, (long)this.field6775);
            if (var3 == null) {
               this.method3463(arg0, 0);
               var3 = (class672)this.field6772.field3103.method2544(false, (long)this.field6775);
            }

            return var3;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field6779[10] + (arg0 != null ? field6779[5] : field6779[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wga",
      name = "a",
      descriptor = "(IB)Ljava/lang/String;"
   )
   public final String method3466(int arg0, byte arg1) {
      boolean var3 = client.field1786;

      try {
         if (arg1 < 5) {
            this.method3464((class610)null, false);
         }

         ++field6776;
         String var4 = this.field6760;

         String var10000;
         while(true) {
            int var5 = var4.indexOf(field6779[1]);
            if (var5 >= 0) {
               var10000 = var4.substring(0, var5) + class583.method4361(false, arg0, -123) + var4.substring(var5 - -2);
               if (var3) {
                  break;
               }

               var4 = var10000;
               if (!var3) {
                  continue;
               }
            }

            var10000 = var4;
            break;
         }

         return var10000;
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field6779[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wga",
      name = "a",
      descriptor = "(ILica;I)V"
   )
   private final void method3467(int arg0, class354 arg1, int arg2) {
      boolean var4 = client.field1786;

      try {
         label112: {
            int var5 = -97 % ((arg0 - 47) / 46);
            if (arg2 != 1) {
               if (~arg2 != -3) {
                  if (arg2 != 3) {
                     if (arg2 != 4) {
                        if (arg2 != 5) {
                           if (~arg2 == -7) {
                              this.field6775 = arg1.method2848(-127);
                              if (!var4) {
                                 break label112;
                              }
                           }

                           if (arg2 != 7) {
                              if (arg2 != 8) {
                                 if (~arg2 != -10) {
                                    if (~arg2 == -11) {
                                       this.field6768 = arg1.method2869(false);
                                       if (!var4) {
                                          break label112;
                                       }
                                    }

                                    if (arg2 != 11) {
                                       if (arg2 == 12) {
                                          this.field6756 = arg1.method2855(-31007);
                                          if (!var4) {
                                             break label112;
                                          }
                                       }

                                       if (arg2 != 13) {
                                          if (arg2 != 14) {
                                             break label112;
                                          }

                                          this.field6773 = arg1.method2848(-116);
                                          if (!var4) {
                                             break label112;
                                          }
                                       }

                                       this.field6750 = arg1.method2869(false);
                                       if (!var4) {
                                          break label112;
                                       }
                                    }

                                    this.field6773 = 0;
                                    if (!var4) {
                                       break label112;
                                    }
                                 }

                                 this.field6763 = arg1.method2848(-126);
                                 if (!var4) {
                                    break label112;
                                 }
                              }

                              this.field6760 = arg1.method2847(1);
                              if (!var4) {
                                 break label112;
                              }
                           }

                           this.field6767 = arg1.method2869(false);
                           if (!var4) {
                              break label112;
                           }
                        }

                        this.field6765 = arg1.method2848(-104);
                        if (!var4) {
                           break label112;
                        }
                     }

                     this.field6753 = arg1.method2848(-112);
                     if (!var4) {
                        break label112;
                     }
                  }

                  this.field6757 = arg1.method2848(-122);
                  if (!var4) {
                     break label112;
                  }
               }

               this.field6758 = arg1.method2872(2);
               if (!var4) {
                  break label112;
               }
            }

            this.field6766 = arg1.method2848(-119);
         }

         ++field6752;
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field6779[9] + arg0 + ',' + (arg1 != null ? field6779[5] : field6779[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wga",
      name = "a",
      descriptor = "(Lha;B)Ljq;"
   )
   public final class672 method3468(class610 arg0, byte arg1) {
      try {
         ++field6764;
         if (~this.field6765 > -1) {
            return null;
         } else {
            class672 var3 = (class672)this.field6772.field3103.method2544(false, (long)this.field6765);
            if (arg1 != 74) {
               return null;
            } else {
               if (var3 == null) {
                  this.method3463(arg0, 0);
                  var3 = (class672)this.field6772.field3103.method2544(false, (long)this.field6765);
               }

               return var3;
            }
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field6779[4] + (arg0 != null ? field6779[5] : field6779[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wga",
      name = "a",
      descriptor = "(BLica;)V"
   )
   public final void method3469(byte arg0, class354 arg1) {
      boolean var3 = client.field1786;

      try {
         while(true) {
            int var4 = arg1.method2855(-31007);
            if (var4 != 0) {
               this.method3467(122, arg1, var4);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            ++field6761;
            break;
         }

         if (arg0 > -96) {
            this.method3469((byte)78, (class354)null);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field6779[8] + arg0 + ',' + (arg1 != null ? field6779[5] : field6779[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wga",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method3470(int arg0) {
      try {
         ++field6755;
         if (class525.field7997 != null) {
            class525.field7997 = null;
            if (arg0 != -1) {
               field6770 = null;
            }

            class793.method5733(class532.field8084, class430.field6640, (byte)45, class785.field11521, class255.field3853);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6779[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3471(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 29);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3472(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 71;
            break;
         case 1:
            var10005 = 7;
            break;
         case 2:
            var10005 = 80;
            break;
         case 3:
            var10005 = 15;
            break;
         default:
            var10005 = 29;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
