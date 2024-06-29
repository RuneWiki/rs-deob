import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class382 {
   @OriginalMember(
      owner = "client!eh",
      name = "j",
      descriptor = "I"
   )
   public int field5355 = 8;
   @OriginalMember(
      owner = "client!eh",
      name = "o",
      descriptor = "I"
   )
   public int field5356 = 16777215;
   @OriginalMember(
      owner = "client!eh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5357 = new String[]{method2940(method2939("bc$\u000bs")), method2940(method2939("|%$d&")), method2940(method2939("bc$\bs")), method2940(method2939("i~f&")), method2940(method2939("bc$\ts"))};
   @OriginalMember(
      owner = "client!eh",
      name = "d",
      descriptor = "I"
   )
   public static int field5351 = 0;
   @OriginalMember(
      owner = "client!eh",
      name = "b",
      descriptor = "Z"
   )
   public static boolean field5352 = true;
   @OriginalMember(
      owner = "client!eh",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field5354 = new int[2];
   @OriginalMember(
      owner = "client!eh",
      name = "n",
      descriptor = "I"
   )
   public int field5343;
   @OriginalMember(
      owner = "client!eh",
      name = "l",
      descriptor = "I"
   )
   public static int field5344;
   @OriginalMember(
      owner = "client!eh",
      name = "m",
      descriptor = "I"
   )
   public int field5345;
   @OriginalMember(
      owner = "client!eh",
      name = "e",
      descriptor = "I"
   )
   public int field5346;
   @OriginalMember(
      owner = "client!eh",
      name = "a",
      descriptor = "I"
   )
   public static int field5347;
   @OriginalMember(
      owner = "client!eh",
      name = "c",
      descriptor = "I"
   )
   public int field5349;
   @OriginalMember(
      owner = "client!eh",
      name = "f",
      descriptor = "I"
   )
   public int field5350;
   @OriginalMember(
      owner = "client!eh",
      name = "h",
      descriptor = "Ljava/lang/String;"
   )
   public static String field5342;
   @OriginalMember(
      owner = "client!eh",
      name = "i",
      descriptor = "Z"
   )
   public boolean field5348;
   @OriginalMember(
      owner = "client!eh",
      name = "k",
      descriptor = "Z"
   )
   public static boolean field5353;

   @OriginalMember(
      owner = "client!eh",
      name = "a",
      descriptor = "(Lwm;Z)V"
   )
   public final void method2936(class594 arg0, boolean arg1) {
      boolean var3 = client.field4273;

      try {
         if (arg1) {
            field5354 = null;
         }

         while(true) {
            int var4 = arg0.method4288((byte)79);
            if (var4 != 0) {
               this.method2938(arg0, var4, (byte)20);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            ++field5347;
            break;
         }

      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field5357[4] + (arg0 != null ? field5357[1] : field5357[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eh",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2937(byte arg0) {
      try {
         field5354 = null;
         field5342 = null;
         if (arg0 != -2) {
            method2937((byte)9);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5357[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eh",
      name = "a",
      descriptor = "(Lwm;IB)V"
   )
   private final void method2938(class594 arg0, int arg1, byte arg2) {
      boolean var4 = client.field4273;

      try {
         if (arg2 == 20) {
            label66: {
               if (arg1 == 1) {
                  this.field5355 = arg0.method4280(-19104);
                  if (!var4) {
                     break label66;
                  }
               }

               if (~arg1 != -3) {
                  if (arg1 != 3) {
                     if (arg1 == 4) {
                        this.field5345 = arg0.method4288((byte)79);
                        if (!var4) {
                           break label66;
                        }
                     }

                     if (arg1 != 5) {
                        if (~arg1 != -7) {
                           break label66;
                        }

                        this.field5356 = arg0.method4293(82);
                        if (!var4) {
                           break label66;
                        }
                     }

                     this.field5343 = arg0.method4280(-19104);
                     if (!var4) {
                        break label66;
                     }
                  }

                  this.field5346 = arg0.method4333(arg2 + -127);
                  this.field5349 = arg0.method4333(arg2 ^ -34);
                  this.field5350 = arg0.method4333(-66);
                  if (!var4) {
                     break label66;
                  }
               }

               this.field5348 = true;
            }

            ++field5344;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field5357[2] + (arg0 != null ? field5357[1] : field5357[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2939(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 91);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2940(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 7;
            break;
         case 1:
            var10005 = 11;
            break;
         case 2:
            var10005 = 10;
            break;
         case 3:
            var10005 = 74;
            break;
         default:
            var10005 = 91;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
