import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public class class248 {
   @OriginalMember(
      owner = "client!kea",
      name = "l",
      descriptor = "Ljava/lang/String;"
   )
   private String field3312 = field3328[3];
   @OriginalMember(
      owner = "client!kea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3328 = new String[]{method1876(method1875("D|sv\u0017\u0007")), method1876(method1875("D|sv\u0015\u0007")), method1876(method1875("T7<v!")), method1876(method1875("Al~4")), method1876(method1875("D|sv\u001a\u0007")), method1876(method1875("D|sv\u0014\u0007")), method1876(method1875("D|sv\u001d\u0007")), method1876(method1875("D|sv\u001b\u0007")), method1876(method1875("D|sv\u0018\u0007")), method1876(method1875("D|sv\u001e\u0007")), method1876(method1875("D|sv\u001f\u0007")), method1876(method1875("Xk")), method1876(method1875("D|sv\u0016\u0007"))};
   @OriginalMember(
      owner = "client!kea",
      name = "r",
      descriptor = "[[I"
   )
   public static int[][] field3311 = new int[][]{{6, 6}, {6, 6}, {6, 5, 5}, {5, 6, 5}, {5, 5, 6}, {6, 5, 5}, {5, 0, 4, 1}, {7, 7, 1, 2}, {7, 1, 2, 7}, {8, 9, 4, 0, 8, 9}, {0, 8, 9, 8, 9, 4}, {11, 0, 10, 11, 4, 2}, {6, 6}, {7, 7, 1, 2}, {7, 7, 1, 2}};
   @OriginalMember(
      owner = "client!kea",
      name = "b",
      descriptor = "Lsd;"
   )
   public static class101 field3325 = new class101(104, -2);
   @OriginalMember(
      owner = "client!kea",
      name = "g",
      descriptor = "I"
   )
   public static int field3326 = 0;
   @OriginalMember(
      owner = "client!kea",
      name = "j",
      descriptor = "C"
   )
   public char field3315;
   @OriginalMember(
      owner = "client!kea",
      name = "t",
      descriptor = "C"
   )
   public char field3324;
   @OriginalMember(
      owner = "client!kea",
      name = "d",
      descriptor = "I"
   )
   private int field3308;
   @OriginalMember(
      owner = "client!kea",
      name = "o",
      descriptor = "I"
   )
   public static int field3309;
   @OriginalMember(
      owner = "client!kea",
      name = "k",
      descriptor = "I"
   )
   public static int field3310;
   @OriginalMember(
      owner = "client!kea",
      name = "a",
      descriptor = "I"
   )
   public static int field3313;
   @OriginalMember(
      owner = "client!kea",
      name = "c",
      descriptor = "I"
   )
   public static int field3314;
   @OriginalMember(
      owner = "client!kea",
      name = "q",
      descriptor = "I"
   )
   private int field3317;
   @OriginalMember(
      owner = "client!kea",
      name = "f",
      descriptor = "I"
   )
   public static int field3320;
   @OriginalMember(
      owner = "client!kea",
      name = "m",
      descriptor = "I"
   )
   public static int field3321;
   @OriginalMember(
      owner = "client!kea",
      name = "i",
      descriptor = "I"
   )
   public static int field3322;
   @OriginalMember(
      owner = "client!kea",
      name = "p",
      descriptor = "I"
   )
   public static int field3323;
   @OriginalMember(
      owner = "client!kea",
      name = "n",
      descriptor = "I"
   )
   public static int field3327;
   @OriginalMember(
      owner = "client!kea",
      name = "h",
      descriptor = "Leaa;"
   )
   public static class526 field3318;
   @OriginalMember(
      owner = "client!kea",
      name = "e",
      descriptor = "Lwia;"
   )
   private class791 field3316;
   @OriginalMember(
      owner = "client!kea",
      name = "s",
      descriptor = "Lwia;"
   )
   public class791 field3319;

   @OriginalMember(
      owner = "client!kea",
      name = "a",
      descriptor = "(Ljava/lang/String;B)Z"
   )
   public final boolean method1864(String arg0, byte arg1) {
      int var3 = client.field4530;

      try {
         ++field3313;
         if (this.field3319 == null) {
            return false;
         } else {
            int var4 = 41 % ((arg1 - 55) / 49);
            if (this.field3316 == null) {
               this.method1873(15070);
            }

            class159 var5 = (class159)this.field3316.method5681(class738.method5375(arg0, (byte)-123), -1);
            if (var3 != 0) {
               if (var5.field2020.equals(arg0)) {
                  return true;
               }

               var5 = (class159)this.field3316.method5673(-53);
            }

            while(true) {
               boolean var10000;
               if (var5 == null) {
                  var10000 = false;
                  if (var3 == 0) {
                     return false;
                  }
               } else {
                  var10000 = var5.field2020.equals(arg0);
               }

               if (var10000) {
                  return true;
               }

               var5 = (class159)this.field3316.method5673(-53);
            }
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field3328[1] + (arg0 != null ? field3328[2] : field3328[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kea",
      name = "b",
      descriptor = "(B)I"
   )
   public static final int method1865(byte arg0) {
      try {
         ++field3327;
         if (arg0 != -112) {
            method1865((byte)28);
         }

         return class437.field6669;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3328[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kea",
      name = "b",
      descriptor = "(II)I"
   )
   public final int method1866(int arg0, int arg1) {
      try {
         int var3 = 55 / ((arg0 - 53) / 55);
         ++field3310;
         if (this.field3319 == null) {
            return this.field3308;
         } else {
            class10 var4 = (class10)this.field3319.method5681((long)arg1, -1);
            return var4 == null ? this.field3308 : var4.field141;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field3328[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kea",
      name = "a",
      descriptor = "(ILjj;I)V"
   )
   private final void method1867(int arg0, class128 arg1, int arg2) {
      int var4 = client.field4530;

      try {
         label82: {
            ++field3321;
            if (~arg2 != -2) {
               if (arg2 == 2) {
                  this.field3324 = class296.method2252(arg1.method1047((byte)-119), arg0 + -10000);
                  if (var4 == 0) {
                     break label82;
                  }
               }

               if (~arg2 != -4) {
                  if (~arg2 == -5) {
                     this.field3308 = arg1.method1041(arg0 ^ 13702);
                     if (var4 == 0) {
                        break label82;
                     }
                  }

                  if (~arg2 != -6 && ~arg2 != -7) {
                     break label82;
                  }

                  this.field3317 = arg1.method1038((byte)-124);
                  this.field3319 = new class791(class7.method63(this.field3317, false));
                  int var5 = 0;
                  if (var4 == 0 && this.field3317 <= var5) {
                     if (var4 == 0) {
                        break label82;
                     }
                  } else {
                     while(true) {
                        int var6;
                        class347 var7;
                        label71: {
                           var6 = arg1.method1041(4758);
                           if (~arg2 != -6) {
                              var7 = new class10(arg1.method1041(4758));
                              if (var4 == 0) {
                                 break label71;
                              }
                           }

                           var7 = new class391(arg1.method1083((byte)125));
                        }

                        this.field3319.method5682((long)var6, var7, (byte)7);
                        ++var5;
                        if (this.field3317 <= var5) {
                           if (var4 == 0) {
                              break label82;
                           }
                           break;
                        }
                     }
                  }
               }

               this.field3312 = arg1.method1083((byte)83);
               if (var4 == 0) {
                  break label82;
               }
            }

            this.field3315 = class296.method2252(arg1.method1047((byte)-105), 0);
         }

         if (arg0 != 10000) {
            this.field3324 = (char)65412;
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field3328[4] + arg0 + ',' + (arg1 != null ? field3328[2] : field3328[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kea",
      name = "a",
      descriptor = "(II)Ljava/lang/String;"
   )
   public final String method1868(int arg0, int arg1) {
      try {
         ++field3323;
         if (this.field3319 == null) {
            return this.field3312;
         } else {
            class391 var3 = (class391)this.field3319.method5681((long)arg1, -1);
            if (arg0 >= -64) {
               this.field3319 = null;
            }

            return var3 == null ? this.field3312 : var3.field5951;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field3328[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kea",
      name = "c",
      descriptor = "(B)V"
   )
   private final void method1869(byte arg0) {
      int var2 = client.field4530;

      try {
         this.field3316 = new class791(this.field3319.method5674((byte)-128));
         ++field3314;
         if (arg0 < 15) {
            this.method1866(-45, -37);
         }

         class10 var3 = (class10)this.field3319.method5677((byte)44);
         if (var2 != 0 || var3 != null) {
            do {
               class10 var4 = new class10((int)var3.field5280);
               this.field3316.method5682((long)var3.field141, var4, (byte)7);
               var3 = (class10)this.field3319.method5671(-99);
            } while(var3 != null);

         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field3328[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kea",
      name = "a",
      descriptor = "(Lha;IIIIIIZZ)V"
   )
   public static final void method1870(class66 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
      class261.field3550 = arg0;
      class259.field3510 = arg1;
      class667.field9877 = class259.field3510 > 1 && class261.field3550.method591();
      class459.field6950 = arg2;
      class768.field11264 = 1 << class459.field6950;
      class572.field8520 = class768.field11264 >> 1;
      Math.sqrt((double)(class572.field8520 * class572.field8520 + class572.field8520 * class572.field8520));
      class424.field6437 = arg3;
      class239.field3036 = arg4;
      class220.field2796 = arg5;
      class488.field7212 = arg6;
      class314.field4489 = class306.method2319((byte)-57);
      class313.method2360(-96);
      class293.field4084 = new class72[arg3][class239.field3036][class220.field2796];
      class147.field1843 = new class293[arg3];
      if (arg7) {
         class173.field2163 = new int[class239.field3036][class220.field2796];
         class583.field8642 = new byte[class239.field3036][class220.field2796];
         class661.field9571 = new short[class239.field3036][class220.field2796];
         class91.field1171 = new class72[1][class239.field3036][class220.field2796];
         class650.field9484 = new class293[1];
      } else {
         class173.field2163 = null;
         class583.field8642 = null;
         class661.field9571 = null;
         class91.field1171 = null;
         class650.field9484 = null;
      }

      if (arg8) {
         class544.field8093 = new long[arg3][arg4][arg5];
         class535.field7812 = new class33[65535];
         class442.field6736 = new boolean[65535];
         class48.field579 = 0;
      } else {
         class544.field8093 = null;
         class535.field7812 = null;
         class442.field6736 = null;
         class48.field579 = 0;
      }

      class284.method2172(false);
      class764.field11222 = new class616[2];
      class197.field2449 = new class616[2];
      class535.field7803 = new class616[2];
      class490.field7245 = new class616[10000];
      class301.field4290 = 0;
      class532.field7777 = new class616[5000];
      class425.field6460 = 0;
      class64.field789 = new class741[5000];
      class87.field1060 = 0;
      class569.field8487 = new boolean[class488.field7212 + class488.field7212 + 1][class488.field7212 + class488.field7212 + 1];
      class374.field5674 = new boolean[class488.field7212 + class488.field7212 + 2][class488.field7212 + class488.field7212 + 2];
      class190.field2372 = new int[class488.field7212 + class488.field7212 + 2];
      class499.field7394 = class499.field7386;
      if (class667.field9877) {
         class243.field3107 = new boolean[arg3][class488.field7212 + class488.field7212 + 1][class488.field7212 + class488.field7212 + 1];
         class18.field207 = new boolean[arg3][][];
         if (class102.field1244 != null) {
            class413.method3155();
         }

         class102.field1244 = new class229[class259.field3510];
         class261.field3550.method628(class102.field1244.length + 1);
         class261.field3550.method563(0);

         for(int var9 = 0; var9 < class102.field1244.length; ++var9) {
            class102.field1244[var9] = new class229(var9 + 1, class261.field3550);
            (new Thread(class102.field1244[var9], field3328[11] + var9)).start();
         }

         byte var10;
         if (class259.field3510 == 2) {
            var10 = 4;
            class705.field10556 = 2;
         } else if (class259.field3510 == 3) {
            var10 = 6;
            class705.field10556 = 3;
         } else {
            var10 = 8;
            class705.field10556 = 4;
         }

         class688.field10367 = new class400[var10];

         for(int var11 = 0; var11 < var10; ++var11) {
            class688.field10367[var11] = new class400(class490.field7241[class259.field3510 - 2][var11]);
         }
      } else {
         class705.field10556 = 1;
      }

      class2.field60 = new int[class705.field10556 - 1];
      class68.field861 = new int[class705.field10556 - 1];
   }

   @OriginalMember(
      owner = "client!kea",
      name = "a",
      descriptor = "(Ljj;I)V"
   )
   public final void method1871(class128 arg0, int arg1) {
      int var3 = client.field4530;

      try {
         while(true) {
            int var4 = arg0.method1104(255);
            if (var4 != 0) {
               this.method1867(10000, arg0, var4);
               if (var3 != 0) {
                  break;
               }

               if (var3 == 0) {
                  continue;
               }
            }

            if (arg1 < 20) {
               method1865((byte)39);
            }

            ++field3320;
            break;
         }

      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field3328[10] + (arg0 != null ? field3328[2] : field3328[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kea",
      name = "a",
      descriptor = "(IZ)Z"
   )
   public final boolean method1872(int arg0, boolean arg1) {
      try {
         ++field3309;
         if (this.field3319 == null) {
            return false;
         } else {
            if (!arg1) {
               this.method1868(-117, -97);
            }

            if (this.field3316 == null) {
               this.method1869((byte)82);
            }

            class10 var3 = (class10)this.field3316.method5681((long)arg0, -1);
            return var3 != null;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field3328[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kea",
      name = "a",
      descriptor = "(I)V"
   )
   private final void method1873(int arg0) {
      int var2 = client.field4530;

      try {
         this.field3316 = new class791(this.field3319.method5674((byte)-128));
         ++field3322;
         if (arg0 == 15070) {
            class391 var3 = (class391)this.field3319.method5677((byte)44);
            if (var2 != 0 || var3 != null) {
               do {
                  class159 var4 = new class159(var3.field5951, (int)var3.field5280);
                  this.field3316.method5682(class738.method5375(var3.field5951, (byte)-122), var4, (byte)7);
                  var3 = (class391)this.field3319.method5671(arg0 ^ -15031);
               } while(var3 != null);

            }
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field3328[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kea",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1874(byte arg0) {
      try {
         field3318 = null;
         field3325 = null;
         field3311 = null;
         if (arg0 >= -10) {
            method1874((byte)49);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3328[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1875(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 92);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1876(char[] arg0) {
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
            var10005 = 25;
            break;
         case 2:
            var10005 = 18;
            break;
         case 3:
            var10005 = 88;
            break;
         default:
            var10005 = 92;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
