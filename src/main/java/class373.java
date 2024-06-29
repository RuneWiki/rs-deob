import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class373 {
   @OriginalMember(
      owner = "client!jp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5668 = new String[]{method2898(method2897("8\u000e\u001b\b[")), method2898(method2897("-UYJ")), method2898(method2897(")P\u001bg\u000e")), method2898(method2897(")P\u001bd\u000e"))};
   @OriginalMember(
      owner = "client!jp",
      name = "a",
      descriptor = "I"
   )
   public static int field5662;
   @OriginalMember(
      owner = "client!jp",
      name = "c",
      descriptor = "I"
   )
   public static int field5663;
   @OriginalMember(
      owner = "client!jp",
      name = "b",
      descriptor = "[B"
   )
   public byte[] field5667;
   @OriginalMember(
      owner = "client!jp",
      name = "d",
      descriptor = "[S"
   )
   public short[] field5664;
   @OriginalMember(
      owner = "client!jp",
      name = "e",
      descriptor = "[S"
   )
   public short[] field5665;
   @OriginalMember(
      owner = "client!jp",
      name = "f",
      descriptor = "[S"
   )
   public short[] field5666;

   @OriginalMember(
      owner = "client!jp",
      name = "a",
      descriptor = "(IILct;[I)V",
      line = 5
   )
   public static final void method2895(int arg0, int arg1, class155 arg2, int[] arg3) {
      int var4 = client.field4530;

      try {
         int var10000;
         if (arg2.field6101 != null) {
            label93: {
               byte var5 = 1;
               int var6 = 0;
               if (var4 != 0) {
                  var10000 = ~arg3[var6];
               } else if (arg2.field6101.length <= var6) {
                  var10000 = var5;
                  if (var4 == 0) {
                     break label93;
                  }
               } else {
                  var10000 = ~arg3[var6];
               }

               label92:
               do {
                  while(true) {
                     if (var10000 != ~arg2.field6101[var6]) {
                        var5 = 0;
                        if (var4 == 0) {
                           var10000 = var5;
                           break;
                        }

                        ++var6;
                     } else {
                        ++var6;
                     }

                     if (arg2.field6101.length <= var6) {
                        var10000 = var5;
                        if (var4 == 0) {
                           break label92;
                        }
                     } else {
                        var10000 = ~arg3[var6];
                     }
                  }
               } while(var4 != 0);
            }

            if (var10000 != 0 && ~arg2.field6072 != 0) {
               class676 var7 = class576.field8554.method3189(arg2.field6072, (byte)-104);
               int var8 = var7.field10152;
               if (~var8 == -2) {
                  arg2.field6045 = 1;
                  arg2.field6030 = 0;
                  arg2.field6092 = arg0;
                  arg2.field6043 = 0;
                  arg2.field6053 = 0;
                  if (!arg2.field6025) {
                     class718.method5194(arg2, arg2.field6043, var7, true);
                  }
               }

               if (~var8 == -3) {
                  arg2.field6030 = 0;
               }
            }
         }

         ++field5663;
         byte var9 = 1;
         int var10 = arg1;
         if (var4 != 0) {
            if (arg3[arg1] != -1) {
               var9 = 0;
            }
         } else {
            if (~arg1 <= ~arg3.length) {
               var10000 = var9;
               if (var4 == 0) {
                  if (var9 != 0) {
                     arg2.field6092 = arg0;
                     arg2.field6101 = arg3;
                     arg2.field6119 = arg2.field6121;
                     return;
                  }

                  return;
               }
            } else {
               var10000 = arg3[arg1];
            }

            if (var10000 != -1) {
               var9 = 0;
            }
         }

         while(true) {
            if (arg2.field6101 != null) {
               if (~arg2.field6101[var10] != 0) {
                  if (class576.field8554.method3189(arg3[var10], (byte)-83).field10162 >= class576.field8554.method3189(arg2.field6101[var10], (byte)-99).field10162) {
                     arg2.field6092 = arg0;
                     arg2.field6119 = arg2.field6121;
                     arg2.field6101 = arg3;
                     ++var10;
                  } else {
                     ++var10;
                  }
               } else {
                  arg2.field6092 = arg0;
                  arg2.field6119 = arg2.field6121;
                  arg2.field6101 = arg3;
                  ++var10;
               }
            } else {
               arg2.field6092 = arg0;
               arg2.field6119 = arg2.field6121;
               arg2.field6101 = arg3;
               ++var10;
            }

            if (~var10 <= ~arg3.length) {
               var10000 = var9;
               if (var4 == 0) {
                  if (var9 != 0) {
                     arg2.field6092 = arg0;
                     arg2.field6101 = arg3;
                     arg2.field6119 = arg2.field6121;
                     return;
                  }

                  return;
               }
            } else {
               var10000 = arg3[var10];
            }

            if (var10000 != -1) {
               var9 = 0;
            }
         }
      } catch (RuntimeException var12) {
         throw class670.method4877(var12, field5668[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5668[0] : field5668[1]) + ',' + (arg3 != null ? field5668[0] : field5668[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jp",
      name = "a",
      descriptor = "(I)V",
      line = 93
   )
   public static final void method2896(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!jp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2897(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 38);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2898(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 67;
            break;
         case 1:
            var10005 = 32;
            break;
         case 2:
            var10005 = 53;
            break;
         case 3:
            var10005 = 38;
            break;
         default:
            var10005 = 38;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
