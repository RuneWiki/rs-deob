import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class455 implements class196 {
   @OriginalMember(
      owner = "client!lo",
      name = "f",
      descriptor = "Lwt;"
   )
   private class523 field6270;
   @OriginalMember(
      owner = "client!lo",
      name = "a",
      descriptor = "[Lwba;"
   )
   private class603[] field6269;
   @OriginalMember(
      owner = "client!lo",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6282 = new String[]{method3488(method3487("I9x\u0006m")), method3488(method3487("I9x\u0007m")), method3488(method3487("I9x\u0002m")), method3488(method3487("I9x\u000fm")), method3488(method3487("I9x\u0005m")), method3488(method3487("I9xp,K?\"rm")), method3488(method3487("K#: ")), method3488(method3487("^xxb8")), method3488(method3487("I9x\rm")), method3488(method3487("I9x\bm")), method3488(method3487("I9x\u000em")), method3488(method3487("I9x\nm"))};
   @OriginalMember(
      owner = "client!lo",
      name = "d",
      descriptor = "Laka;"
   )
   public static class418 field6278 = new class418(36, 0);
   @OriginalMember(
      owner = "client!lo",
      name = "b",
      descriptor = "I"
   )
   public static int field6279 = 0;
   @OriginalMember(
      owner = "client!lo",
      name = "i",
      descriptor = "I"
   )
   public static int field6267;
   @OriginalMember(
      owner = "client!lo",
      name = "k",
      descriptor = "I"
   )
   public static int field6268;
   @OriginalMember(
      owner = "client!lo",
      name = "n",
      descriptor = "I"
   )
   public static int field6271;
   @OriginalMember(
      owner = "client!lo",
      name = "o",
      descriptor = "I"
   )
   public static int field6274;
   @OriginalMember(
      owner = "client!lo",
      name = "l",
      descriptor = "I"
   )
   public static int field6275;
   @OriginalMember(
      owner = "client!lo",
      name = "m",
      descriptor = "I"
   )
   public static int field6276;
   @OriginalMember(
      owner = "client!lo",
      name = "c",
      descriptor = "I"
   )
   public static int field6277;
   @OriginalMember(
      owner = "client!lo",
      name = "h",
      descriptor = "I"
   )
   public static int field6281;
   @OriginalMember(
      owner = "client!lo",
      name = "e",
      descriptor = "Lha;"
   )
   private class479 field6273;
   @OriginalMember(
      owner = "client!lo",
      name = "j",
      descriptor = "Z"
   )
   private boolean field6272;
   @OriginalMember(
      owner = "client!lo",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field6280;

   @OriginalMember(
      owner = "client!lo",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method1633(boolean arg0) {
      try {
         ++field6276;
         if (arg0) {
            this.method1633(true);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6282[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lo",
      name = "a",
      descriptor = "(Z[[[Lbq;)V"
   )
   public static final void method3484(boolean arg0, class731[][][] arg1) {
      boolean var2 = client.field1481;

      try {
         ++field6274;
         if (!arg0) {
            field6278 = null;
         }

         int var3 = 0;
         if (var2 || ~var3 > ~arg1.length) {
            do {
               class731[][] var4 = arg1[var3];
               int var5 = 0;
               if (var2 || var4.length > var5) {
                  do {
                     int var6 = 0;
                     if (var2 || ~var6 > ~var4[var5].length) {
                        do {
                           class731 var7 = var4[var5][var6];
                           if (var7 == null) {
                              ++var6;
                           } else {
                              if (var7.field10649 instanceof class660) {
                                 ((class660)var7.field10649).method173(false);
                              }

                              if (var7.field10655 instanceof class660) {
                                 ((class660)var7.field10655).method173(false);
                              }

                              if (var7.field10651 instanceof class660) {
                                 ((class660)var7.field10651).method173(!arg0);
                              }

                              if (var7.field10656 instanceof class660) {
                                 ((class660)var7.field10656).method173(false);
                                 if (var7.field10642 instanceof class660) {
                                    ((class660)var7.field10642).method173(false);
                                 }
                              } else if (var7.field10642 instanceof class660) {
                                 ((class660)var7.field10642).method173(false);
                              }

                              class131 var8 = var7.field10654;
                              class680 var9;
                              if (var2) {
                                 var9 = var8.field1676;
                                 if (var9 instanceof class660) {
                                    ((class660)var9).method173(!arg0);
                                 }

                                 var8 = var8.field1670;
                              }

                              while(var8 != null) {
                                 var9 = var8.field1676;
                                 if (var9 instanceof class660) {
                                    ((class660)var9).method173(!arg0);
                                 }

                                 var8 = var8.field1670;
                              }

                              ++var6;
                           }
                        } while(~var6 > ~var4[var5].length);
                     }

                     ++var5;
                  } while(var4.length > var5);
               }

               ++var3;
            } while(~var3 > ~arg1.length);

         }
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field6282[8] + arg0 + ',' + (arg1 != null ? field6282[7] : field6282[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lo",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method3485(byte arg0) {
      try {
         field6280 = null;
         field6278 = null;
         int var1 = 87 % ((arg0 - -40) / 35);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6282[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lo",
      name = "a",
      descriptor = "(BZ)V"
   )
   public final void method1632(byte arg0, boolean arg1) {
      boolean var3 = client.field1481;

      try {
         if (arg0 <= -38) {
            boolean var9 = true;
            ++field6277;
            class603[] var4 = this.field6269;
            int var5 = 0;
            if (!var3 && var4.length <= var5) {
               this.field6272 = false;
            } else {
               do {
                  class603 var6 = var4[var5];
                  if (var6 != null) {
                     var6.method222(-22493, !var9 ? this.field6272 : true);
                     ++var5;
                  } else {
                     ++var5;
                  }
               } while(var4.length > var5);

               this.field6272 = false;
            }
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field6282[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lo",
      name = "a",
      descriptor = "(Lwf;I)V"
   )
   public static final void method3486(class541 arg0, int arg1) {
      boolean var2 = client.field1481;

      try {
         ++field6281;
         if (arg0 != null) {
            class500.field6967.method279(false, arg0);
            ++field6279;
            if (arg1 == 0) {
               Object var3 = null;
               class438 var6;
               if (!arg0.field7915 && !"".equals(arg0.field7903)) {
                  class438 var10000;
                  long var4;
                  label75: {
                     var4 = arg0.field7901;
                     var6 = (class438)class466.field6411.method1818(-1, var4);
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
                        while(var10000.field5962.equals(arg0.field7903)) {
                           var10000 = var6;
                           if (!var2) {
                              break label74;
                           }
                        }

                        var6 = (class438)class466.field6411.method1816((byte)-92);
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
                     var6 = (class438)class259.field3299.method3192(var4, (byte)-111);
                     if (var6 != null && !var6.field5962.equals(arg0.field7903)) {
                        var6 = null;
                     }

                     if (var6 == null) {
                        var6 = new class438(arg0.field7903);
                     }

                     class466.field6411.method1808(var4, var6, 26459);
                     ++class254.field3207;
                  }
               } else {
                  var6 = new class438(arg0.field7903);
                  ++class254.field3207;
               }

               if (var6.method3380((byte)67, arg0)) {
                  class714.method5218(var6, arg1 + -14210);
               }
            }
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field6282[9] + (arg0 != null ? field6282[7] : field6282[6]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lo",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method1635(byte arg0) {
      boolean var2 = client.field1481;

      try {
         if (class629.field9294 != this.field6273) {
            this.field6272 = true;
            this.field6273 = class629.field9294;
         }

         ++field6275;
         this.field6273.method426(0);
         class603[] var3 = this.field6269;
         int var4 = 0;
         class603 var5;
         if (var2) {
            var5 = var3[var4];
            if (var5 != null) {
               var5.method223(-28722);
            }

            ++var4;
         }

         while(var4 < var3.length) {
            var5 = var3[var4];
            if (var5 != null) {
               var5.method223(-28722);
            }

            ++var4;
         }

         if (arg0 <= 23) {
            this.method1635((byte)72);
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field6282[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lo",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method1634(int arg0) {
      boolean var2 = client.field1481;

      try {
         ++field6271;
         if (arg0 != 32416) {
            return -76;
         } else {
            int var3 = 0;
            class603[] var4 = this.field6269;
            int var5 = 0;
            if (!var2 && var4.length <= var5) {
               return var3 * 100 / this.field6269.length;
            } else {
               do {
                  class603 var6 = var4[var5];
                  if (var6 != null) {
                     if (var6.method221(-10439)) {
                        ++var3;
                        ++var5;
                     } else {
                        ++var5;
                     }
                  } else {
                     ++var3;
                     ++var5;
                  }
               } while(var4.length > var5);

               return var3 * 100 / this.field6269.length;
            }
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field6282[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lo",
      name = "<init>",
      descriptor = "(Lwt;Loh;)V"
   )
   public class455(class523 param1, class655 param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!lo",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method1631(byte arg0) {
      try {
         int var2 = 37 % ((arg0 - -89) / 36);
         ++field6268;
         return this.field6270.field7332;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field6282[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lo",
      name = "a",
      descriptor = "(IJ)Z"
   )
   public final boolean method1636(int arg0, long arg1) {
      try {
         if (arg0 != 11804) {
            method3486((class541)null, 101);
         }

         ++field6267;
         return class163.method1353(-126) >= arg1 - -((long)this.field6270.field7330);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field6282[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3487(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 69);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3488(char[] arg0) {
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
            var10005 = 86;
            break;
         case 2:
            var10005 = 86;
            break;
         case 3:
            var10005 = 76;
            break;
         default:
            var10005 = 69;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
