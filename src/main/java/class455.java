import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pea")
public class class455 {
   @OriginalMember(
      owner = "client!pea",
      name = "g",
      descriptor = "I"
   )
   private int field6607 = -1;
   @OriginalMember(
      owner = "client!pea",
      name = "j",
      descriptor = "[Ljava/lang/String;"
   )
   private String[] field6613 = new String[0];
   @OriginalMember(
      owner = "client!pea",
      name = "a",
      descriptor = "Z"
   )
   private boolean field6603 = false;
   @OriginalMember(
      owner = "client!pea",
      name = "d",
      descriptor = "I"
   )
   private int field6614;
   @OriginalMember(
      owner = "client!pea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6621 = new String[]{method3511(method3510("oJsW")), method3511(method3510("z\u00111\u00157")), method3511(method3510("qZ~\u0015\f)")), method3511(method3510("qZ~\u0015\u0003)")), method3511(method3510("qZ~\u0015vhQvOt)")), method3511(method3510("-\u001f")), method3511(method3510("qZ~\u0015>nlkI#oX7")), method3511(method3510("qZ~\u0015\u0002)")), method3511(method3510("qZ~\u0015\u000e)")), method3511(method3510("qZ~\u0015\r)")), method3511(method3510("qZ~\u0015\u000f)")), method3511(method3510("qZ~\u0015\u000b)")), method3511(method3510("qZ~\u0015\b)")), method3511(method3510("qZ~\u0015\t)"))};
   @OriginalMember(
      owner = "client!pea",
      name = "h",
      descriptor = "Z"
   )
   public static boolean field6615 = false;
   @OriginalMember(
      owner = "client!pea",
      name = "f",
      descriptor = "Lhha;"
   )
   public static class724 field6608 = new class724(131, 6);
   @OriginalMember(
      owner = "client!pea",
      name = "n",
      descriptor = "Liw;"
   )
   public static class107 field6619 = new class107(32);
   @OriginalMember(
      owner = "client!pea",
      name = "q",
      descriptor = "I"
   )
   public static int field6620 = 0;
   @OriginalMember(
      owner = "client!pea",
      name = "k",
      descriptor = "I"
   )
   public static int field6604;
   @OriginalMember(
      owner = "client!pea",
      name = "b",
      descriptor = "I"
   )
   public static int field6605;
   @OriginalMember(
      owner = "client!pea",
      name = "o",
      descriptor = "I"
   )
   public static int field6606;
   @OriginalMember(
      owner = "client!pea",
      name = "e",
      descriptor = "I"
   )
   public static int field6609;
   @OriginalMember(
      owner = "client!pea",
      name = "c",
      descriptor = "I"
   )
   public static int field6610;
   @OriginalMember(
      owner = "client!pea",
      name = "r",
      descriptor = "I"
   )
   public static int field6612;
   @OriginalMember(
      owner = "client!pea",
      name = "i",
      descriptor = "I"
   )
   public static int field6616;
   @OriginalMember(
      owner = "client!pea",
      name = "m",
      descriptor = "I"
   )
   public static int field6617;
   @OriginalMember(
      owner = "client!pea",
      name = "l",
      descriptor = "I"
   )
   public static int field6618;
   @OriginalMember(
      owner = "client!pea",
      name = "p",
      descriptor = "[S"
   )
   public static short[] field6611;

   @OriginalMember(
      owner = "client!pea",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method3501(int arg0) {
      try {
         field6611 = null;
         int var1 = -16 / ((71 - arg0) / 54);
         field6619 = null;
         field6608 = null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6621[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pea",
      name = "a",
      descriptor = "(I[B)Ljava/lang/String;"
   )
   public static final String method3502(int arg0, byte[] arg1) {
      try {
         if (arg0 != 7094) {
            return null;
         } else {
            ++field6609;
            return class724.method5241(arg1, 0, (byte)-37, arg1.length);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6621[10] + arg0 + ',' + (arg1 != null ? field6621[1] : field6621[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pea",
      name = "a",
      descriptor = "(Ljava/lang/String;I)V"
   )
   public final void method3503(String arg0, int arg1) {
      try {
         ++field6617;
         this.method3509(8, arg0, this.field6607 + arg1);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6621[2] + (arg0 != null ? field6621[1] : field6621[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pea",
      name = "a",
      descriptor = "(BI)I"
   )
   private final int method3504(byte arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         if (arg0 >= -50) {
            return 56;
         } else {
            ++field6618;
            int var4 = this.field6613.length;
            int var10000;
            if (var3) {
               var10000 = this.field6603;
            } else if (~arg1 > ~var4) {
               var10000 = var4;
               if (!var3) {
                  return var4;
               }
            } else {
               var10000 = this.field6603;
            }

            while(true) {
               if (var10000 == 0) {
                  var4 += this.field6614;
                  if (var3) {
                     if (~var4 == -1) {
                        var4 = 1;
                        if (var3) {
                           var4 = this.field6614 * var4;
                        }
                     } else {
                        var4 = this.field6614 * var4;
                     }
                  }
               } else if (~var4 == -1) {
                  var4 = 1;
                  if (var3) {
                     var4 = this.field6614 * var4;
                  }
               } else {
                  var4 = this.field6614 * var4;
               }

               if (~arg1 > ~var4) {
                  var10000 = var4;
                  if (!var3) {
                     return var4;
                  }
               } else {
                  var10000 = this.field6603;
               }
            }
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field6621[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pea",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      boolean var1 = client.field10022;

      try {
         ++field6612;
         StringBuffer var2 = new StringBuffer();
         var2.append("[");
         int var3 = 0;
         if (var1) {
            if (~var3 != -1) {
               var2.append(field6621[5]);
            }

            var2.append(this.field6613[var3]);
            ++var3;
         }

         while(true) {
            while(this.field6607 > var3) {
               if (~var3 != -1) {
                  var2.append(field6621[5]);
               }

               var2.append(this.field6613[var3]);
               ++var3;
            }

            var2.append("]");
            if (!var1) {
               return var2.toString();
            }

            ++var3;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field6621[6] + ')');
      }
   }

   @OriginalMember(
      owner = "client!pea",
      name = "a",
      descriptor = "(IZ)V"
   )
   private final void method3505(int arg0, boolean arg1) {
      try {
         ++field6610;
         String[] var3 = new String[this.method3504((byte)-121, arg0)];
         class474.method3638(this.field6613, 0, var3, 0, this.field6613.length);
         this.field6613 = var3;
         if (!arg1) {
            this.field6614 = 5;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field6621[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pea",
      name = "a",
      descriptor = "(B)[Ljava/lang/String;"
   )
   public final String[] method3506(byte arg0) {
      try {
         ++field6605;
         if (arg0 >= -119) {
            return null;
         } else {
            String[] var2 = new String[this.field6607 - -1];
            class474.method3638(this.field6613, 0, var2, 0, this.field6607 + 1);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6621[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pea",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method3507(int arg0, int arg1) {
      try {
         ++field6604;
         if (arg0 != -47) {
            return true;
         } else {
            return ~arg1 == -20 || arg1 == 8 || ~arg1 == -1004 || ~arg1 == -47 || arg1 == 6;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6621[13] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pea",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method3508(int arg0) {
      try {
         if (class752.field10681 != null) {
            class752.field10681.method1836((byte)-96);
         }

         ++field6606;
         if (class247.field3780 != null) {
            while(true) {
               try {
                  class247.field3780.join();
                  break;
               } catch (InterruptedException var2) {
                  if (client.field10022) {
                     break;
                  }
               }
            }
         }

         if (arg0 != 1) {
            method3501(-66);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6621[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pea",
      name = "a",
      descriptor = "(ILjava/lang/String;I)V"
   )
   private final void method3509(int arg0, String arg1, int arg2) {
      try {
         if (~this.field6607 > ~arg2) {
            this.field6607 = arg2;
         }

         ++field6616;
         if (arg0 == 8) {
            if (this.field6613.length <= arg2) {
               this.method3505(arg2, true);
            }

            this.field6613[arg2] = arg1;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field6621[11] + arg0 + ',' + (arg1 != null ? field6621[1] : field6621[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pea",
      name = "<init>",
      descriptor = "(IZ)V"
   )
   public class455(int arg0, boolean arg1) {
      try {
         this.field6614 = arg0;
         this.field6603 = arg1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6621[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3510(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 74);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3511(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 1;
            break;
         case 1:
            var10005 = 63;
            break;
         case 2:
            var10005 = 31;
            break;
         case 3:
            var10005 = 59;
            break;
         default:
            var10005 = 74;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
