import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iha")
public class class32 {
   @OriginalMember(
      owner = "client!iha",
      name = "g",
      descriptor = "Lkda;"
   )
   public class411 field381 = new class411();
   @OriginalMember(
      owner = "client!iha",
      name = "h",
      descriptor = "Z"
   )
   public boolean field383 = false;
   @OriginalMember(
      owner = "client!iha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field384 = new String[]{method264(method263("\u0002\u0019\u0011dVC")), method264(method263("\u0002\u0019\u0011dUC")), method264(method263("\u0002\u0019\u0011dTC")), method264(method263("\u0002\u0019\u0011dQC")), method264(method263("\u0010_^dj")), method264(method263("\u0005\u0004\u001c&")), method264(method263("\u0002\u0019\u0011d+\u0002\u001f\u0019>)C")), method264(method263("\u0002\u0019\u0011dRC")), method264(method263("\u0002\u0019\u0011dSC"))};
   @OriginalMember(
      owner = "client!iha",
      name = "a",
      descriptor = "I"
   )
   public static int field374;
   @OriginalMember(
      owner = "client!iha",
      name = "b",
      descriptor = "I"
   )
   public static int field375;
   @OriginalMember(
      owner = "client!iha",
      name = "d",
      descriptor = "I"
   )
   public static int field376;
   @OriginalMember(
      owner = "client!iha",
      name = "f",
      descriptor = "I"
   )
   public static int field377;
   @OriginalMember(
      owner = "client!iha",
      name = "i",
      descriptor = "I"
   )
   public static int field378;
   @OriginalMember(
      owner = "client!iha",
      name = "e",
      descriptor = "I"
   )
   public static int field379;
   @OriginalMember(
      owner = "client!iha",
      name = "j",
      descriptor = "I"
   )
   public static int field380;
   @OriginalMember(
      owner = "client!iha",
      name = "c",
      descriptor = "I"
   )
   public static int field382;

