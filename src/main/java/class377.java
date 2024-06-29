import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class377 {
   @OriginalMember(
      owner = "client!du",
      name = "l",
      descriptor = "I"
   )
   public int field5441 = 0;
   @OriginalMember(
      owner = "client!du",
      name = "r",
      descriptor = "Z"
   )
   private boolean field5450 = false;
   @OriginalMember(
      owner = "client!du",
      name = "b",
      descriptor = "I"
   )
   public int field5449 = 0;
   @OriginalMember(
      owner = "client!du",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5454 = new String[]{method2862(method2861("A\u0004VK")), method2862(method2861("K\u0004\u0014bL")), method2862(method2861("T_\u0014\t\u0019")), method2862(method2861("K\u0004\u0014dL")), method2862(method2861("K\u0004\u0014aL")), method2862(method2861("K\u0004\u0014cL")), method2862(method2861("K\u0004\u0014eL")), method2862(method2861("K\u0004\u0014`L")), method2862(method2861("K\u001eYR\tJ\u001fN\t\u0007@\u001eQN\u0001\u0012S")), method2862(method2861("\u0014QLB\u0016\\\u0018UIY\u001eJ\u001aW\u0005[\u0019\u0007\b_\u000f\u0015UJ\u0005F\u001f\u0007")), method2862(method2861("Z\u0002HC\u000bML")), method2862(method2861("L\u001eUL\rJ\u0019UT\u0010")), method2862(method2861("K\u0004\u0014fL"))};
   @OriginalMember(
      owner = "client!du",
      name = "a",
      descriptor = "[Lct;"
   )
   public static class157[] field5448 = new class157[100];
   @OriginalMember(
      owner = "client!du",
      name = "x",
      descriptor = "Lek;"
   )
   public static class536 field5446 = new class536(78, 2);
   @OriginalMember(
      owner = "client!du",
      name = "o",
      descriptor = "I"
   )
   public static int field5429;
   @OriginalMember(
      owner = "client!du",
      name = "n",
      descriptor = "I"
   )
   public static int field5430;
   @OriginalMember(
      owner = "client!du",
      name = "h",
      descriptor = "I"
   )
   public static int field5431;
   @OriginalMember(
      owner = "client!du",
      name = "q",
      descriptor = "I"
   )
   public int field5432;
   @OriginalMember(
      owner = "client!du",
      name = "j",
      descriptor = "I"
   )
   public int field5433;
   @OriginalMember(
      owner = "client!du",
      name = "t",
      descriptor = "I"
   )
   public int field5434;
   @OriginalMember(
      owner = "client!du",
      name = "m",
      descriptor = "I"
   )
   public int field5435;
   @OriginalMember(
      owner = "client!du",
      name = "d",
      descriptor = "I"
   )
   public int field5436;
   @OriginalMember(
      owner = "client!du",
      name = "k",
      descriptor = "I"
   )
   public static int field5437;
   @OriginalMember(
      owner = "client!du",
      name = "y",
      descriptor = "I"
   )
   public static int field5438;
   @OriginalMember(
      owner = "client!du",
      name = "c",
      descriptor = "I"
   )
   private int field5440;
   @OriginalMember(
      owner = "client!du",
      name = "s",
      descriptor = "I"
   )
   public static int field5442;
   @OriginalMember(
      owner = "client!du",
      name = "v",
      descriptor = "I"
   )
   public static int field5443;
   @OriginalMember(
      owner = "client!du",
      name = "e",
      descriptor = "I"
   )
   public int field5444;
   @OriginalMember(
      owner = "client!du",
      name = "i",
      descriptor = "I"
   )
   public int field5445;
   @OriginalMember(
      owner = "client!du",
      name = "g",
      descriptor = "I"
   )
   public int field5447;
   @OriginalMember(
      owner = "client!du",
      name = "u",
      descriptor = "I"
   )
   public int field5451;
   @OriginalMember(
      owner = "client!du",
      name = "p",
      descriptor = "I"
   )
   public static int field5452;
   @OriginalMember(
      owner = "client!du",
      name = "w",
      descriptor = "I"
   )
   public static int field5453;
   @OriginalMember(
      owner = "client!du",
      name = "f",
      descriptor = "J"
   )
   public long field5439;

   @OriginalMember(
      owner = "client!du",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2854(int arg0) {
      try {
         field5448 = null;
         field5446 = null;
         if (arg0 > -17) {
            method2860(55, (class582)null, true);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5454[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!du",
      name = "a",
      descriptor = "(Lwf;B)V"
   )
   public final void method2855(class147 arg0, byte arg1) {
      boolean var3 = client.field4360;

      try {
         ++field5430;
         if (arg1 >= -18) {
            this.field5450 = true;
         }

         do {
            int var4 = arg0.method1143(-15465);
            if (var4 == 0) {
               break;
            }

            this.method2858(var4, 100, arg0);
         } while(!var3);

      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field5454[5] + (arg0 != null ? field5454[2] : field5454[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!du",
      name = "a",
      descriptor = "([BB)Lgs;"
   )
   public static final class49 method2856(byte[] arg0, byte arg1) {
      boolean var2 = client.field4360;

      try {
         ++field5442;
         class49 var3 = new class49();
         class147 var4 = new class147(arg0);
         var4.field1856 = var4.field1889.length + -2;
         int var5 = var4.method1211(-26166);
         int var6 = -var5 + -16 + -2 + var4.field1889.length;
         var4.field1856 = var6;
         int var7 = var4.method1164(19693);
         var3.field652 = var4.method1211(-26166);
         var3.field637 = var4.method1211(-26166);
         var3.field646 = var4.method1211(-26166);
         var3.field642 = var4.method1211(-26166);
         var3.field648 = var4.method1211(-26166);
         var3.field643 = var4.method1211(-26166);
         int var8 = var4.method1143(-15465);
         if (arg1 < 38) {
            field5448 = null;
         }

         if (~var8 < -1) {
            var3.field649 = new class37[var8];
            int var9 = 0;
            if (var2 || ~var9 > ~var8) {
               do {
                  int var10 = var4.method1211(-26166);
                  class37 var11 = new class37(class350.method2552(false, var10));
                  var3.field649[var9] = var11;
                  if (var2 || var10-- > 0) {
                     do {
                        int var12 = var4.method1164(19693);
                        int var13 = var4.method1164(19693);
                        var11.method336(-1, (long)var12, new class713(var13));
                     } while(var10-- > 0);
                  }

                  ++var9;
               } while(~var9 > ~var8);
            }
         }

         var4.field1856 = 0;
         var3.field647 = var4.method1175(6781);
         var3.field650 = new int[var7];
         int var14 = 0;
         if (!var2 && ~var4.field1856 <= ~var6) {
            return var3;
         } else {
            do {
               int var15;
               label119: {
                  var15 = var4.method1211(-26166);
                  if (var15 == 3) {
                     if (var3.field644 == null) {
                        var3.field644 = new String[var7];
                     }

                     var3.field644[var14] = var4.method1204(2119550368).intern();
                     if (!var2) {
                        break label119;
                     }
                  }

                  if (~var15 == -55) {
                     if (var3.field651 == null) {
                        var3.field651 = new long[var7];
                     }

                     var3.field651[var14] = var4.method1207(false);
                     if (!var2) {
                        break label119;
                     }

                     if (var3.field639 == null) {
                        var3.field639 = new int[var7];
                     }
                  } else if (var3.field639 == null) {
                     var3.field639 = new int[var7];
                  }

                  if (~var15 > -151 && ~var15 != -22 && ~var15 != -39 && ~var15 != -40) {
                     var3.field639[var14] = var4.method1164(19693);
                  } else {
                     var3.field639[var14] = var4.method1143(-15465);
                     if (var2) {
                        var3.field639[var14] = var4.method1164(19693);
                     }
                  }
               }

               var3.field650[var14++] = var15;
            } while(~var4.field1856 > ~var6);

            return var3;
         }
      } catch (RuntimeException var17) {
         throw class237.method1823(var17, field5454[6] + (arg0 != null ? field5454[2] : field5454[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!du",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method2857(int arg0) {
      try {
         ++field5431;
         if (class216.field3093 != null) {
            try {
               String var1 = class216.field3093.getParameter(field5454[11]);
               int var2 = -11745 + (int)(class133.method1054(-29025) / 86400000L);
               String var3 = field5454[10] + var2 + field5454[9] + var1;
               class548.method3933(field5454[8] + var3 + "\"", class216.field3093, -118);
               if (arg0 >= -18) {
                  method2860(-100, (class582)null, false);
               }
            } catch (Throwable var5) {
            }
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field5454[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!du",
      name = "a",
      descriptor = "(IILwf;)V"
   )
   private final void method2858(int arg0, int arg1, class147 arg2) {
      boolean var4 = client.field4360;

      try {
         label74: {
            if (~arg0 != -2) {
               if (arg0 == 2) {
                  arg2.method1143(-15465);
                  if (!var4) {
                     break label74;
                  }
               }

               if (arg0 == 3) {
                  this.field5451 = arg2.method1164(19693);
                  this.field5436 = arg2.method1164(19693);
                  this.field5444 = arg2.method1164(19693);
                  if (!var4) {
                     break label74;
                  }
               }

               if (~arg0 != -5) {
                  if (arg0 != 6) {
                     if (arg0 != 8) {
                        if (arg0 != 9) {
                           if (~arg0 != -11) {
                              break label74;
                           }

                           this.field5450 = true;
                           if (!var4) {
                              break label74;
                           }
                        }

                        this.field5441 = 1;
                        if (!var4) {
                           break label74;
                        }
                     }

                     this.field5449 = 1;
                     if (!var4) {
                        break label74;
                     }
                  }

                  this.field5432 = arg2.method1143(arg1 ^ -15373);
                  if (!var4) {
                     break label74;
                  }
               }

               this.field5447 = arg2.method1143(-15465);
               this.field5433 = arg2.method1164(19693);
               if (!var4) {
                  break label74;
               }
            }

            this.field5440 = arg2.method1211(-26166);
         }

         if (arg1 != 100) {
            this.method2855((class147)null, (byte)-93);
         }

         ++field5438;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field5454[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5454[2] : field5454[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!du",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method2859(int arg0) {
      boolean var2 = client.field4360;

      try {
         this.field5445 = class363.field4987[this.field5440 << 3];
         ++field5429;
         long var3 = (long)this.field5451;
         long var5 = (long)this.field5436;
         long var7 = (long)this.field5444;
         this.field5435 = (int)Math.sqrt((double)(var5 * var5 + (var3 * var3 - -(var7 * var7))));
         if (~this.field5433 == -1) {
            this.field5433 = 1;
         }

         label45: {
            if (this.field5447 == 0) {
               this.field5439 = 2147483647L;
               if (!var2) {
                  break label45;
               }
            }

            if (~this.field5447 == -2) {
               this.field5439 = (long)(this.field5435 * 8 / this.field5433);
               this.field5439 *= this.field5439;
               if (!var2) {
                  break label45;
               }
            }

            if (~this.field5447 == -3) {
               this.field5439 = (long)(this.field5435 * 8 / this.field5433);
            }
         }

         if (this.field5450) {
            this.field5435 *= -1;
         }

         if (arg0 != -2) {
            this.field5434 = 62;
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field5454[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!du",
      name = "a",
      descriptor = "(ILfs;Z)V"
   )
   public static final void method2860(int arg0, class582 arg1, boolean arg2) {
      try {
         class218.field3125.method1548(arg1, -20253);
         ++field5437;
         if (arg0 <= 114) {
            field5446 = null;
         }

         if (arg2) {
            class674.method4899(class525.field7531, class218.field3125, class213.field3038, class146.field1852, arg1, -17);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5454[4] + arg0 + ',' + (arg1 != null ? field5454[2] : field5454[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!du",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2861(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 100);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!du",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2862(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 47;
            break;
         case 1:
            var10005 = 113;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 39;
            break;
         default:
            var10005 = 100;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
