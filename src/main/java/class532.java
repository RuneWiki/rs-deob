import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class532 {
   @OriginalMember(
      owner = "client!ve",
      name = "e",
      descriptor = "[[F"
   )
   public float[][] field7590;
   @OriginalMember(
      owner = "client!ve",
      name = "b",
      descriptor = "[I"
   )
   public int[] field7592;
   @OriginalMember(
      owner = "client!ve",
      name = "g",
      descriptor = "[I"
   )
   public int[] field7593;
   @OriginalMember(
      owner = "client!ve",
      name = "c",
      descriptor = "[I"
   )
   public int[] field7588;
   @OriginalMember(
      owner = "client!ve",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7594 = new String[]{method3835(method3834("O]'-G")), method3835(method3834("B\u0016'?SZ\u001a}=\u0012")), method3835(method3834("Z\u0006eo")), method3835(method3834("B\u0016'A\u0012")), method3835(method3834("B\u0016'B\u0012"))};
   @OriginalMember(
      owner = "client!ve",
      name = "h",
      descriptor = "I"
   )
   public static int field7591 = 0;
   @OriginalMember(
      owner = "client!ve",
      name = "d",
      descriptor = "I"
   )
   public static int field7586;
   @OriginalMember(
      owner = "client!ve",
      name = "f",
      descriptor = "I"
   )
   public static int field7587;
   @OriginalMember(
      owner = "client!ve",
      name = "a",
      descriptor = "I"
   )
   public static int field7589;

   @OriginalMember(
      owner = "client!ve",
      name = "a",
      descriptor = "(IB)I",
      line = 9
   )
   public static final int method3832(int arg0, byte arg1) {
      try {
         if (arg1 != -47) {
            return 80;
         } else {
            ++field7587;
            return 255 & arg0;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7594[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ve",
      name = "a",
      descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
      line = 27
   )
   public static final String method3833(String arg0, int arg1) {
      boolean var2 = client.field4360;

      try {
         ++field7586;
         if (arg1 <= 123) {
            field7589 = -121;
         }

         StringBuffer var3 = new StringBuffer();
         int var4 = arg0.length();
         int var5 = 0;
         String var10000;
         if (var2) {
            var10000 = arg0;
         } else if (var4 <= var5) {
            var10000 = var3.toString();
            if (!var2) {
               return var10000;
            }
         } else {
            var10000 = arg0;
         }

         while(true) {
            label147: {
               char var6 = var10000.charAt(var5);
               if (var6 == '%' && ~(var5 + 2) > ~var4) {
                  int var8;
                  label156: {
                     char var7 = arg0.charAt(var5 + 1);
                     var8 = 0;
                     if (var7 >= '0' && var7 <= '9') {
                        var8 = var7 + -48;
                        if (!var2) {
                           break label156;
                        }
                     }

                     if (var7 >= 'a' && var7 <= 'f') {
                        var8 = var7 + '\n' + -97;
                        if (!var2) {
                           break label156;
                        }
                     }

                     if (var7 >= 'A' && ~var7 >= -71) {
                        var8 = var7 + '\n' + -65;
                        if (!var2) {
                           break label156;
                        }
                     }

                     var3.append('%');
                     if (!var2) {
                        ++var5;
                        break label147;
                     }
                  }

                  int var9 = var8 * 16;
                  var6 = arg0.charAt(var5 + 2);
                  if (~var6 <= -49 && var6 <= '9') {
                     var9 += var6 + -48;
                  } else {
                     label159: {
                        if (~var6 <= -98 && var6 <= 'f') {
                           var9 += var6 + -97 + 10;
                           if (!var2) {
                              break label159;
                           }
                        }

                        if (~var6 <= -66 && ~var6 >= -71) {
                           var9 += 10 - -var6 + -65;
                           if (var2) {
                              var9 += var6 + -48;
                           }
                        } else {
                           var3.append('%');
                           if (!var2) {
                              ++var5;
                              break label147;
                           }

                           var9 += 10 - -var6 + -65;
                           if (var2) {
                              var9 += var6 + -48;
                           }
                        }
                     }
                  }

                  if (~var9 != -1 && class342.method2510((byte)var9, -129)) {
                     var3.append(class312.method2306(true, (byte)var9));
                  }

                  var5 += 2;
                  if (!var2) {
                     ++var5;
                     break label147;
                  }
               }

               if (~var6 == -44) {
                  var3.append(' ');
                  if (var2) {
                     var3.append(var6);
                     ++var5;
                  } else {
                     ++var5;
                  }
               } else {
                  var3.append(var6);
                  ++var5;
               }
            }

            if (var4 <= var5) {
               var10000 = var3.toString();
               if (!var2) {
                  return var10000;
               }
            } else {
               var10000 = arg0;
            }
         }
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field7594[4] + (arg0 != null ? field7594[0] : field7594[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ve",
      name = "<init>",
      descriptor = "([I[I[I[[F)V",
      line = 104
   )
   public class532(int[] arg0, int[] arg1, int[] arg2, float[][] arg3) {
      try {
         this.field7590 = arg3;
         this.field7592 = arg1;
         this.field7593 = arg2;
         this.field7588 = arg0;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field7594[1] + (arg0 != null ? field7594[0] : field7594[2]) + ',' + (arg1 != null ? field7594[0] : field7594[2]) + ',' + (arg2 != null ? field7594[0] : field7594[2]) + ',' + (arg3 != null ? field7594[0] : field7594[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ve",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3834(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 58);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ve",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3835(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 52;
            break;
         case 1:
            var10005 = 115;
            break;
         case 2:
            var10005 = 9;
            break;
         case 3:
            var10005 = 3;
            break;
         default:
            var10005 = 58;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
