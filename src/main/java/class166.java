import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class166 {
   @OriginalMember(
      owner = "client!hq",
      name = "g",
      descriptor = "Lgw;"
   )
   private class179 field2620 = new class179(64);
   @OriginalMember(
      owner = "client!hq",
      name = "c",
      descriptor = "Lhw;"
   )
   private class141 field2621;
   @OriginalMember(
      owner = "client!hq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2625 = new String[]{method1514(method1513("y49F")), method1514(method1513("lo{\u0004k")), method1514(method1513("\u007f0{\u0016\u007fy(!\u0014>")), method1514(method1513("\u007f0{h>")), method1514(method1513("\u007f0{i>")), method1514(method1513("\u007f0{l>")), method1514(method1513("\u007f0{b>")), method1514(method1513("\u007f0{o>")), method1514(method1513("\u007f0{m>")), method1514(method1513("\u007f0{k>"))};
   @OriginalMember(
      owner = "client!hq",
      name = "e",
      descriptor = "[[I"
   )
   public static int[][] field2622 = new int[][]{{2, 4, 6, 0}, {0, 2, 3, 5, 6, 4}, {0, 1, 4, 5}, {4, 6, 0, 2}, {2, 4, 0}, {0, 2, 4}, {6, 0, 1, 2, 4, 5}, {0, 1, 2, 4, 6, 7}, {4, 7, 6, 0}, {0, 8, 6, 1, 9, 2, 9, 4}, {2, 9, 4, 0, 8, 6}, {2, 11, 3, 7, 10, 10, 6, 6}, {2, 4, 6, 0}};
   @OriginalMember(
      owner = "client!hq",
      name = "a",
      descriptor = "I"
   )
   public static int field2616;
   @OriginalMember(
      owner = "client!hq",
      name = "i",
      descriptor = "I"
   )
   public static int field2617;
   @OriginalMember(
      owner = "client!hq",
      name = "b",
      descriptor = "I"
   )
   public static int field2618;
   @OriginalMember(
      owner = "client!hq",
      name = "f",
      descriptor = "I"
   )
   public static int field2619;
   @OriginalMember(
      owner = "client!hq",
      name = "d",
      descriptor = "I"
   )
   public static int field2623;
   @OriginalMember(
      owner = "client!hq",
      name = "h",
      descriptor = "I"
   )
   public static int field2624;

   @OriginalMember(
      owner = "client!hq",
      name = "a",
      descriptor = "(ZI)Lkq;",
      line = 4
   )
   public final class617 method1505(boolean arg0, int arg1) {
      try {
         if (arg0) {
            this.field2621 = null;
         }

         ++field2618;
         class179 var3 = this.field2620;
         class617 var4;
         synchronized(this.field2620) {
            var4 = (class617)this.field2620.method1584((long)arg1, 1);
         }

         if (var4 != null) {
            return var4;
         } else {
            class141 var5 = this.field2621;
            byte[] var6;
            synchronized(this.field2621) {
               var6 = this.field2621.method1347((byte)122, 54, arg1);
            }

            class617 var7 = new class617();
            if (var6 != null) {
               var7.method4522(new class473(var6), 90);
            }

            class179 var8 = this.field2620;
            synchronized(this.field2620) {
               this.field2620.method1581((long)arg1, 0, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field2625[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hq",
      name = "a",
      descriptor = "(Lvca;ZZ)V",
      line = 37
   )
   public static final void method1506(class294 arg0, boolean arg1, boolean arg2) {
      arg0.field4087 = arg2;
      if (class593.field8538) {
         if (arg1) {
            class224.field3333[class224.field3333.length - 1].method2657(3, arg0);
         } else {
            int var3 = class483.method3655(arg0.field4089);
            int var4 = class738.field10598[2] * arg0.method590((byte)-79) / arg0.field4094;
            int var5 = class483.method3655(arg0.field4089 - var4);
            int var6 = class483.method3655(arg0.field4089 + var4);
            if (var5 == var6) {
               class224.field3333[var3].method2657(3, arg0);
            } else if (var6 - var5 == 1) {
               class224.field3333[class85.field1409 + var5].method2657(3, arg0);
            } else {
               class224.field3333[class224.field3333.length - 1].method2657(3, arg0);
            }
         }
      } else {
         class731.method5274(arg0, class265.field3778);
      }
   }

   @OriginalMember(
      owner = "client!hq",
      name = "a",
      descriptor = "(I)V",
      line = 73
   )
   public static void method1507(int arg0) {
      try {
         field2622 = null;
         if (arg0 < 3) {
            method1510(96, 122);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2625[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hq",
      name = "b",
      descriptor = "(I)V",
      line = 83
   )
   public final void method1508(int arg0) {
      try {
         class179 var2 = this.field2620;
         synchronized(this.field2620) {
            if (arg0 != 9) {
               field2622 = null;
            }

            this.field2620.method1591((byte)58);
         }

         ++field2617;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field2625[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hq",
      name = "b",
      descriptor = "(II)V",
      line = 96
   )
   public final void method1509(int arg0, int arg1) {
      try {
         ++field2623;
         class179 var3 = this.field2620;
         synchronized(this.field2620) {
            if (arg0 == 2) {
               this.field2620.method1579(108, arg1);
            }
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field2625[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hq",
      name = "a",
      descriptor = "(II)I",
      line = 111
   )
   public static final int method1510(int arg0, int arg1) {
      try {
         if (arg1 != 19383) {
            method1506((class294)null, false, false);
         }

         ++field2619;
         return arg0 >>> 8;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2625[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hq",
      name = "c",
      descriptor = "(I)V",
      line = 124
   )
   public final void method1511(int arg0) {
      try {
         ++field2616;
         if (arg0 >= 68) {
            class179 var2 = this.field2620;
            synchronized(this.field2620) {
               this.field2620.method1589((byte)81);
            }
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field2625[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hq",
      name = "a",
      descriptor = "(ZJ)Ljava/lang/String;",
      line = 143
   )
   public static final String method1512(boolean arg0, long arg1) {
      boolean var3 = client.field4564;

      try {
         ++field2624;
         if (arg1 > 0L && ~arg1 > -6582952005840035282L) {
            if (~(arg1 % 37L) == -1L) {
               return null;
            } else if (!arg0) {
               return null;
            } else {
               int var4 = 0;
               long var5 = arg1;
               if (var3) {
                  ++var4;
                  var5 = arg1 / 37L;
               }

               while(true) {
                  if (~var5 == -1L) {
                     StringBuffer var7 = new StringBuffer(var4);
                     if (!var3) {
                        if (!var3 && arg1 == 0L) {
                           return var7.reverse().toString();
                        } else {
                           do {
                              long var8 = arg1;
                              arg1 /= 37L;
                              var7.append(class128.field2143[(int)(var8 - arg1 * 37L)]);
                           } while(arg1 != 0L);

                           return var7.reverse().toString();
                        }
                     }
                  } else {
                     ++var4;
                  }

                  var5 /= 37L;
               }
            }
         } else {
            return null;
         }
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field2625[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hq",
      name = "<init>",
      descriptor = "(Lca;ILhw;)V",
      line = 183
   )
   public class166(class320 arg0, int arg1, class141 arg2) {
      try {
         this.field2621 = arg2;
         if (this.field2621 != null) {
            this.field2621.method1346(54, 0);
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field2625[2] + (arg0 != null ? field2625[1] : field2625[0]) + ',' + arg1 + ',' + (arg2 != null ? field2625[1] : field2625[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1513(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 22);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1514(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 23;
            break;
         case 1:
            var10005 = 65;
            break;
         case 2:
            var10005 = 85;
            break;
         case 3:
            var10005 = 42;
            break;
         default:
            var10005 = 22;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
