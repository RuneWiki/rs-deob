import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class138 {
   @OriginalMember(
      owner = "client!di",
      name = "i",
      descriptor = "Loi;"
   )
   private class80 field1754 = new class80(64);
   @OriginalMember(
      owner = "client!di",
      name = "n",
      descriptor = "Lkf;"
   )
   private class266 field1756;
   @OriginalMember(
      owner = "client!di",
      name = "j",
      descriptor = "Lkf;"
   )
   public class266 field1755;
   @OriginalMember(
      owner = "client!di",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1768 = new String[]{method1099(method1098("R\u0018_]\n")), method1099(method1098("R\u0018_^\n")), method1099(method1098("M__7_")), method1099(method1098("X\u0004\u001du")), method1099(method1098("R\u0018_[\n")), method1099(method1098("R\u0018_\\\n")), method1099(method1098("R\u0018_%KX\u0018\u0005'\n")), method1099(method1098("R\u0018_X\n")), method1099(method1098("R\u0018_Q\n")), method1099(method1098("R\u0018__\n")), method1099(method1098("R\u0018_Z\n"))};
   @OriginalMember(
      owner = "client!di",
      name = "m",
      descriptor = "Lek;"
   )
   public static class536 field1764 = new class536(73, 0);
   @OriginalMember(
      owner = "client!di",
      name = "b",
      descriptor = "I"
   )
   public static int field1765 = -1;
   @OriginalMember(
      owner = "client!di",
      name = "g",
      descriptor = "Lek;"
   )
   public static class536 field1767 = new class536(26, 7);
   @OriginalMember(
      owner = "client!di",
      name = "l",
      descriptor = "I"
   )
   public static int field1753;
   @OriginalMember(
      owner = "client!di",
      name = "o",
      descriptor = "I"
   )
   public static int field1757;
   @OriginalMember(
      owner = "client!di",
      name = "k",
      descriptor = "I"
   )
   public static int field1758;
   @OriginalMember(
      owner = "client!di",
      name = "f",
      descriptor = "I"
   )
   public static int field1759;
   @OriginalMember(
      owner = "client!di",
      name = "d",
      descriptor = "I"
   )
   public static int field1760;
   @OriginalMember(
      owner = "client!di",
      name = "c",
      descriptor = "I"
   )
   public static int field1761;
   @OriginalMember(
      owner = "client!di",
      name = "h",
      descriptor = "I"
   )
   public static int field1762;
   @OriginalMember(
      owner = "client!di",
      name = "a",
      descriptor = "I"
   )
   public static int field1763;
   @OriginalMember(
      owner = "client!di",
      name = "e",
      descriptor = "Z"
   )
   public static boolean field1766;

   @OriginalMember(
      owner = "client!di",
      name = "c",
      descriptor = "(I)V",
      line = 4
   )
   public static void method1090(int arg0) {
      try {
         field1767 = null;
         field1764 = null;
         if (arg0 != 26) {
            field1764 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1768[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!di",
      name = "b",
      descriptor = "(I)V",
      line = 19
   )
   public final void method1091(int arg0) {
      try {
         ++field1762;
         class80 var2 = this.field1754;
         synchronized(this.field1754) {
            this.field1754.method731(0);
         }

         int var3 = 109 / ((-79 - arg0) / 41);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field1768[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!di",
      name = "a",
      descriptor = "(BI)V",
      line = 31
   )
   public static final void method1092(byte arg0, int arg1) {
      try {
         if (arg0 != -97) {
            field1767 = null;
         }

         ++field1757;
         class755 var2 = class317.method2325((long)arg1, 99, 17);
         var2.method5481(arg0 + -26);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1768[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!di",
      name = "a",
      descriptor = "(II)Lvc;",
      line = 44
   )
   public final class337 method1093(int arg0, int arg1) {
      try {
         if (arg1 > -13) {
            this.method1091(114);
         }

         ++field1753;
         class80 var3 = this.field1754;
         class337 var4;
         synchronized(this.field1754) {
            var4 = (class337)this.field1754.method725(0, (long)arg0);
         }

         if (var4 != null) {
            return var4;
         } else {
            class266 var5 = this.field1756;
            byte[] var6;
            synchronized(this.field1756) {
               var6 = this.field1756.method2037(false, arg0, 3);
            }

            class337 var7 = new class337();
            var7.field4583 = this;
            if (var6 != null) {
               var7.method2486((byte)107, new class147(var6));
            }

            class80 var8 = this.field1754;
            synchronized(this.field1754) {
               this.field1754.method723(0, (long)arg0, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field1768[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!di",
      name = "a",
      descriptor = "([[BLrga;B)V",
      line = 74
   )
   public static final void method1094(byte[][] arg0, class253 arg1, byte arg2) {
      boolean var3 = client.field4360;

      try {
         int var4 = 0;
         byte var10000;
         if (var3) {
            class581.method4207(50);
            var10000 = 0;
         } else if (~var4 <= ~arg1.field9696) {
            var10000 = arg2;
            if (!var3) {
               if (arg2 >= 0) {
                  method1095((byte)122);
               }

               ++field1758;
               return;
            }
         } else {
            class581.method4207(50);
            var10000 = 0;
         }

         while(true) {
            int var5 = var10000;
            if (var3 || ~var5 > ~(class644.field9403 >> 3)) {
               do {
                  int var6 = 0;
                  if (var3 || ~(class337.field4594 >> 3) < ~var6) {
                     label120:
                     do {
                        int var7 = class470.field6756[var4][var5][var6];
                        if (var7 != -1) {
                           int var8 = (58722934 & var7) >> 24;
                           if (arg1.field9691 && var8 != 0) {
                              ++var6;
                           } else {
                              int var9 = (var7 & 7) >> 1;
                              int var10 = (var7 & 16776078) >> 14;
                              int var11 = (16382 & var7) >> 3;
                              int var12 = (var10 / 8 << 8) + var11 / 8;
                              int var13 = 0;
                              if (!var3 && ~class436.field6245.length >= ~var13) {
                                 ++var6;
                              } else {
                                 do {
                                    if (class436.field6245[var13] == var12) {
                                       if (arg0[var13] != null) {
                                          arg1.method1936((var11 & 7) * 8, 1, var9, (var10 & 7) * 8, var8, class383.field5543, var6 * 8, var4, var5 * 8, class767.field11309, arg0[var13]);
                                          if (!var3) {
                                             ++var6;
                                             continue label120;
                                          }

                                          ++var13;
                                       } else {
                                          ++var13;
                                       }
                                    } else {
                                       ++var13;
                                    }
                                 } while(~class436.field6245.length < ~var13);

                                 ++var6;
                              }
                           }
                        } else {
                           ++var6;
                        }
                     } while(~(class337.field4594 >> 3) < ~var6);
                  }

                  ++var5;
               } while(~var5 > ~(class644.field9403 >> 3));
            }

            ++var4;
            if (~var4 <= ~arg1.field9696) {
               var10000 = arg2;
               if (!var3) {
                  if (arg2 >= 0) {
                     method1095((byte)122);
                  }

                  ++field1758;
                  return;
               }
            } else {
               class581.method4207(50);
               var10000 = 0;
            }
         }
      } catch (RuntimeException var15) {
         throw class237.method1823(var15, field1768[4] + (arg0 != null ? field1768[2] : field1768[3]) + ',' + (arg1 != null ? field1768[2] : field1768[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!di",
      name = "a",
      descriptor = "(B)Ljava/lang/String;",
      line = 145
   )
   public static final String method1095(byte arg0) {
      try {
         ++field1761;
         if (!class131.field1677 && class521.field7496 != null) {
            return arg0 >= -114 ? null : class521.field7496.field459;
         } else {
            return "";
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1768[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!di",
      name = "a",
      descriptor = "(I)V",
      line = 161
   )
   public final void method1096(int arg0) {
      try {
         ++field1763;
         class80 var2 = this.field1754;
         synchronized(this.field1754) {
            if (arg0 <= 74) {
               field1766 = true;
            }

            this.field1754.method715(true);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field1768[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!di",
      name = "b",
      descriptor = "(II)V",
      line = 185
   )
   public final void method1097(int arg0, int arg1) {
      try {
         class80 var3 = this.field1754;
         synchronized(this.field1754) {
            this.field1754.method726(arg0, arg1 + 25317);
         }

         if (arg1 == 7) {
            ++field1760;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field1768[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!di",
      name = "<init>",
      descriptor = "(Lno;ILkf;Lkf;)V",
      line = 200
   )
   public class138(class732 arg0, int arg1, class266 arg2, class266 arg3) {
      try {
         this.field1756 = arg2;
         this.field1755 = arg3;
         this.field1756.method2060(2, 3);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field1768[6] + (arg0 != null ? field1768[2] : field1768[3]) + ',' + arg1 + ',' + (arg2 != null ? field1768[2] : field1768[3]) + ',' + (arg3 != null ? field1768[2] : field1768[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!di",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1098(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 34);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!di",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1099(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 54;
            break;
         case 1:
            var10005 = 113;
            break;
         case 2:
            var10005 = 113;
            break;
         case 3:
            var10005 = 25;
            break;
         default:
            var10005 = 34;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