   @OriginalMember(
      owner = "client!iha",
      name = "a",
      descriptor = "(BLwia;)V"
   )
   public final void method257(byte param1, class794 param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!iha",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method258(int arg0, int arg1) {
      boolean var2 = client.field4273;

      try {
         ++field374;
         double var3 = (double)((16760867 & arg0) >> 16) / 256.0D;
         double var5 = (double)(arg0 >> 8 & 255) / 256.0D;
         double var7 = (double)(arg0 & 255) / 256.0D;
         double var9 = var3;
         if (var3 > var5) {
            var9 = var5;
         }

         if (var7 < var9) {
            var9 = var7;
         }

         double var11 = var3;
         if (var5 > var3) {
            var11 = var5;
         }

         if (var7 > var11) {
            var11 = var7;
         }

         double var13 = 0.0D;
         double var15 = 0.0D;
         double var17 = (var9 + var11) / 2.0D;
         if (var9 != var11) {
            if (var17 < 0.5D) {
               var15 = (-var9 + var11) / (var9 + var11);
            }

            label109: {
               if (var3 == var11) {
                  var13 = (var5 - var7) / (-var9 + var11);
                  if (!var2) {
                     break label109;
                  }
               }

               if (var5 == var11) {
                  var13 = (var7 - var3) / (var11 - var9) + 2.0D;
                  if (!var2) {
                     break label109;
                  }
               }

               if (var7 == var11) {
                  var13 = (-var5 + var3) / (-var9 + var11) + 4.0D;
               }
            }

            if (var17 >= 0.5D) {
               var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
         }

         double var19 = var13 / 6.0D;
         if (arg1 <= 13) {
            field378 = 61;
         }

         int var21;
         int var22;
         int var23;
         label85: {
            var21 = (int)(var19 * 256.0D);
            var22 = (int)(var15 * 256.0D);
            var23 = (int)(var17 * 256.0D);
            if (~var22 <= -1) {
               if (~var22 >= -256) {
                  break label85;
               }

               var22 = 255;
               if (!var2) {
                  break label85;
               }
            }

            var22 = 0;
         }

         label78: {
            if (var23 < 0) {
               var23 = 0;
               if (!var2) {
                  break label78;
               }
            }

            if (~var23 < -256) {
               var23 = 255;
            }
         }

         if (var23 > 243) {
            var22 >>= 4;
            if (!var2) {
               return (var23 >> 1) + ((var21 & 255) >> 2 << 10) + (var22 >> 5 << 7);
            }
         }

         if (var23 <= 217) {
            if (~var23 < -193) {
               var22 >>= 2;
               if (!var2) {
                  return (var23 >> 1) + ((var21 & 255) >> 2 << 10) + (var22 >> 5 << 7);
               }
            }

            if (var23 <= 179) {
               return (var23 >> 1) + ((var21 & 255) >> 2 << 10) + (var22 >> 5 << 7);
            }

            var22 >>= 1;
            if (!var2) {
               return (var23 >> 1) + ((var21 & 255) >> 2 << 10) + (var22 >> 5 << 7);
            }
         }

         var22 >>= 3;
         return (var23 >> 1) + ((var21 & 255) >> 2 << 10) + (var22 >> 5 << 7);
      } catch (RuntimeException var25) {
         throw class534.method3846(var25, field384[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iha",
      name = "a",
      descriptor = "(III[B)[B"
   )
   public static final byte[] method259(int arg0, int arg1, int arg2, byte[] arg3) {
      boolean var4 = client.field4273;

      try {
         ++field379;
         if (arg1 != 255) {
            method261((byte)-79, (String)null);
         }

         byte[] var5;
         label51: {
            if (arg2 > 0) {
               var5 = new byte[arg0];
               int var6 = 0;
               if (var4) {
                  var5[var6] = arg3[arg2 + var6];
                  ++var6;
               }

               while(true) {
                  while(arg0 > var6) {
                     var5[var6] = arg3[arg2 + var6];
                     ++var6;
                  }

                  if (!var4) {
                     if (!var4) {
                        break label51;
                     }
                     break;
                  }

                  ++var6;
               }
            }

            var5 = arg3;
         }

         class140 var7 = new class140();
         var7.method1197(-1);
         var7.method1196((long)(arg0 * 8), arg1 ^ 21150, var5);
         byte[] var8 = new byte[64];
         var7.method1199(1249913336, 0, var8);
         return var8;
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field384[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field384[4] : field384[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iha",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method260(boolean arg0) {
      boolean var2 = client.field4273;

      try {
         ++field376;
         if (arg0) {
            this.field381 = null;
         }

         do {
            class794 var3 = (class794)this.field381.method3119(65535);
            if (var3 == null) {
               break;
            }

            var3.method5512((byte)-100);
            class42.method315(var3, false);
         } while(!var2);

      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field384[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iha",
      name = "a",
      descriptor = "(BLjava/lang/String;)I"
   )
   public static final int method261(byte arg0, String arg1) {
      boolean var2 = client.field4273;

      try {
         ++field382;
         int var3 = arg1.length();
         int var4 = 0;
         int var5 = 0;
         if (var2) {
            var4 = class693.method5035(arg1.charAt(var5), false) + -var4 + (var4 << 5);
            ++var5;
         }

         while(true) {
            while(var3 > var5) {
               var4 = class693.method5035(arg1.charAt(var5), false) + -var4 + (var4 << 5);
               ++var5;
            }

            if (!var2) {
               if (arg0 != -107) {
                  method262(-63, 28, -98);
               }

               return var4;
            }

            var4 = arg0 + -107;
            ++var5;
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field384[8] + arg0 + ',' + (arg1 != null ? field384[4] : field384[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iha",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method262(int arg0, int arg1, int arg2) {
      try {
         ++field380;
         if (arg0 != 21078) {
            return true;
         } else {
            return class276.method2103(arg2, arg1, (byte)71) | (393216 & arg2) != 0 || class302.method2276(arg1, (byte)-79, arg2) || class205.method1551(arg1, arg2, 4096);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field384[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iha",
      name = "<init>",
      descriptor = "(Z)V"
   )
   public class32(boolean arg0) {
      try {
         this.field383 = arg0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field384[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method263(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 23);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method264(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 107;
            break;
         case 1:
            var10005 = 113;
            break;
         case 2:
            var10005 = 112;
            break;
         case 3:
            var10005 = 74;
            break;
         default:
            var10005 = 23;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
