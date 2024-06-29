import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cia")
public class class101 {
   @OriginalMember(
      owner = "client!cia",
      name = "d",
      descriptor = "Llj;"
   )
   private class304 field1417 = new class304(64);
   @OriginalMember(
      owner = "client!cia",
      name = "a",
      descriptor = "Lrr;"
   )
   private class678 field1412;
   @OriginalMember(
      owner = "client!cia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1419 = new String[]{method984(method983("\u000e_}\u000b`E")), method984(method983("\u000e_}\u000bgE")), method984(method983("\u000e_}\u000bdE")), method984(method983("\u000e_}\u000bfE")), method984(method983("\u000e_}\u000baE")), method984(method983("\u000e_}\u000b\u0019\u0004XuQ\u001bE")), method984(method983("\u0003CpI")), method984(method983("\u0016\u00182\u000bX"))};
   @OriginalMember(
      owner = "client!cia",
      name = "e",
      descriptor = "I"
   )
   public static int field1413;
   @OriginalMember(
      owner = "client!cia",
      name = "g",
      descriptor = "I"
   )
   public static int field1414;
   @OriginalMember(
      owner = "client!cia",
      name = "b",
      descriptor = "I"
   )
   public static int field1415;
   @OriginalMember(
      owner = "client!cia",
      name = "f",
      descriptor = "I"
   )
   public static int field1416;
   @OriginalMember(
      owner = "client!cia",
      name = "c",
      descriptor = "I"
   )
   public static int field1418;

   @OriginalMember(
      owner = "client!cia",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method978(int arg0) {
      try {
         ++field1414;
         class304 var2 = this.field1417;
         synchronized(this.field1417) {
            this.field1417.method2551(true);
            if (arg0 != -29569) {
               this.field1417 = null;
            }

         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field1419[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method979(int arg0, int arg1) {
      try {
         class304 var3 = this.field1417;
         synchronized(this.field1417) {
            if (arg0 <= 5) {
               this.field1412 = null;
            }

            this.field1417.method2552(arg1, 21533);
         }

         ++field1415;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field1419[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "a",
      descriptor = "(BIIIIIIII)V"
   )
   public static final void method980(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      try {
         ++field1413;
         if (arg0 != 106) {
            method980((byte)70, 79, 118, -82, -109, -114, 102, -20, 13);
         }

         if (~arg5 <= -2 && arg2 >= 1 && ~arg5 >= ~(class513.field7828 + -2) && ~arg2 >= ~(class475.field7230 - 2)) {
            int var9 = arg1;
            if (arg1 < 3 && class577.method4326(arg5, (byte)77, arg2)) {
               var9 = arg1 + 1;
            }

            if (class687.field10213.field536.method5531(480102311) == 0 && !class152.method1386(class426.field6582, (byte)39, var9, arg2, arg5)) {
               return;
            }

            if (class711.field10694 == null) {
               return;
            }

            class401.field6289.method3952(arg1, arg3, class351.field5356, class221.field3326[arg1], arg2, arg5, arg0 ^ -92);
            if (~arg4 <= -1) {
               int var10 = class687.field10213.field534.method5283(480102311);
               class687.field10213.method299(-17, 1, class687.field10213.field534);
               class401.field6289.method3950(arg6, arg2, arg4, arg7, arg1, arg8, arg5, class351.field5356, (byte)-114, var9, class221.field3326[arg1]);
               class687.field10213.method299(-17, var10, class687.field10213.field534);
               return;
            }
         }

      } catch (RuntimeException var12) {
         throw class482.method3757(var12, field1419[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "a",
      descriptor = "(BI)Lui;"
   )
   public final class385 method981(byte arg0, int arg1) {
      try {
         ++field1416;
         class304 var3 = this.field1417;
         class385 var4;
         synchronized(this.field1417) {
            var4 = (class385)this.field1417.method2544(false, (long)arg1);
         }

         if (var4 != null) {
            return var4;
         } else {
            class678 var5 = this.field1412;
            byte[] var7;
            synchronized(this.field1412) {
               if (arg0 != -40) {
                  return null;
               }

               var7 = this.field1412.method5017(35, arg1, (byte)71);
            }

            class385 var8 = new class385();
            if (var7 != null) {
               var8.method3120(true, new class354(var7));
            }

            var8.method3116(-61);
            class304 var9 = this.field1417;
            synchronized(this.field1417) {
               this.field1417.method2545((long)arg1, 121, var8);
               return var8;
            }
         }
      } catch (RuntimeException var16) {
         throw class482.method3757(var16, field1419[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method982(int arg0) {
      try {
         class304 var2 = this.field1417;
         synchronized(this.field1417) {
            this.field1417.method2554(-102);
            if (arg0 != 2) {
               this.field1417 = null;
            }
         }

         ++field1418;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field1419[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "<init>",
      descriptor = "(Ltv;ILrr;)V"
   )
   public class101(class311 arg0, int arg1, class678 arg2) {
      try {
         this.field1412 = arg2;
         if (this.field1412 != null) {
            this.field1412.method4998((byte)-82, 35);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field1419[5] + (arg0 != null ? field1419[7] : field1419[6]) + ',' + arg1 + ',' + (arg2 != null ? field1419[7] : field1419[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method983(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 37);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method984(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 109;
            break;
         case 1:
            var10005 = 54;
            break;
         case 2:
            var10005 = 28;
            break;
         case 3:
            var10005 = 37;
            break;
         default:
            var10005 = 37;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
