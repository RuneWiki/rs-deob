import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fha")
public class class289 {
   @OriginalMember(
      owner = "client!fha",
      name = "l",
      descriptor = "Z"
   )
   private boolean field3993 = false;
   @OriginalMember(
      owner = "client!fha",
      name = "g",
      descriptor = "I"
   )
   public int field4005 = 0;
   @OriginalMember(
      owner = "client!fha",
      name = "j",
      descriptor = "I"
   )
   public int field4000 = 0;
   @OriginalMember(
      owner = "client!fha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4008 = new String[]{method2346(method2345("\u0003\u0011\u001dB3M")), method2346(method2345("\u001eWRB\n")), method2346(method2345("\u000b\f\u0010\u0000")), method2346(method2345("\u0003\u0011\u001dB4M")), method2346(method2345("\u0003\u0011\u001dB5M")), method2346(method2345("\u0003\u0011\u001dB6M")), method2346(method2345("\u0003\u0011\u001dB2M"))};
   @OriginalMember(
      owner = "client!fha",
      name = "o",
      descriptor = "Laka;"
   )
   public static class418 field3998 = new class418(125, 1);
   @OriginalMember(
      owner = "client!fha",
      name = "r",
      descriptor = "I"
   )
   public static int field3988;
   @OriginalMember(
      owner = "client!fha",
      name = "h",
      descriptor = "I"
   )
   public int field3989;
   @OriginalMember(
      owner = "client!fha",
      name = "i",
      descriptor = "I"
   )
   public static int field3990;
   @OriginalMember(
      owner = "client!fha",
      name = "t",
      descriptor = "I"
   )
   public static int field3991;
   @OriginalMember(
      owner = "client!fha",
      name = "k",
      descriptor = "I"
   )
   public int field3992;
   @OriginalMember(
      owner = "client!fha",
      name = "f",
      descriptor = "I"
   )
   public int field3994;
   @OriginalMember(
      owner = "client!fha",
      name = "s",
      descriptor = "I"
   )
   public int field3995;
   @OriginalMember(
      owner = "client!fha",
      name = "c",
      descriptor = "I"
   )
   private int field3997;
   @OriginalMember(
      owner = "client!fha",
      name = "q",
      descriptor = "I"
   )
   public static int field3999;
   @OriginalMember(
      owner = "client!fha",
      name = "e",
      descriptor = "I"
   )
   public int field4001;
   @OriginalMember(
      owner = "client!fha",
      name = "a",
      descriptor = "I"
   )
   public int field4002;
   @OriginalMember(
      owner = "client!fha",
      name = "n",
      descriptor = "I"
   )
   public int field4003;
   @OriginalMember(
      owner = "client!fha",
      name = "p",
      descriptor = "I"
   )
   public static int field4004;
   @OriginalMember(
      owner = "client!fha",
      name = "m",
      descriptor = "I"
   )
   public int field4006;
   @OriginalMember(
      owner = "client!fha",
      name = "d",
      descriptor = "I"
   )
   public int field4007;
   @OriginalMember(
      owner = "client!fha",
      name = "b",
      descriptor = "J"
   )
   public long field3996;

   @OriginalMember(
      owner = "client!fha",
      name = "a",
      descriptor = "(ILvv;)I"
   )
   public static final int method2340(int arg0, class467 arg1) {
      try {
         ++field4004;
         if (class318.field4380 == arg1) {
            return 7681;
         } else if (class231.field2873 != arg1) {
            if (class749.field10941 != arg1) {
               if (class242.field3052 != arg1) {
                  if (class371.field5192 == arg1) {
                     return 34023;
                  } else {
                     if (arg0 < 88) {
                        field3990 = -42;
                     }

                     throw new IllegalArgumentException();
                  }
               } else {
                  return 260;
               }
            } else {
               return 34165;
            }
         } else {
            return 8448;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4008[5] + arg0 + ',' + (arg1 != null ? field4008[1] : field4008[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fha",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method2341(boolean arg0) {
      boolean var2 = client.field1481;

      try {
         ++field3988;
         this.field4003 = class746.field10897[this.field3997 << 3];
         if (arg0) {
            long var3 = (long)this.field3995;
            long var5 = (long)this.field4002;
            long var7 = (long)this.field4007;
            this.field3994 = (int)Math.sqrt((double)(var7 * var7 + (var3 * var3 - -(var5 * var5))));
            if (~this.field4006 == -1) {
               this.field4006 = 1;
            }

            label45: {
               if (this.field3992 == 0) {
                  this.field3996 = 2147483647L;
                  if (!var2) {
                     break label45;
                  }
               }

               if (this.field3992 == 1) {
                  this.field3996 = (long)(this.field3994 * 8 / this.field4006);
                  this.field3996 *= this.field3996;
                  if (!var2) {
                     break label45;
                  }
               }

               if (this.field3992 == 2) {
                  this.field3996 = (long)(this.field3994 * 8 / this.field4006);
               }
            }

            if (this.field3993) {
               this.field3994 *= -1;
            }
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field4008[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fha",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2342(int arg0) {
      try {
         if (arg0 == 34023) {
            field3998 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field4008[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fha",
      name = "a",
      descriptor = "(Lgea;II)V"
   )
   private final void method2343(class66 arg0, int arg1, int arg2) {
      boolean var4 = client.field1481;

      try {
         label76: {
            if (arg1 == arg2) {
               this.field3997 = arg0.method603(-2);
               if (!var4) {
                  break label76;
               }
            }

            if (arg1 == 2) {
               arg0.method640(255);
               if (!var4) {
                  break label76;
               }
            }

            if (arg1 != 3) {
               if (~arg1 != -5) {
                  if (~arg1 == -7) {
                     this.field3989 = arg0.method640(255);
                     if (!var4) {
                        break label76;
                     }
                  }

                  if (arg1 != 8) {
                     if (~arg1 == -10) {
                        this.field4000 = 1;
                        if (!var4) {
                           break label76;
                        }
                     }

                     if (~arg1 != -11) {
                        break label76;
                     }

                     this.field3993 = true;
                     if (!var4) {
                        break label76;
                     }
                  }

                  this.field4005 = 1;
                  if (!var4) {
                     break label76;
                  }
               }

               this.field3992 = arg0.method640(255);
               this.field4006 = arg0.method610(126);
               if (!var4) {
                  break label76;
               }
            }

            this.field3995 = arg0.method610(-101);
            this.field4002 = arg0.method610(-124);
            this.field4007 = arg0.method610(arg2 ^ 126);
         }

         ++field3991;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field4008[0] + (arg0 != null ? field4008[1] : field4008[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fha",
      name = "a",
      descriptor = "(ILgea;)V"
   )
   public final void method2344(int arg0, class66 arg1) {
      boolean var3 = client.field1481;

      try {
         ++field3999;

         while(true) {
            int var4 = arg1.method640(255);
            if (~var4 != -1) {
               this.method2343(arg1, var4, 1);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            int var5 = 105 % ((-4 - arg0) / 58);
            break;
         }

      } catch (RuntimeException var7) {
         throw class93.method866(var7, field4008[4] + arg0 + ',' + (arg1 != null ? field4008[1] : field4008[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2345(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 119);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2346(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 101;
            break;
         case 1:
            var10005 = 121;
            break;
         case 2:
            var10005 = 124;
            break;
         case 3:
            var10005 = 108;
            break;
         default:
            var10005 = 119;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
