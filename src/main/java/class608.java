import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class608 extends class594 {
   @OriginalMember(
      owner = "client!iu",
      name = "Mb",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8539 = new String[]{method4445(method4444("gH6u$")), method4445(method4444("gH6p$")), method4445(method4444("gH6r$")), method4445(method4444("gH6s$")), method4445(method4444("GSnP`gY8CmjT`\u000b")), method4445(method4444("`Ht]")), method4445(method4444("u\u00136\u001fq")), method4445(method4444("gH6t$"))};
   @OriginalMember(
      owner = "client!iu",
      name = "Jb",
      descriptor = "[Lmk;"
   )
   public static class61[] field8533 = new class61[14];
   @OriginalMember(
      owner = "client!iu",
      name = "Ib",
      descriptor = "I"
   )
   public static int field8538 = 0;
   @OriginalMember(
      owner = "client!iu",
      name = "Kb",
      descriptor = "I"
   )
   public static int field8534;
   @OriginalMember(
      owner = "client!iu",
      name = "Gb",
      descriptor = "I"
   )
   public static int field8535;
   @OriginalMember(
      owner = "client!iu",
      name = "Hb",
      descriptor = "I"
   )
   public static int field8536;
   @OriginalMember(
      owner = "client!iu",
      name = "Lb",
      descriptor = "I"
   )
   public static int field8537;

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(IF)V"
   )
   public final void method4439(int arg0, float arg1) {
      try {
         ++field8535;
         int var3 = Stream.floatToRawIntBits(arg1);
         super.field8227[super.field8243++] = (byte)var3;
         if (arg0 == -865887192) {
            super.field8227[super.field8243++] = (byte)(var3 >> 8);
            super.field8227[super.field8243++] = (byte)(var3 >> 16);
            super.field8227[super.field8243++] = (byte)(var3 >> 24);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field8539[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(IIII)V"
   )
   public static final void method4440(int arg0, int arg1, int arg2, int arg3) {
      try {
         int var7 = arg0 << 3;
         int var4 = -123 / ((arg1 - -35) / 47);
         int var8 = arg2 << 3;
         int var9 = arg3 << 3;
         ++field8536;
         class363.field5142 = (float)var9;
         if (class635.field8977 == 2) {
            class191.field2317 = var7;
            class171.field2144 = var8;
            class749.field10899 = var9;
         }

         class676.field9918 = (float)var8;
         class373.method2887(-123);
         class424.field5950 = true;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field8539[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class608(int arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!iu",
      name = "l",
      descriptor = "(B)V"
   )
   public static void method4441(byte arg0) {
      try {
         if (arg0 >= 104) {
            field8533 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field8539[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(ZILjava/lang/String;I)I"
   )
   public static final int method4442(boolean arg0, int arg1, String arg2, int arg3) {
      boolean var4 = client.field4273;

      try {
         ++field8534;
         if (arg3 >= 2 && arg3 <= 36) {
            boolean var5 = false;
            byte var6 = 0;
            int var7 = 0;
            int var8 = arg2.length();
            int var9 = arg1;
            char var10000;
            if (var4) {
               var10000 = arg2.charAt(arg1);
            } else if (~arg1 <= ~var8) {
               var10000 = (char)var6;
               if (!var4) {
                  if (var6 == 0) {
                     throw new NumberFormatException();
                  }

                  return var7;
               }
            } else {
               var10000 = arg2.charAt(arg1);
            }

            while(true) {
               label175: {
                  char var10 = var10000;
                  if (var9 == 0) {
                     if (~var10 == -46) {
                        var5 = true;
                        if (!var4) {
                           ++var9;
                           break label175;
                        }
                     }

                     if (~var10 == -44 && arg0 && !var4) {
                        ++var9;
                        break label175;
                     }
                  }

                  int var11;
                  int var14;
                  if (var10 >= '0' && var10 <= '9') {
                     var14 = var10 - '0';
                     if (arg3 <= var14) {
                        throw new NumberFormatException();
                     }

                     if (var5) {
                        var14 = -var14;
                     }

                     var11 = arg3 * var7 + var14;
                     if (~(var11 / arg3) != ~var7) {
                        throw new NumberFormatException();
                     }

                     var6 = 1;
                     var7 = var11;
                     ++var9;
                  } else {
                     if (~var10 <= -66) {
                        if (var10 > 'Z') {
                           if (~var10 > -98 || ~var10 < -123) {
                              break;
                           }

                           var14 = var10 - 'W';
                           if (var4) {
                              var14 -= 55;
                              if (var4) {
                                 var14 -= 48;
                              }
                           }
                        } else {
                           var14 = var10 - '7';
                           if (var4) {
                              var14 -= 48;
                           }
                        }
                     } else {
                        if (~var10 > -98 || ~var10 < -123) {
                           break;
                        }

                        var14 = var10 - 'W';
                        if (var4) {
                           var14 -= 55;
                           if (var4) {
                              var14 -= 48;
                           }
                        }
                     }

                     if (arg3 <= var14) {
                        throw new NumberFormatException();
                     }

                     if (var5) {
                        var14 = -var14;
                     }

                     var11 = arg3 * var7 + var14;
                     if (~(var11 / arg3) != ~var7) {
                        throw new NumberFormatException();
                     }

                     var6 = 1;
                     var7 = var11;
                     ++var9;
                  }
               }

               if (~var9 <= ~var8) {
                  var10000 = (char)var6;
                  if (!var4) {
                     if (var6 == 0) {
                        throw new NumberFormatException();
                     }

                     return var7;
                  }
               } else {
                  var10000 = arg2.charAt(var9);
               }
            }

            throw new NumberFormatException();
         } else {
            throw new IllegalArgumentException(field8539[4] + arg3);
         }
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field8539[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8539[6] : field8539[5]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "b",
      descriptor = "(IF)V"
   )
   public final void method4443(int arg0, float arg1) {
      try {
         ++field8537;
         int var3 = Stream.floatToRawIntBits(arg1);
         super.field8227[super.field8243++] = (byte)(var3 >> 24);
         super.field8227[super.field8243++] = (byte)(var3 >> 16);
         if (arg0 >= -61) {
            field8538 = 9;
         }

         super.field8227[super.field8243++] = (byte)(var3 >> 8);
         super.field8227[super.field8243++] = (byte)var3;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field8539[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4444(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 12);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4445(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 14;
            break;
         case 1:
            var10005 = 61;
            break;
         case 2:
            var10005 = 24;
            break;
         case 3:
            var10005 = 49;
            break;
         default:
            var10005 = 12;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
