import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lha")
public class class653 {
   @OriginalMember(
      owner = "client!lha",
      name = "i",
      descriptor = "Lwi;"
   )
   private class494 field9567;
   @OriginalMember(
      owner = "client!lha",
      name = "j",
      descriptor = "J"
   )
   public long field9561;
   @OriginalMember(
      owner = "client!lha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9571 = new String[]{method4789(method4788("Y!\u001a\u000e|\u001d")), method4789(method4788("Y!\u001a\u000e}\u001d")), method4789(method4788("Y!\u001a\u000e~\u001d")), method4789(method4788("NgU\u000eB")), method4789(method4788("[<\u0017L")), method4789(method4788("Y!\u001a\u000e\u0003\\'\u0012T\u0001\u001d")), method4789(method4788("\u0015d[")), method4789(method4788("a{[\r\u001f")), method4789(method4788("Y!\u001a\u000e{\u001d")), method4789(method4788("Y!\u001a\u000eY\\'\u001aLVO,S"))};
   @OriginalMember(
      owner = "client!lha",
      name = "h",
      descriptor = "[I"
   )
   public static int[] field9563 = new int[1];
   @OriginalMember(
      owner = "client!lha",
      name = "b",
      descriptor = "I"
   )
   public static int field9570 = 0;
   @OriginalMember(
      owner = "client!lha",
      name = "d",
      descriptor = "I"
   )
   public static int field9562;
   @OriginalMember(
      owner = "client!lha",
      name = "g",
      descriptor = "I"
   )
   public static int field9564;
   @OriginalMember(
      owner = "client!lha",
      name = "e",
      descriptor = "I"
   )
   public static int field9565;
   @OriginalMember(
      owner = "client!lha",
      name = "c",
      descriptor = "I"
   )
   public static int field9568;
   @OriginalMember(
      owner = "client!lha",
      name = "a",
      descriptor = "I"
   )
   public static int field9569;
   @OriginalMember(
      owner = "client!lha",
      name = "f",
      descriptor = "Lada;"
   )
   public static class175 field9566;

   @OriginalMember(
      owner = "client!lha",
      name = "a",
      descriptor = "(ZIIIIIIIII)V",
      line = 6
   )
   public static final void method4784(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      boolean var10 = client.field4360;

      try {
         label53: {
            if (~arg2 != ~arg4 || arg1 != arg7 || arg3 != arg9 || ~arg6 != ~arg8) {
               int var11 = arg4;
               int var12 = arg7;
               int var13 = arg4 * 3;
               int var14 = arg7 * 3;
               int var15 = arg2 * 3;
               int var16 = arg1 * 3;
               int var17 = arg9 * 3;
               int var18 = arg8 * 3;
               int var19 = -var17 - -var15 + arg3 + -arg4;
               int var20 = arg6 + var16 - var18 + -arg7;
               int var21 = -var15 + var17 + -var15 - -var13;
               int var22 = -var16 + var14 + -var16 + var18;
               int var23 = -var13 + var15;
               int var24 = -var14 + var16;
               int var25 = 128;
               if (var10 || var25 <= 4096) {
                  do {
                     int var26 = var25 * var25 >> 12;
                     int var27 = var25 * var26 >> 12;
                     int var28 = var19 * var27;
                     int var29 = var20 * var27;
                     int var30 = var21 * var26;
                     int var31 = var22 * var26;
                     int var32 = var23 * var25;
                     int var33 = var24 * var25;
                     int var34 = (var28 + var32 - -var30 >> 12) + arg4;
                     int var35 = (var31 - -var33 + var29 >> 12) + arg7;
                     class550.method3947(-102, var11, var35, var12, var34, arg5);
                     var11 = var34;
                     var12 = var35;
                     var25 += 128;
                  } while(var25 <= 4096);
               }

               if (!var10) {
                  break label53;
               }
            }

            class550.method3947(-127, arg4, arg6, arg7, arg3, arg5);
         }

         if (!arg0) {
            method4784(true, -41, 34, 115, -70, 30, -99, -5, -32, 61);
         }

         ++field9564;
      } catch (RuntimeException var37) {
         throw class237.method1823(var37, field9571[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lha",
      name = "a",
      descriptor = "(ILhba;)Z",
      line = 82
   )
   public static final boolean method4785(int arg0, class10 arg1) {
      boolean var2 = client.field4360;

      try {
         if (arg0 != 0) {
            field9566 = null;
         }

         ++field9569;

         try {
            return class516.method3758(false, arg1);
         } catch (IOException var7) {
            if (class622.field9156 == 9) {
               arg1.field102 = null;
               return false;
            } else {
               class644.method4661(arg0 + -76);
               return true;
            }
         } catch (Exception var8) {
            int var10000;
            byte var10001;
            label67: {
               String var4;
               label66: {
                  var4 = field9571[7] + (arg1.field116 != null ? arg1.field116.method944(-7851) : -1) + "," + (arg1.field117 == null ? -1 : arg1.field117.method944(-7851)) + "," + (arg1.field113 == null ? -1 : arg1.field113.method944(-7851)) + field9571[6] + arg1.field110 + "," + (class564.field8045.field3888[0] + class672.field9740) + "," + (class564.field8045.field3884[0] + class533.field7595) + field9571[6];
                  int var5 = 0;
                  if (!var2) {
                     if (arg1.field110 <= var5) {
                        break label66;
                     }

                     var10000 = ~var5;
                     var10001 = -51;
                     if (var2) {
                        break label67;
                     }

                     if (var10000 <= -51) {
                        break label66;
                     }
                  }

                  do {
                     var4 = var4 + arg1.field105.field1889[var5] + ",";
                     ++var5;
                     if (arg1.field110 <= var5) {
                        break;
                     }

                     var10000 = ~var5;
                     var10001 = -51;
                     if (var2) {
                        break label67;
                     }
                  } while(var10000 > -51);
               }

               class668.method4876(-121, var4, var8);
               var10000 = 0;
               var10001 = -20;
            }

            class388.method2945((boolean)var10000, var10001);
            return true;
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field9571[8] + arg0 + ',' + (arg1 != null ? field9571[3] : field9571[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lha",
      name = "a",
      descriptor = "(BI)Z",
      line = 130
   )
   public static final boolean method4786(byte arg0, int arg1) {
      try {
         ++field9562;
         if (arg0 != -106) {
            field9563 = null;
         }

         return arg1 == 1 || arg1 == 3 || ~arg1 == -6;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9571[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lha",
      name = "finalize",
      descriptor = "()V",
      line = 146
   )
   protected final void finalize() throws Throwable {
      try {
         ++field9568;
         this.field9567.method3589(435, this.field9561);
         super.finalize();
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field9571[9] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lha",
      name = "<init>",
      descriptor = "(Lwi;JI)V",
      line = 155
   )
   public class653(class494 arg0, long arg1, int arg2) {
      try {
         this.field9567 = arg0;
         this.field9561 = arg1;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field9571[5] + (arg0 != null ? field9571[3] : field9571[4]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lha",
      name = "a",
      descriptor = "(I)V",
      line = 169
   )
   public static void method4787(int arg0) {
      try {
         if (arg0 != 18950) {
            field9566 = null;
         }

         field9563 = null;
         field9566 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field9571[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4788(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 63);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4789(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 53;
            break;
         case 1:
            var10005 = 73;
            break;
         case 2:
            var10005 = 123;
            break;
         case 3:
            var10005 = 32;
            break;
         default:
            var10005 = 63;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
