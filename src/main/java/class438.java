import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public class class438 {
   @OriginalMember(
      owner = "client!kca",
      name = "a",
      descriptor = "Llj;"
   )
   private class304 field6706 = new class304(64);
   @OriginalMember(
      owner = "client!kca",
      name = "h",
      descriptor = "Lrr;"
   )
   private class678 field6704;
   @OriginalMember(
      owner = "client!kca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6714 = new String[]{method3452(method3451("E3k]x\u0006")), method3452(method3451("@%f\u001f")), method3452(method3451("E3k]w\u0006")), method3452(method3451("U~$]M")), method3452(method3451("E3k]q\u0006")), method3452(method3451("E3k]r\u0006")), method3452(method3451("E3k]t\u0006")), method3452(method3451("E3k]v\u0006")), method3452(method3451("E3k]s\u0006")), method3452(method3451("E3k]u\u0006")), method3452(method3451("E3k]\fG>c\u0007\u000e\u0006"))};
   @OriginalMember(
      owner = "client!kca",
      name = "i",
      descriptor = "I"
   )
   public static int field6710 = 0;
   @OriginalMember(
      owner = "client!kca",
      name = "f",
      descriptor = "Luk;"
   )
   public static class498 field6713 = new class498(60, 6);
   @OriginalMember(
      owner = "client!kca",
      name = "e",
      descriptor = "I"
   )
   public static int field6703;
   @OriginalMember(
      owner = "client!kca",
      name = "k",
      descriptor = "I"
   )
   public static int field6705;
   @OriginalMember(
      owner = "client!kca",
      name = "d",
      descriptor = "I"
   )
   public static int field6707;
   @OriginalMember(
      owner = "client!kca",
      name = "j",
      descriptor = "I"
   )
   public static int field6708;
   @OriginalMember(
      owner = "client!kca",
      name = "b",
      descriptor = "I"
   )
   public static int field6709;
   @OriginalMember(
      owner = "client!kca",
      name = "g",
      descriptor = "I"
   )
   public static int field6711;
   @OriginalMember(
      owner = "client!kca",
      name = "c",
      descriptor = "I"
   )
   public static int field6712;

   @OriginalMember(
      owner = "client!kca",
      name = "b",
      descriptor = "(I)V",
      line = 7
   )
   public static final void method3443(int arg0) {
      try {
         class372.field5764 = null;
         ++field6703;
         if (arg0 != 54) {
            field6710 = -114;
         }

         class119.field1653 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6714[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kca",
      name = "a",
      descriptor = "(III)V",
      line = 19
   )
   public static final void method3444(int arg0, int arg1, int arg2) {
      try {
         ++field6711;
         class566 var3 = class146.method1321(0L, 15, -1428737160);
         var3.method4269((byte)-111);
         if (arg1 <= 2) {
            field6710 = 37;
         }

         var3.field8398 = arg2;
         var3.field8394 = arg0;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field6714[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kca",
      name = "a",
      descriptor = "(BI)Lvo;",
      line = 38
   )
   public final class764 method3445(byte arg0, int arg1) {
      try {
         if (arg0 < 5) {
            return null;
         } else {
            ++field6705;
            class304 var3 = this.field6706;
            class764 var4;
            synchronized(this.field6706) {
               var4 = (class764)this.field6706.method2544(false, (long)arg1);
            }

            if (var4 != null) {
               return var4;
            } else {
               class678 var5 = this.field6704;
               byte[] var6;
               synchronized(this.field6704) {
                  var6 = this.field6704.method5017(54, arg1, (byte)71);
               }

               class764 var7 = new class764();
               if (var6 != null) {
                  var7.method5595(32, new class354(var6));
               }

               class304 var8 = this.field6706;
               synchronized(this.field6706) {
                  this.field6706.method2545((long)arg1, 106, var7);
                  return var7;
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field6714[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kca",
      name = "a",
      descriptor = "(ZIILfq;)V",
      line = 68
   )
   public static final void method3446(boolean arg0, int arg1, int arg2, class374 arg3) {
      try {
         ++field6707;
         if (arg3 != null) {
            if (arg3.field5878 != null) {
               class36 var4 = new class36();
               var4.field437 = arg3.field5878;
               var4.field441 = arg3;
               class469.method3632(var4);
            }

            class175.field2750 = arg3.field5840;
            class436.field6683 = arg3.field5939;
            if (!arg0) {
               class552.field8264 = true;
               class441.field6793 = arg2;
               class105.field1459 = arg3.field5848;
               class449.field6882 = arg3.field5927;
               class698.field10378 = arg3.field5846;
               class593.field8730 = arg1;
               class573.method4310((byte)-16, arg3);
            }
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field6714[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field6714[3] : field6714[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kca",
      name = "a",
      descriptor = "(B)V",
      line = 102
   )
   public final void method3447(byte arg0) {
      try {
         ++field6712;
         if (arg0 == 108) {
            class304 var2 = this.field6706;
            synchronized(this.field6706) {
               this.field6706.method2551(true);
            }
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field6714[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kca",
      name = "b",
      descriptor = "(BI)V",
      line = 116
   )
   public final void method3448(byte arg0, int arg1) {
      try {
         ++field6708;
         if (arg0 != 45) {
            this.field6706 = null;
         }

         class304 var3 = this.field6706;
         synchronized(this.field6706) {
            this.field6706.method2552(arg1, arg0 ^ 21552);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field6714[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kca",
      name = "a",
      descriptor = "(I)V",
      line = 129
   )
   public static void method3449(int arg0) {
      try {
         field6713 = null;
         if (arg0 != -21272) {
            field6710 = 3;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6714[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kca",
      name = "<init>",
      descriptor = "(Ltv;ILrr;)V",
      line = 141
   )
   public class438(class311 arg0, int arg1, class678 arg2) {
      try {
         this.field6704 = arg2;
         if (this.field6704 != null) {
            this.field6704.method4998((byte)-82, 54);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field6714[10] + (arg0 != null ? field6714[3] : field6714[1]) + ',' + arg1 + ',' + (arg2 != null ? field6714[3] : field6714[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kca",
      name = "b",
      descriptor = "(B)V",
      line = 172
   )
   public final void method3450(byte arg0) {
      try {
         class304 var2 = this.field6706;
         synchronized(this.field6706) {
            this.field6706.method2554(-125);
            if (arg0 != 126) {
               method3449(58);
            }
         }

         ++field6709;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field6714[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3451(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 48);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3452(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 46;
            break;
         case 1:
            var10005 = 80;
            break;
         case 2:
            var10005 = 10;
            break;
         case 3:
            var10005 = 115;
            break;
         default:
            var10005 = 48;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
