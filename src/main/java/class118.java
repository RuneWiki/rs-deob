import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class118 {
   @OriginalMember(
      owner = "client!ra",
      name = "f",
      descriptor = "Ljava/lang/String;"
   )
   private String field1908 = "";
   @OriginalMember(
      owner = "client!ra",
      name = "x",
      descriptor = "I"
   )
   public int field1921 = -1;
   @OriginalMember(
      owner = "client!ra",
      name = "i",
      descriptor = "I"
   )
   private int field1911 = -1;
   @OriginalMember(
      owner = "client!ra",
      name = "a",
      descriptor = "I"
   )
   public int field1910 = -1;
   @OriginalMember(
      owner = "client!ra",
      name = "l",
      descriptor = "I"
   )
   public int field1923 = 0;
   @OriginalMember(
      owner = "client!ra",
      name = "m",
      descriptor = "I"
   )
   public int field1922 = -1;
   @OriginalMember(
      owner = "client!ra",
      name = "d",
      descriptor = "I"
   )
   private int field1916 = -1;
   @OriginalMember(
      owner = "client!ra",
      name = "h",
      descriptor = "I"
   )
   public int field1919 = 70;
   @OriginalMember(
      owner = "client!ra",
      name = "b",
      descriptor = "I"
   )
   private int field1929 = -1;
   @OriginalMember(
      owner = "client!ra",
      name = "e",
      descriptor = "I"
   )
   public int field1930 = 16777215;
   @OriginalMember(
      owner = "client!ra",
      name = "o",
      descriptor = "I"
   )
   private int field1927 = -1;
   @OriginalMember(
      owner = "client!ra",
      name = "t",
      descriptor = "I"
   )
   public int field1925 = 0;
   @OriginalMember(
      owner = "client!ra",
      name = "s",
      descriptor = "I"
   )
   public int field1928 = 0;
   @OriginalMember(
      owner = "client!ra",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1934 = new String[]{method1127(method1126("\u0011%\u001e\u0018")), method1127(method1126("\r1\\5;")), method1127(method1126("\u0004~\\Zn")), method1127(method1126("\r1\\3;")), method1127(method1126("\r1\\=;")), method1127(method1126("\r1\\6;")), method1127(method1126("\r1\\8;")), method1127(method1126("\r1\\<;")), method1127(method1126("\r1\\2;")), method1127(method1126("\r1\\7;")), method1127(method1126("\r1\\0;")), method1127(method1126("\r1\\?;")), method1127(method1126("\r1\\1;")), method1127(method1126("Za"))};
   @OriginalMember(
      owner = "client!ra",
      name = "y",
      descriptor = "Lgh;"
   )
   public static class572 field1912 = new class572(121, 1);
   @OriginalMember(
      owner = "client!ra",
      name = "n",
      descriptor = "[I"
   )
   public static int[] field1933 = new int[1];
   @OriginalMember(
      owner = "client!ra",
      name = "A",
      descriptor = "I"
   )
   public static int field1907;
   @OriginalMember(
      owner = "client!ra",
      name = "w",
      descriptor = "I"
   )
   public static int field1909;
   @OriginalMember(
      owner = "client!ra",
      name = "v",
      descriptor = "I"
   )
   public static int field1913;
   @OriginalMember(
      owner = "client!ra",
      name = "c",
      descriptor = "I"
   )
   public static int field1914;
   @OriginalMember(
      owner = "client!ra",
      name = "g",
      descriptor = "I"
   )
   public static int field1915;
   @OriginalMember(
      owner = "client!ra",
      name = "r",
      descriptor = "I"
   )
   public static int field1917;
   @OriginalMember(
      owner = "client!ra",
      name = "k",
      descriptor = "I"
   )
   public static int field1918;
   @OriginalMember(
      owner = "client!ra",
      name = "p",
      descriptor = "I"
   )
   public static int field1920;
   @OriginalMember(
      owner = "client!ra",
      name = "z",
      descriptor = "I"
   )
   public static int field1926;
   @OriginalMember(
      owner = "client!ra",
      name = "j",
      descriptor = "I"
   )
   public static int field1932;
   @OriginalMember(
      owner = "client!ra",
      name = "q",
      descriptor = "Lgba;"
   )
   public class694 field1924;
   @OriginalMember(
      owner = "client!ra",
      name = "u",
      descriptor = "[Ltd;"
   )
   public static class476[] field1931;

   @OriginalMember(
      owner = "client!ra",
      name = "a",
      descriptor = "(Lha;I)Ltd;"
   )
   public final class476 method1114(class65 arg0, int arg1) {
      try {
         ++field1909;
         if (~this.field1929 > arg1) {
            return null;
         } else {
            class476 var3 = (class476)this.field1924.field10183.method1584((long)this.field1929, arg1 ^ -2);
            if (var3 == null) {
               this.method1119(arg0, 0);
               var3 = (class476)this.field1924.field10183.method1584((long)this.field1929, 1);
            }

            return var3;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field1934[4] + (arg0 != null ? field1934[2] : field1934[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ra",
      name = "a",
      descriptor = "(Lha;B)Ltd;"
   )
   public final class476 method1115(class65 arg0, byte arg1) {
      try {
         ++field1915;
         if (arg1 > -95) {
            this.field1922 = 127;
         }

         if (~this.field1916 > -1) {
            return null;
         } else {
            class476 var3 = (class476)this.field1924.field10183.method1584((long)this.field1916, 1);
            if (var3 == null) {
               this.method1119(arg0, 0);
               var3 = (class476)this.field1924.field10183.method1584((long)this.field1916, 1);
            }

            return var3;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field1934[3] + (arg0 != null ? field1934[2] : field1934[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ra",
      name = "b",
      descriptor = "(Lha;I)Ltd;"
   )
   public final class476 method1116(class65 arg0, int arg1) {
      try {
         ++field1907;
         if (this.field1911 < 0) {
            return null;
         } else {
            int var3 = 79 / ((-19 - arg1) / 53);
            class476 var4 = (class476)this.field1924.field10183.method1584((long)this.field1911, 1);
            if (var4 == null) {
               this.method1119(arg0, 0);
               var4 = (class476)this.field1924.field10183.method1584((long)this.field1911, 1);
            }

            return var4;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field1934[6] + (arg0 != null ? field1934[2] : field1934[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ra",
      name = "b",
      descriptor = "(II)V"
   )
   public static final void method1117(int arg0, int arg1) {
      try {
         ++field1918;
         class536 var2 = class108.method1038((long)arg0, arg1 + 38, arg1);
         var2.method4013((byte)126);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field1934[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ra",
      name = "a",
      descriptor = "(Ljava/lang/String;ILjava/lang/String;B)I"
   )
   public static final int method1118(String arg0, int arg1, String arg2, byte arg3) {
      boolean var4 = client.field4564;

      try {
         ++field1917;
         int var5 = arg2.length();
         int var6 = arg0.length();
         int var7 = 0;
         int var8 = 0;
         char var9 = 0;
         char var10 = 0;

         int var10000;
         label185:
         while(~(-var9 + var7) > ~var5 || ~(-var10 + var8) > ~var6) {
            var10000 = ~(var7 - var9);
            int var10001 = ~var5;

            char var15;
            char var16;
            do {
               if (var10000 <= var10001) {
                  return -1;
               }

               if (var8 - var10 >= var6) {
                  return 1;
               }

               char var11;
               label175: {
                  if (~var9 != -1) {
                     var11 = var9;
                     boolean var12 = false;
                     if (!var4) {
                        break label175;
                     }
                  }

                  var11 = arg2.charAt(var7++);
               }

               char var13;
               label180: {
                  if (var10 != 0) {
                     var13 = var10;
                     boolean var14 = false;
                     if (!var4) {
                        break label180;
                     }
                  }

                  var13 = arg0.charAt(var8++);
               }

               var9 = class628.method4599((byte)121, var11);
               var10 = class628.method4599((byte)116, var13);
               var15 = class305.method2387(var11, (byte)18, arg1);
               var16 = class305.method2387(var13, (byte)18, arg1);
               if (~var15 == ~var16) {
                  continue label185;
               }

               var10000 = ~Character.toUpperCase(var15);
               var10001 = ~Character.toUpperCase(var16);
            } while(var4);

            if (var10000 != var10001) {
               char var17 = Character.toLowerCase(var15);
               char var18 = Character.toLowerCase(var16);
               if (var17 != var18) {
                  return class73.method774(arg1, 357786212, var17) + -class73.method774(arg1, 357786212, var18);
               }
            }
         }

         if (arg3 > -81) {
            return 53;
         } else {
            int var19 = Math.min(var5, var6);
            int var20 = 0;
            int var27;
            int var28;
            char var29;
            char var30;
            char var33;
            if (var4) {
               var10000 = ~arg1;
            } else if (~var19 >= ~var20) {
               var27 = -var6 + var5;
               var10000 = var27;
               if (!var4) {
                  if (var27 != 0) {
                     return var27;
                  }

                  var28 = 0;
                  if (var4) {
                     var33 = arg2.charAt(var28);
                  } else if (var19 <= var28) {
                     var33 = 0;
                     if (!var4) {
                        return 0;
                     }
                  } else {
                     var33 = arg2.charAt(var28);
                  }

                  while(true) {
                     var29 = var33;
                     var30 = arg0.charAt(var28);
                     if (~var29 != ~var30) {
                        return class73.method774(arg1, 357786212, var29) + -class73.method774(arg1, 357786212, var30);
                     }

                     ++var28;
                     if (var19 <= var28) {
                        var33 = 0;
                        if (!var4) {
                           return 0;
                        }
                     } else {
                        var33 = arg2.charAt(var28);
                     }
                  }
               }
            } else {
               var10000 = ~arg1;
            }

            while(true) {
               int var21;
               int var22;
               if (var10000 != -3) {
                  var21 = var20;
                  var22 = var20;
                  if (var4) {
                     var21 = -var20 + -1 + var6;
                     var22 = -var20 + -1 + var5;
                  }
               } else {
                  var21 = -var20 + -1 + var6;
                  var22 = -var20 + -1 + var5;
               }

               char var23 = arg2.charAt(var22);
               char var24 = arg0.charAt(var21);
               if (var23 != var24 && Character.toUpperCase(var23) != Character.toUpperCase(var24)) {
                  char var25 = Character.toLowerCase(var23);
                  char var26 = Character.toLowerCase(var24);
                  if (~var25 != ~var26) {
                     return class73.method774(arg1, 357786212, var25) - class73.method774(arg1, 357786212, var26);
                  }
               }

               ++var20;
               if (~var19 >= ~var20) {
                  var27 = -var6 + var5;
                  var10000 = var27;
                  if (!var4) {
                     if (var27 != 0) {
                        return var27;
                     }

                     var28 = 0;
                     if (var4) {
                        var33 = arg2.charAt(var28);
                     } else if (var19 <= var28) {
                        var33 = 0;
                        if (!var4) {
                           return 0;
                        }
                     } else {
                        var33 = arg2.charAt(var28);
                     }

                     while(true) {
                        var29 = var33;
                        var30 = arg0.charAt(var28);
                        if (~var29 != ~var30) {
                           return class73.method774(arg1, 357786212, var29) + -class73.method774(arg1, 357786212, var30);
                        }

                        ++var28;
                        if (var19 <= var28) {
                           var33 = 0;
                           if (!var4) {
                              return 0;
                           }
                        } else {
                           var33 = arg2.charAt(var28);
                        }
                     }
                  }
               } else {
                  var10000 = ~arg1;
               }
            }
         }
      } catch (RuntimeException var32) {
         throw class608.method4462(var32, field1934[10] + (arg0 != null ? field1934[2] : field1934[0]) + ',' + arg1 + ',' + (arg2 != null ? field1934[2] : field1934[0]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ra",
      name = "c",
      descriptor = "(Lha;I)V"
   )
   private final void method1119(class65 arg0, int arg1) {
      try {
         ++field1926;
         class141 var3 = this.field1924.field10186;
         if (~this.field1911 <= -1 && this.field1924.field10183.method1584((long)this.field1911, 1) == null && var3.method1335((byte)115, this.field1911)) {
            class94 var4 = class94.method919(var3, this.field1911);
            this.field1924.field10183.method1581((long)this.field1911, 0, arg0.method307(var4, true));
         }

         if (arg1 <= this.field1916 && this.field1924.field10183.method1584((long)this.field1916, 1) == null && var3.method1335((byte)115, this.field1916)) {
            class94 var5 = class94.method919(var3, this.field1916);
            this.field1924.field10183.method1581((long)this.field1916, arg1, arg0.method307(var5, true));
         }

         if (this.field1929 >= 0 && this.field1924.field10183.method1584((long)this.field1929, 1) == null && var3.method1335((byte)115, this.field1929)) {
            class94 var6 = class94.method919(var3, this.field1929);
            this.field1924.field10183.method1581((long)this.field1929, 0, arg0.method307(var6, true));
         }

         if (~this.field1927 <= -1 && this.field1924.field10183.method1584((long)this.field1927, 1) == null && var3.method1335((byte)115, this.field1927)) {
            class94 var7 = class94.method919(var3, this.field1927);
            this.field1924.field10183.method1581((long)this.field1927, 0, arg0.method307(var7, true));
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field1934[9] + (arg0 != null ? field1934[2] : field1934[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ra",
      name = "a",
      descriptor = "(Lvca;III)V"
   )
   public static final void method1120(class294 arg0, int arg1, int arg2, int arg3) {
      if (arg2 < class479.field6989) {
         class600 var4 = class90.field1473[arg1][arg2 + 1][arg3];
         if (var4 != null && var4.field8654 != null && var4.field8654.method601(0)) {
            arg0.method579(class57.field1124, true, var4.field8654, class49.field1047, 0, 0, 0);
         }
      }

      if (arg3 < class479.field6989) {
         class600 var5 = class90.field1473[arg1][arg2][arg3 + 1];
         if (var5 != null && var5.field8654 != null && var5.field8654.method601(0)) {
            arg0.method579(0, true, var5.field8654, class49.field1047, class57.field1124, 0, 0);
         }
      }

      if (arg2 < class479.field6989 && arg3 < class357.field5100) {
         class600 var6 = class90.field1473[arg1][arg2 + 1][arg3 + 1];
         if (var6 != null && var6.field8654 != null && var6.field8654.method601(0)) {
            arg0.method579(class57.field1124, true, var6.field8654, class49.field1047, class57.field1124, 0, 0);
         }
      }

      if (arg2 < class479.field6989 && arg3 > 0) {
         class600 var7 = class90.field1473[arg1][arg2 + 1][arg3 - 1];
         if (var7 != null && var7.field8654 != null && var7.field8654.method601(0)) {
            arg0.method579(class57.field1124, true, var7.field8654, class49.field1047, -class57.field1124, 0, 0);
         }
      }

   }

   @OriginalMember(
      owner = "client!ra",
      name = "a",
      descriptor = "(II)Ljava/lang/String;"
   )
   public final String method1121(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         if (arg0 <= 15) {
            return null;
         } else {
            ++field1914;
            String var4 = this.field1908;

            String var10000;
            while(true) {
               int var5 = var4.indexOf(field1934[13]);
               if (var5 >= 0) {
                  var10000 = var4.substring(0, var5) + class424.method3217(-34, false, arg1) + var4.substring(var5 - -2);
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
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field1934[12] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ra",
      name = "a",
      descriptor = "(Luda;I)V"
   )
   public final void method1122(class473 arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         if (arg1 > 109) {
            ++field1932;

            do {
               int var4 = arg0.method3564((byte)-104);
               if (var4 == 0) {
                  break;
               }

               this.method1124(true, arg0, var4);
            } while(!var3);

         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field1934[1] + (arg0 != null ? field1934[2] : field1934[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ra",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method1123(boolean arg0) {
      try {
         field1912 = null;
         if (arg0) {
            field1933 = null;
         }

         field1933 = null;
         field1931 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field1934[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ra",
      name = "a",
      descriptor = "(ZLuda;I)V"
   )
   private final void method1124(boolean arg0, class473 arg1, int arg2) {
      boolean var4 = client.field4564;

      try {
         label123: {
            ++field1913;
            if (arg2 == 1) {
               this.field1922 = arg1.method3565(true);
               if (!var4) {
                  break label123;
               }
            }

            if (arg2 == 2) {
               this.field1930 = arg1.method3577(-2);
               if (!var4) {
                  break label123;
               }
            }

            if (arg2 != 3) {
               if (arg2 == 4) {
                  this.field1929 = arg1.method3565(arg0);
                  if (!var4) {
                     break label123;
                  }
               }

               if (arg2 == 5) {
                  this.field1916 = arg1.method3565(true);
                  if (!var4) {
                     break label123;
                  }
               }

               if (arg2 == 6) {
                  this.field1927 = arg1.method3565(arg0);
                  if (!var4) {
                     break label123;
                  }
               }

               if (arg2 != 7) {
                  if (~arg2 == -9) {
                     this.field1908 = arg1.method3570(false);
                     if (!var4) {
                        break label123;
                     }
                  }

                  if (arg2 == 9) {
                     this.field1919 = arg1.method3565(true);
                     if (!var4) {
                        break label123;
                     }
                  }

                  if (~arg2 != -11) {
                     if (arg2 == 11) {
                        this.field1921 = 0;
                        if (!var4) {
                           break label123;
                        }
                     }

                     if (arg2 != 12) {
                        if (~arg2 == -14) {
                           this.field1928 = arg1.method3538(-128);
                           if (!var4) {
                              break label123;
                           }
                        }

                        if (arg2 != 14) {
                           break label123;
                        }

                        this.field1921 = arg1.method3565(true);
                        if (!var4) {
                           break label123;
                        }
                     }

                     this.field1910 = arg1.method3564((byte)-110);
                     if (!var4) {
                        break label123;
                     }
                  }

                  this.field1923 = arg1.method3538(-128);
                  if (!var4) {
                     break label123;
                  }
               }

               this.field1925 = arg1.method3538(-128);
               if (!var4) {
                  break label123;
               }
            }

            this.field1911 = arg1.method3565(true);
         }

         if (!arg0) {
            this.field1919 = 39;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field1934[5] + arg0 + ',' + (arg1 != null ? field1934[2] : field1934[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ra",
      name = "a",
      descriptor = "(BLha;)Ltd;"
   )
   public final class476 method1125(byte arg0, class65 arg1) {
      try {
         ++field1920;
         if (arg0 >= -13) {
            this.field1925 = -28;
         }

         if (this.field1927 < 0) {
            return null;
         } else {
            class476 var3 = (class476)this.field1924.field10183.method1584((long)this.field1927, 1);
            if (var3 == null) {
               this.method1119(arg1, 0);
               var3 = (class476)this.field1924.field10183.method1584((long)this.field1927, 1);
            }

            return var3;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field1934[8] + arg0 + ',' + (arg1 != null ? field1934[2] : field1934[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ra",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1126(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 19);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ra",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1127(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 127;
            break;
         case 1:
            var10005 = 80;
            break;
         case 2:
            var10005 = 114;
            break;
         case 3:
            var10005 = 116;
            break;
         default:
            var10005 = 19;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
