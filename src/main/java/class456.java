import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cja")
public class class456 {
   @OriginalMember(
      owner = "client!cja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6292 = new String[]{method3493(method3492("T\bz\u000e\t")), method3493(method3492("AS8L")), method3493(method3492("LL5\u000e7\u0007")), method3493(method3492("LL5\u000e5\u0007")), method3493(method3492("LL5\u000e6\u0007"))};
   @OriginalMember(
      owner = "client!cja",
      name = "g",
      descriptor = "Lse;"
   )
   public static class6 field6291 = new class6(59, 8);
   @OriginalMember(
      owner = "client!cja",
      name = "i",
      descriptor = "I"
   )
   public static int field6284;
   @OriginalMember(
      owner = "client!cja",
      name = "a",
      descriptor = "I"
   )
   public static int field6289;
   @OriginalMember(
      owner = "client!cja",
      name = "b",
      descriptor = "Lhe;"
   )
   public static class621 field6286;
   @OriginalMember(
      owner = "client!cja",
      name = "c",
      descriptor = "Lkia;"
   )
   public static class93 field6290;
   @OriginalMember(
      owner = "client!cja",
      name = "d",
      descriptor = "[B"
   )
   public byte[] field6288;
   @OriginalMember(
      owner = "client!cja",
      name = "h",
      descriptor = "[S"
   )
   public short[] field6283;
   @OriginalMember(
      owner = "client!cja",
      name = "f",
      descriptor = "[S"
   )
   public short[] field6285;
   @OriginalMember(
      owner = "client!cja",
      name = "e",
      descriptor = "[S"
   )
   public short[] field6287;

   @OriginalMember(
      owner = "client!cja",
      name = "a",
      descriptor = "(ILfda;ZZ)V"
   )
   public static final void method3489(int arg0, class710 arg1, boolean arg2, boolean arg3) {
      boolean var4 = client.field1481;

      try {
         ++field6289;
         int var5 = arg1.field10422;
         int var6 = (int)arg1.field9965;
         arg1.method4924(-2970);
         if (arg3) {
            class108.method967((byte)-82, var5);
         }

         class365.method2879(65535, var5);
         class642 var7 = class82.method795(var6, arg0 ^ -26548);
         if (var7 != null) {
            class49.method372(var7, arg0 + -3);
         }

         class639.method4704(26482);
         if (!arg2 && ~class661.field9817 != 0) {
            class459.method3502(-22, class661.field9817, 1);
         }

         class173 var8 = new class173(class397.field5473);
         class710 var9 = (class710)var8.method1485(0);
         int var10;
         int var10000;
         byte var10001;
         if (var4) {
            if (!var9.method4926(arg0 ^ 3)) {
               var9 = (class710)var8.method1485(arg0 + -3);
               if (var9 == null) {
                  if (var4) {
                     var10000 = var9.field10417;
                     var10001 = 3;
                  } else {
                     var10000 = arg0;
                     var10001 = 3;
                     if (!var4) {
                        if (arg0 != 3) {
                           method3489(17, (class710)null, true, false);
                           return;
                        }

                        return;
                     }
                  }
               } else {
                  var10000 = var9.field10417;
                  var10001 = 3;
               }
            } else {
               var10000 = var9.field10417;
               var10001 = 3;
            }

            if (var10000 == var10001) {
               var10 = (int)var9.field9965;
               if (var10 >>> 16 == var5) {
                  method3489(3, var9, arg2, true);
               }
            }

            var9 = (class710)var8.method1483((byte)-53);
         }

         while(true) {
            while(var9 != null) {
               if (!var9.method4926(arg0 ^ 3)) {
                  var9 = (class710)var8.method1485(arg0 + -3);
                  if (var9 == null) {
                     if (var4) {
                        var10000 = var9.field10417;
                        var10001 = 3;
                     } else {
                        var10000 = arg0;
                        var10001 = 3;
                        if (!var4) {
                           if (arg0 != 3) {
                              method3489(17, (class710)null, true, false);
                              return;
                           }

                           return;
                        }
                     }
                  } else {
                     var10000 = var9.field10417;
                     var10001 = 3;
                  }
               } else {
                  var10000 = var9.field10417;
                  var10001 = 3;
               }

               if (var10000 == var10001) {
                  var10 = (int)var9.field9965;
                  if (var10 >>> 16 == var5) {
                     method3489(3, var9, arg2, true);
                  }
               }

               var9 = (class710)var8.method1483((byte)-53);
            }

            if (!var4) {
               if (arg0 != 3) {
                  method3489(17, (class710)null, true, false);
                  return;
               }

               return;
            }

            if (arg0 == 3) {
               var10 = (int)var9.field9965;
               if (var10 >>> 16 == var5) {
                  method3489(3, var9, arg2, true);
               }
            }

            var9 = (class710)var8.method1483((byte)-53);
         }
      } catch (RuntimeException var12) {
         throw class93.method866(var12, field6292[2] + arg0 + ',' + (arg1 != null ? field6292[0] : field6292[1]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cja",
      name = "a",
      descriptor = "(ZIIBII)V"
   )
   public static final void method3490(boolean param0, int param1, int param2, byte param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!cja",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3491(int arg0) {
      try {
         if (arg0 <= 29) {
            field6291 = null;
         }

         field6291 = null;
         field6286 = null;
         field6290 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field6292[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3492(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 116);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3493(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 47;
            break;
         case 1:
            var10005 = 38;
            break;
         case 2:
            var10005 = 84;
            break;
         case 3:
            var10005 = 32;
            break;
         default:
            var10005 = 116;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
