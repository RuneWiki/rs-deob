import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class65 {
   @OriginalMember(
      owner = "client!dv",
      name = "a",
      descriptor = "Llj;"
   )
   private class304 field854 = new class304(64);
   @OriginalMember(
      owner = "client!dv",
      name = "d",
      descriptor = "Lrr;"
   )
   private class678 field861;
   @OriginalMember(
      owner = "client!dv",
      name = "b",
      descriptor = "I"
   )
   public int field857;
   @OriginalMember(
      owner = "client!dv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field867 = new String[]{method507(method506("7q],H")), method507(method506("()]A\u001d")), method507(method506("7q]%H")), method507(method506("=r\u001f\u0003")), method507(method506("7q]'H")), method507(method506("7q]S\t=n\u0007QH")), method507(method506("7q].H")), method507(method506("7q]&H")), method507(method506("7q]*H")), method507(method506("7q])H")), method507(method506("7q]+H")), method507(method506("7q]-H")), method507(method506("7q](H")), method507(method506("&k")), method507(method506("&j"))};
   @OriginalMember(
      owner = "client!dv",
      name = "j",
      descriptor = "Ljava/lang/String;"
   )
   public static String field860 = null;
   @OriginalMember(
      owner = "client!dv",
      name = "m",
      descriptor = "I"
   )
   public static int field855;
   @OriginalMember(
      owner = "client!dv",
      name = "k",
      descriptor = "I"
   )
   public static int field856;
   @OriginalMember(
      owner = "client!dv",
      name = "i",
      descriptor = "I"
   )
   public static int field858;
   @OriginalMember(
      owner = "client!dv",
      name = "c",
      descriptor = "I"
   )
   public static int field859;
   @OriginalMember(
      owner = "client!dv",
      name = "l",
      descriptor = "I"
   )
   public static int field862;
   @OriginalMember(
      owner = "client!dv",
      name = "h",
      descriptor = "I"
   )
   public static int field863;
   @OriginalMember(
      owner = "client!dv",
      name = "g",
      descriptor = "I"
   )
   public static int field864;
   @OriginalMember(
      owner = "client!dv",
      name = "e",
      descriptor = "I"
   )
   public static int field865;
   @OriginalMember(
      owner = "client!dv",
      name = "f",
      descriptor = "I"
   )
   public static int field866;

   @OriginalMember(
      owner = "client!dv",
      name = "b",
      descriptor = "(III)Z",
      line = 3
   )
   public static final boolean method496(int arg0, int arg1, int arg2) {
      try {
         ++field863;
         if (arg1 < 96) {
            return false;
         } else {
            return ~(2048 & arg2) != -1 | class348.method2803(arg0, false, arg2) || class246.method2092((byte)-40, arg0, arg2);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field867[11] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dv",
      name = "a",
      descriptor = "(III)Z",
      line = 16
   )
   public static final boolean method497(int arg0, int arg1, int arg2) {
      try {
         ++field859;
         if (arg1 != -9471) {
            method499(true);
         }

         return ~(arg0 & 384) != -1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field867[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dv",
      name = "a",
      descriptor = "(BI)V",
      line = 27
   )
   public final void method498(byte arg0, int arg1) {
      try {
         ++field862;
         class304 var3 = this.field854;
         synchronized(this.field854) {
            if (arg0 != 122) {
               this.method504((byte)-64);
            }

            this.field854.method2552(arg1, 21533);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field867[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dv",
      name = "a",
      descriptor = "(Z)V",
      line = 45
   )
   public static final void method499(boolean arg0) {
      boolean var1 = client.field1786;

      try {
         int var2;
         int var3;
         int var7;
         label78: {
            ++field866;
            class735.method5409((byte)20, class687.field10213.field527.method4483(480102311));
            var2 = (class401.field6288 >> 12) + (class120.field1694 >> 3);
            var3 = (class691.field10259 >> 12) + (class119.field1606 >> 3);
            class464.field7054 = class476.field7251.field1506 = 0;
            class476.field7251.method58(8, 0, 8);
            byte var4 = 18;
            class432.field6654 = new byte[var4][];
            class614.field8918 = new int[var4];
            class398.field6243 = new int[var4][4];
            class341.field5192 = new byte[var4][];
            class511.field7815 = new byte[var4][];
            class62.field796 = new int[var4];
            class147.field2216 = new int[var4];
            class190.field2943 = new int[var4];
            class104.field1448 = new int[var4];
            class332.field5034 = new byte[var4][];
            class109.field1510 = new int[var4];
            class689.field10244 = new byte[var4][];
            int var5 = 0;
            int var6 = (-(class513.field7828 >> 4) + var2) / 8;
            if (var1) {
               var7 = (-(class475.field7230 >> 4) + var3) / 8;
            } else if (var6 > ((class513.field7828 >> 4) + var2) / 8) {
               var7 = var5;
               if (!var1) {
                  break label78;
               }
            } else {
               var7 = (-(class475.field7230 >> 4) + var3) / 8;
            }

            while(true) {
               if (var1 || ~(((class475.field7230 >> 4) + var3) / 8) <= ~var7) {
                  do {
                     int var8 = (var6 << 8) + var7;
                     class62.field796[var5] = var8;
                     class614.field8918[var5] = class742.field11031.method4999("m" + var6 + "_" + var7, (byte)42);
                     class104.field1448[var5] = class742.field11031.method4999("l" + var6 + "_" + var7, (byte)74);
                     class190.field2943[var5] = class742.field11031.method4999("n" + var6 + "_" + var7, (byte)126);
                     class109.field1510[var5] = class742.field11031.method4999(field867[14] + var6 + "_" + var7, (byte)121);
                     class147.field2216[var5] = class742.field11031.method4999(field867[13] + var6 + "_" + var7, (byte)72);
                     if (class190.field2943[var5] == -1) {
                        class614.field8918[var5] = -1;
                        class104.field1448[var5] = -1;
                        class109.field1510[var5] = -1;
                        class147.field2216[var5] = -1;
                     }

                     ++var5;
                     ++var7;
                  } while(~(((class475.field7230 >> 4) + var3) / 8) <= ~var7);
               }

               ++var6;
               if (var6 > ((class513.field7828 >> 4) + var2) / 8) {
                  var7 = var5;
                  if (!var1) {
                     break;
                  }
               } else {
                  var7 = (-(class475.field7230 >> 4) + var3) / 8;
               }
            }
         }

         if (var1) {
            class190.field2943[var7] = -1;
            class614.field8918[var7] = -1;
            class104.field1448[var7] = -1;
            class109.field1510[var7] = -1;
            class147.field2216[var7] = -1;
            ++var7;
         }

         while(true) {
            while(class190.field2943.length > var7) {
               class190.field2943[var7] = -1;
               class614.field8918[var7] = -1;
               class104.field1448[var7] = -1;
               class109.field1510[var7] = -1;
               class147.field2216[var7] = -1;
               ++var7;
            }

            if (!var1) {
               if (!arg0) {
                  field860 = null;
               }

               byte var9;
               label48: {
                  if (~class342.field5204 != -4) {
                     if (~class342.field5204 != -10) {
                        if (~class342.field5204 != -8) {
                           throw new RuntimeException(String.valueOf(class342.field5204));
                        }

                        var9 = 8;
                        if (!var1) {
                           break label48;
                        }
                     }

                     var9 = 10;
                     if (!var1) {
                        break label48;
                     }
                  }

                  var9 = 4;
               }

               class510.method3965(false, var3, var9, var2, (byte)68);
               return;
            }

            ++var7;
         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field867[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dv",
      name = "a",
      descriptor = "(I)V",
      line = 139
   )
   public final void method500(int arg0) {
      try {
         if (arg0 != -10) {
            method501((class678)null, -103, 19, 89, (byte)-45, true, 70);
         }

         ++field855;
         class304 var2 = this.field854;
         synchronized(this.field854) {
            this.field854.method2554(-98);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field867[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dv",
      name = "a",
      descriptor = "(Lrr;IIIBZI)V",
      line = 153
   )
   public static final void method501(class678 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5, int arg6) {
      try {
         class489.field7417 = null;
         class326.field4957 = 1;
         class618.field8993 = arg1;
         if (arg4 != -26) {
            field860 = null;
         }

         class61.field788 = arg2;
         class218.field3277 = arg0;
         class487.field7407 = arg5;
         class583.field8598 = arg6;
         ++field856;
         class222.field3337 = arg3;
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field867[6] + (arg0 != null ? field867[1] : field867[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dv",
      name = "a",
      descriptor = "(ZI)Lkn;",
      line = 176
   )
   public final class116 method502(boolean arg0, int arg1) {
      try {
         ++field865;
         class304 var3 = this.field854;
         class116 var4;
         synchronized(this.field854) {
            var4 = (class116)this.field854.method2544(false, (long)arg1);
         }

         if (var4 != null) {
            return var4;
         } else {
            class678 var5 = this.field861;
            byte[] var6;
            synchronized(this.field861) {
               var6 = this.field861.method5017(16, arg1, (byte)71);
            }

            class116 var7 = new class116();
            if (var6 != null) {
               var7.method1074(new class354(var6), 0);
            }

            class304 var8 = this.field854;
            synchronized(this.field854) {
               if (!arg0) {
                  method501((class678)null, -127, -96, 0, (byte)-90, false, -62);
               }

               this.field854.method2545((long)arg1, 111, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field867[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dv",
      name = "a",
      descriptor = "(B)V",
      line = 210
   )
   public static void method503(byte arg0) {
      try {
         if (arg0 != 106) {
            method497(92, 74, -29);
         }

         field860 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field867[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dv",
      name = "<init>",
      descriptor = "(Ltv;ILrr;)V",
      line = 305
   )
   public class65(class311 arg0, int arg1, class678 arg2) {
      try {
         this.field861 = arg2;
         if (this.field861 != null) {
            this.field857 = this.field861.method4998((byte)-82, 16);
         } else {
            this.field857 = 0;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field867[5] + (arg0 != null ? field867[1] : field867[3]) + ',' + arg1 + ',' + (arg2 != null ? field867[1] : field867[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dv",
      name = "b",
      descriptor = "(B)V",
      line = 227
   )
   public final void method504(byte arg0) {
      try {
         int var2 = -89 % ((9 - arg0) / 37);
         class304 var3 = this.field854;
         synchronized(this.field854) {
            this.field854.method2551(true);
         }

         ++field858;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field867[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dv",
      name = "a",
      descriptor = "(Lria;I)I",
      line = 239
   )
   public static final int method505(class185 arg0, int arg1) {
      try {
         int var2 = -62 / ((arg1 - 16) / 42);
         ++field864;
         String var3 = class111.method1050(-11382, arg0);
         int[] var4 = null;
         if (class656.method4832(arg0.field2896, (byte)124)) {
            var4 = class247.field3763.method2058(-11, (int)arg0.field2907).field1931;
         } else if (arg0.field2905 != -1) {
            var4 = class247.field3763.method2058(-11, arg0.field2905).field1931;
         } else if (class115.method1069(arg0.field2896, (byte)100)) {
            class795 var5 = (class795)class501.field7665.method3141((long)((int)arg0.field2907), true);
            if (var5 != null) {
               class466 var6 = var5.field11592;
               class344 var7 = var6.field7072;
               if (var7.field5221 != null) {
                  var7 = var7.method2782((byte)79, class45.field599);
               }

               if (var7 != null) {
                  var4 = var7.field5234;
               }
            }
         } else if (class225.method1953(-128, arg0.field2896)) {
            class333 var8 = class102.field1434.method1411((int)(arg0.field2907 >>> 32 & 2147483647L), -74);
            if (var8.field5088 != null) {
               var8 = var8.method2714(class45.field599, -1);
            }

            if (var8 != null) {
               var4 = var8.field5057;
            }
         }

         if (var4 != null) {
            var3 = var3 + class202.method1765(var4, 95);
         }

         int var9 = class355.field5457.method5119(var3, class610.field8880, (byte)127);
         if (arg0.field2908) {
            var9 += class547.field8198.method2104() + 4;
         }

         return var9;
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field867[2] + (arg0 != null ? field867[1] : field867[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method506(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 96);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method507(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 83;
            break;
         case 1:
            var10005 = 7;
            break;
         case 2:
            var10005 = 115;
            break;
         case 3:
            var10005 = 111;
            break;
         default:
            var10005 = 96;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
