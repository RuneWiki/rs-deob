import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class748 {
   @OriginalMember(
      owner = "client!dw",
      name = "w",
      descriptor = "Ljca;"
   )
   private class712 field11075;
   @OriginalMember(
      owner = "client!dw",
      name = "y",
      descriptor = "I"
   )
   private int field11072;
   @OriginalMember(
      owner = "client!dw",
      name = "a",
      descriptor = "I"
   )
   private int field11083;
   @OriginalMember(
      owner = "client!dw",
      name = "d",
      descriptor = "Lwia;"
   )
   private class791 field11076;
   @OriginalMember(
      owner = "client!dw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11097 = new String[]{method5462(method5461("@ezI;")), method5462(method5461("@ezA;")), method5462(method5461("@ezL;")), method5462(method5461("@ezJ;")), method5462(method5461("@ez[;")), method5462(method5461("W,7x")), method5462(method5461("Jg8g")), method5462(method5461("@ezE;")), method5462(method5461("_<z%n")), method5462(method5461("@ez@;")), method5462(method5461("@ezM;")), method5462(method5461("@ezF;")), method5462(method5461("@ezD;")), method5462(method5461("@ezG;")), method5462(method5461("@ez7zJ{ 5;")), method5462(method5461("@ezN;")), method5462(method5461("@ezO;")), method5462(method5461("@ezB;")), method5462(method5461("@ezC;")), method5462(method5461("@ezH;"))};
   @OriginalMember(
      owner = "client!dw",
      name = "x",
      descriptor = "Lsd;"
   )
   public static class101 field11087 = new class101(85, 3);
   @OriginalMember(
      owner = "client!dw",
      name = "o",
      descriptor = "[I"
   )
   public static int[] field11096 = new int[2];
   @OriginalMember(
      owner = "client!dw",
      name = "r",
      descriptor = "F"
   )
   public static float field11090;
   @OriginalMember(
      owner = "client!dw",
      name = "s",
      descriptor = "F"
   )
   public static float field11094;
   @OriginalMember(
      owner = "client!dw",
      name = "m",
      descriptor = "I"
   )
   public static int field11073;
   @OriginalMember(
      owner = "client!dw",
      name = "e",
      descriptor = "I"
   )
   public static int field11074;
   @OriginalMember(
      owner = "client!dw",
      name = "l",
      descriptor = "I"
   )
   public static int field11077;
   @OriginalMember(
      owner = "client!dw",
      name = "b",
      descriptor = "I"
   )
   public static int field11078;
   @OriginalMember(
      owner = "client!dw",
      name = "n",
      descriptor = "I"
   )
   public static int field11079;
   @OriginalMember(
      owner = "client!dw",
      name = "q",
      descriptor = "I"
   )
   public static int field11080;
   @OriginalMember(
      owner = "client!dw",
      name = "h",
      descriptor = "I"
   )
   public static int field11081;
   @OriginalMember(
      owner = "client!dw",
      name = "t",
      descriptor = "I"
   )
   public static int field11082;
   @OriginalMember(
      owner = "client!dw",
      name = "j",
      descriptor = "I"
   )
   public static int field11084;
   @OriginalMember(
      owner = "client!dw",
      name = "p",
      descriptor = "I"
   )
   public static int field11085;
   @OriginalMember(
      owner = "client!dw",
      name = "c",
      descriptor = "I"
   )
   public static int field11086;
   @OriginalMember(
      owner = "client!dw",
      name = "k",
      descriptor = "I"
   )
   public static int field11088;
   @OriginalMember(
      owner = "client!dw",
      name = "v",
      descriptor = "I"
   )
   public static int field11089;
   @OriginalMember(
      owner = "client!dw",
      name = "u",
      descriptor = "I"
   )
   public static int field11091;
   @OriginalMember(
      owner = "client!dw",
      name = "f",
      descriptor = "I"
   )
   public static int field11093;
   @OriginalMember(
      owner = "client!dw",
      name = "i",
      descriptor = "I"
   )
   public static int field11095;
   @OriginalMember(
      owner = "client!dw",
      name = "g",
      descriptor = "Loja;"
   )
   public static class477 field11092;

   @OriginalMember(
      owner = "client!dw",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method5445(int arg0) {
      int var2 = client.field4530;

      try {
         class175 var3 = (class175)this.field11075.method5158(0);
         int var10000;
         if (var2 != 0) {
            var10000 = var3.method1191((byte)-122);
         } else if (var3 == null) {
            ++field11079;
            var10000 = arg0;
            if (var2 == 0) {
               if (arg0 != 697465426) {
                  this.method5446(true);
                  return;
               }

               return;
            }
         } else {
            var10000 = var3.method1191((byte)-122);
         }

         while(true) {
            if (var10000 != 0) {
               var3.method2720(arg0 ^ 697465426);
               var3.method699(12);
               this.field11083 += var3.field2172;
            }

            var3 = (class175)this.field11075.method5163((byte)122);
            if (var3 == null) {
               ++field11079;
               var10000 = arg0;
               if (var2 == 0) {
                  if (arg0 != 697465426) {
                     this.method5446(true);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = var3.method1191((byte)-122);
            }
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field11097[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dw",
      name = "b",
      descriptor = "(Z)I"
   )
   public final int method5446(boolean arg0) {
      int var2 = client.field4530;

      try {
         if (!arg0) {
            method5457(true);
         }

         ++field11081;
         int var3 = 0;
         class175 var4 = (class175)this.field11075.method5158(0);
         if (var2 != 0) {
            if (!var4.method1191((byte)-42)) {
               ++var3;
            }

            var4 = (class175)this.field11075.method5163((byte)116);
         }

         while(true) {
            int var10000;
            if (var4 == null) {
               var10000 = var3;
               if (var2 == 0) {
                  return var3;
               }
            } else {
               var10000 = var4.method1191((byte)-42);
            }

            if (var10000 == 0) {
               ++var3;
            }

            var4 = (class175)this.field11075.method5163((byte)116);
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field11097[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dw",
      name = "a",
      descriptor = "(Ldfa;Z)V"
   )
   private final void method5447(class175 arg0, boolean arg1) {
      try {
         if (!arg1) {
            ++field11093;
            if (arg0 != null) {
               arg0.method2720(0);
               arg0.method699(12);
               this.field11083 += arg0.field2172;
            }
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field11097[11] + (arg0 != null ? field11097[8] : field11097[6]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dw",
      name = "c",
      descriptor = "(I)Ljava/lang/Object;"
   )
   public final Object method5448(int arg0) {
      int var2 = client.field4530;

      try {
         ++field11088;
         class175 var3 = (class175)this.field11076.method5677((byte)44);
         if (var2 == 0 && var3 == null) {
            if (arg0 != -19226) {
               this.method5447((class175)null, false);
            }

            return null;
         } else {
            do {
               Object var4 = var3.method1192(arg0 + 19225);
               if (var4 != null) {
                  return var4;
               }

               class175 var5 = var3;
               var3 = (class175)this.field11076.method5671(-108);
               var5.method2720(arg0 ^ -19226);
               var5.method699(12);
               this.field11083 += var5.field2172;
            } while(var3 != null);

            if (arg0 != -19226) {
               this.method5447((class175)null, false);
            }

            return null;
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field11097[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dw",
      name = "a",
      descriptor = "(IJLjava/lang/Object;I)V"
   )
   public final void method5449(int param1, long param2, Object param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!dw",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method5450(int arg0) {
      try {
         if (arg0 > -17) {
            this.method5454(-63L, 98);
         }

         ++field11089;
         return this.field11083;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11097[19] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dw",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method5451(int arg0) {
      try {
         this.field11075.method5162((byte)40);
         ++field11084;
         this.field11076.method5680(true);
         this.field11083 = this.field11072;
         int var2 = -15 % ((arg0 - -65) / 50);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field11097[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dw",
      name = "a",
      descriptor = "(BJ)V"
   )
   private final void method5452(byte arg0, long arg1) {
      try {
         ++field11082;
         class175 var4 = (class175)this.field11076.method5681(arg1, -1);
         this.method5447(var4, false);
         int var5 = -61 / ((8 - arg0) / 36);
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field11097[16] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dw",
      name = "b",
      descriptor = "(IZ)V"
   )
   public final void method5453(int arg0, boolean arg1) {
      int var3 = client.field4530;

      try {
         if (!arg1) {
            if (class394.field5973 != null) {
               class175 var4 = (class175)this.field11075.method5158(0);
               if (var3 != 0 || var4 != null) {
                  do {
                     label39: {
                        if (var4.method1191((byte)-128)) {
                           if (var4.method1192(-1) != null) {
                              break label39;
                           }

                           var4.method2720(0);
                           var4.method699(12);
                           this.field11083 += var4.field2172;
                           if (var3 == 0) {
                              break label39;
                           }
                        }

                        if ((long)arg0 < ++var4.field882) {
                           class175 var5 = class394.field5973.method1002(var4, (byte)114);
                           this.field11076.method5682(var4.field5280, var5, (byte)7);
                           class729.method5312((byte)-83, var5, var4);
                           var4.method2720(0);
                           var4.method699(12);
                        }
                     }

                     var4 = (class175)this.field11075.method5163((byte)105);
                  } while(var4 != null);
               }
            }

            ++field11086;
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field11097[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dw",
      name = "a",
      descriptor = "(JI)Ljava/lang/Object;"
   )
   public final Object method5454(long arg0, int arg1) {
      try {
         ++field11077;
         class175 var4 = (class175)this.field11076.method5681(arg0, -1);
         if (arg1 != 18261) {
            this.method5448(-30);
         }

         if (var4 == null) {
            return null;
         } else {
            Object var5 = var4.method1192(-1);
            if (var5 == null) {
               var4.method2720(0);
               var4.method699(arg1 ^ 18265);
               this.field11083 += var4.field2172;
               return null;
            } else {
               if (!var4.method1191((byte)-124)) {
                  this.field11075.method5164(var4, (byte)-105);
                  var4.field882 = 0L;
                  if (client.field4530 == 0) {
                     return var5;
                  }
               }

               class418 var6 = new class418(var5, var4.field2172);
               this.field11076.method5682(var4.field5280, var6, (byte)7);
               this.field11075.method5164(var6, (byte)-105);
               var6.field882 = 0L;
               var4.method2720(0);
               var4.method699(12);
               return var5;
            }
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field11097[15] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dw",
      name = "a",
      descriptor = "(ILjava/lang/Object;J)V"
   )
   public final void method5455(int arg0, Object arg1, long arg2) {
      try {
         ++field11080;
         if (arg0 != -2049) {
            field11090 = -0.22613497F;
         }

         this.method5449(31351, arg2, arg1, 1);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field11097[18] + arg0 + ',' + (arg1 != null ? field11097[8] : field11097[6]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dw",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class748(int arg0, int arg1) {
      this.field11075 = new class712();

      try {
         this.field11072 = arg0;
         this.field11083 = arg0;

         int var3;
         for(var3 = 1; ~arg0 < ~(var3 + var3) && ~arg1 < ~var3; var3 += var3) {
         }

         this.field11076 = new class791(var3);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field11097[14] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dw",
      name = "a",
      descriptor = "(BI[BI)Ljava/lang/String;"
   )
   public static final String method5456(byte arg0, int arg1, byte[] arg2, int arg3) {
      int var4 = client.field4530;

      try {
         ++field11078;
         char[] var5 = new char[arg1];
         int var6 = -89 / ((-44 - arg0) / 36);
         int var7 = 0;
         int var8 = arg3;
         int var9 = arg1 + arg3;
         if (var4 == 0 && var9 <= arg3) {
            return new String(var5, 0, var7);
         } else {
            do {
               int var11;
               label134: {
                  int var10 = arg2[var8++] & 255;
                  if (~var10 > -129) {
                     if (var10 != 0) {
                        var11 = var10;
                        if (var4 == 0) {
                           break label134;
                        }
                     }

                     var11 = 65533;
                     if (var4 == 0) {
                        break label134;
                     }
                  }

                  if (~var10 > -193) {
                     var11 = 65533;
                     if (var4 == 0) {
                        break label134;
                     }
                  }

                  if (~var10 <= -225) {
                     if (~var10 > -241) {
                        if (~var9 < ~(var8 + 1) && ~(192 & arg2[var8]) == -129 && (arg2[var8 + 1] & 192) == 128) {
                           var11 = (63 & arg2[var8++]) << 6 | (var10 & 15) << 12 | 63 & arg2[var8++];
                           if (~var11 <= -2049) {
                              break label134;
                           }

                           var11 = 65533;
                           if (var4 == 0) {
                              break label134;
                           }
                        }

                        var11 = 65533;
                        if (var4 == 0) {
                           break label134;
                        }
                     }

                     if (var10 < 248) {
                        if (var9 <= var8 + 2 || ~(arg2[var8] & 192) != -129 || ~(192 & arg2[var8 + 1]) != -129 || ~(192 & arg2[var8 + 2]) != -129) {
                           var11 = 65533;
                           if (var4 == 0) {
                              break label134;
                           }
                        }

                        int var12 = (63 & arg2[var8++]) << 12 | (var10 & 7) << 18 | (arg2[var8++] & 63) << 6 | 63 & arg2[var8++];
                        if (var12 >= 65536 && ~var12 >= -1114112) {
                           var11 = 65533;
                           if (var4 == 0) {
                              break label134;
                           }
                        }

                        var11 = 65533;
                        if (var4 == 0) {
                           break label134;
                        }
                     }

                     var11 = 65533;
                     if (var4 == 0) {
                        break label134;
                     }
                  }

                  if (~var9 >= ~var8 || ~(arg2[var8] & 192) != -129) {
                     var11 = 65533;
                     if (var4 == 0) {
                        break label134;
                     }
                  }

                  var11 = 1984 & var10 << 6 | 63 & arg2[var8++];
                  if (var11 < 128) {
                     var11 = 65533;
                  }
               }

               var5[var7++] = (char)var11;
            } while(var9 > var8);

            return new String(var5, 0, var7);
         }
      } catch (RuntimeException var14) {
         throw class670.method4877(var14, field11097[12] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11097[8] : field11097[6]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dw",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method5457(boolean arg0) {
      try {
         field11096 = null;
         if (!arg0) {
            field11090 = 0.18282506F;
         }

         field11092 = null;
         field11087 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field11097[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dw",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method5458(byte arg0) {
      try {
         ++field11091;
         return arg0 != 100 ? -30 : this.field11072;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11097[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dw",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class748(int arg0) {
      this(arg0, arg0);
   }

   @OriginalMember(
      owner = "client!dw",
      name = "a",
      descriptor = "(IZ)I"
   )
   public static final int method5459(int arg0, boolean arg1) {
      try {
         ++field11074;
         int var2 = class4.field85;
         if (var2 != 0) {
            if (~var2 == -2) {
               return class538.field7870;
            }

            if (~var2 != -3) {
               if (arg0 != 629165702) {
                  method5457(true);
               }

               return 0;
            }

            if (client.field4530 == 0) {
               return 0;
            }
         }

         return arg1 ? 0 : class538.field7870;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field11097[13] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dw",
      name = "b",
      descriptor = "(B)Ljava/lang/Object;"
   )
   public final Object method5460(byte arg0) {
      int var2 = client.field4530;

      try {
         int var3 = 73 / ((arg0 - -14) / 48);
         ++field11073;
         class175 var4 = (class175)this.field11076.method5671(84);
         if (var2 == 0 && var4 == null) {
            return null;
         } else {
            do {
               Object var5 = var4.method1192(-1);
               if (var5 != null) {
                  return var5;
               }

               class175 var6 = var4;
               var4 = (class175)this.field11076.method5671(-123);
               var6.method2720(0);
               var6.method699(12);
               this.field11083 += var6.field2172;
            } while(var4 != null);

            return null;
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field11097[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5461(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 19);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5462(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 36;
            break;
         case 1:
            var10005 = 18;
            break;
         case 2:
            var10005 = 84;
            break;
         case 3:
            var10005 = 11;
            break;
         default:
            var10005 = 19;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
