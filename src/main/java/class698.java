import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class698 {
   @OriginalMember(
      owner = "client!ab",
      name = "c",
      descriptor = "Llj;"
   )
   private class304 field10373 = new class304(256);
   @OriginalMember(
      owner = "client!ab",
      name = "a",
      descriptor = "Lrr;"
   )
   private class678 field10372;
   @OriginalMember(
      owner = "client!ab",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10380 = new String[]{method5141(method5140("e\\\u0005\u001c\u001f")), method5141(method5140("jKG3")), method5141(method5140("e\\\u0005c^jW_a\u001f")), method5141(method5140("\u007f\u0010\u0005qJ")), method5141(method5140("e\\\u0005\u001a\u001f")), method5141(method5140("e\\\u0005\u001e\u001f")), method5141(method5140("e\\\u0005\u001d\u001f")), method5141(method5140("e\\\u0005\u0019\u001f")), method5141(method5140("e\\\u0005\u001b\u001f")), method5141(method5140("e\\\u0005\u0018\u001f"))};
   @OriginalMember(
      owner = "client!ab",
      name = "e",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field10370 = new String[100];
   @OriginalMember(
      owner = "client!ab",
      name = "h",
      descriptor = "Luk;"
   )
   public static class498 field10376 = new class498(76, -1);
   @OriginalMember(
      owner = "client!ab",
      name = "b",
      descriptor = "I"
   )
   public static int field10369;
   @OriginalMember(
      owner = "client!ab",
      name = "d",
      descriptor = "I"
   )
   public static int field10371;
   @OriginalMember(
      owner = "client!ab",
      name = "i",
      descriptor = "I"
   )
   public static int field10374;
   @OriginalMember(
      owner = "client!ab",
      name = "k",
      descriptor = "I"
   )
   public static int field10375;
   @OriginalMember(
      owner = "client!ab",
      name = "f",
      descriptor = "I"
   )
   public static int field10377;
   @OriginalMember(
      owner = "client!ab",
      name = "j",
      descriptor = "I"
   )
   public static int field10378;
   @OriginalMember(
      owner = "client!ab",
      name = "g",
      descriptor = "I"
   )
   public static int field10379;

   @OriginalMember(
      owner = "client!ab",
      name = "d",
      descriptor = "(I)V",
      line = 4
   )
   public static final void method5133(int arg0) {
      try {
         ++field10374;
         int var1 = 0;
         int var2 = -3 % ((arg0 - -58) / 48);
         if (class687.field10213.field513.method4463(480102311) == 1) {
            int var3 = var1 | 1;
            int var4 = var3 | 16;
            int var5 = var4 | 32;
            int var6 = var5 | 2;
            var1 = var6 | 4;
         }

         if (~class687.field10213.field547.method4414(480102311) == -1) {
            var1 |= 64;
         }

         class413.method3310(var1, 1);
         class102.field1434.method1420(0, var1);
         class247.field3763.method2059(var1, (byte)110);
         class412.field6401.method793(var1, (byte)-117);
         class317.field4896.method1648(var1, -24129);
         class601.method4448(74, var1);
         class723.method5344(-106, var1);
         class596.method4431(var1, 2);
         class485.method3772((byte)77, var1);
         class686.method5059(3);
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field10380[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ab",
      name = "a",
      descriptor = "(II)V",
      line = 40
   )
   public final void method5134(int arg0, int arg1) {
      try {
         if (arg0 != 1) {
            this.field10373 = null;
         }

         class304 var3 = this.field10373;
         synchronized(this.field10373) {
            this.field10373.method2552(arg1, arg0 + 21532);
         }

         ++field10379;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field10380[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ab",
      name = "a",
      descriptor = "(IB)Lrba;",
      line = 60
   )
   public final class381 method5135(int arg0, byte arg1) {
      try {
         ++field10375;
         if (arg1 != -57) {
            method5133(20);
         }

         class304 var3 = this.field10373;
         class381 var4;
         synchronized(this.field10373) {
            var4 = (class381)this.field10373.method2544(false, (long)arg0);
         }

         if (var4 != null) {
            return var4;
         } else {
            class678 var5 = this.field10372;
            byte[] var6;
            synchronized(this.field10372) {
               var6 = this.field10372.method5017(26, arg0, (byte)71);
            }

            class381 var7 = new class381();
            if (var6 != null) {
               var7.method3100(-1, new class354(var6));
            }

            class304 var8 = this.field10373;
            synchronized(this.field10373) {
               this.field10373.method2545((long)arg0, 125, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field10380[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ab",
      name = "a",
      descriptor = "(B)V",
      line = 89
   )
   public static final void method5136(byte arg0) {
      try {
         ++field10377;
         if (class288.field4539 != -1) {
            int var1 = class690.field10254.method2571(92);
            if (arg0 < 51) {
               field10378 = 65;
            }

            int var2 = class690.field10254.method2578(true);
            class670 var3 = (class670)class748.field11087.method4972((byte)-84);
            if (var3 != null) {
               var1 = var3.method3790(8);
               var2 = var3.method3793(1);
            }

            int var4 = 0;
            int var5 = 0;
            if (class281.field4472) {
               var4 = class600.method4443(0);
               var5 = class218.method1890(0);
            }

            class555.method4210(var2 + var5, var4, var2, var1, var4, var5, var5 - -class692.field10301, var1 + var4, var4 - -class316.field4878, false, var5, class288.field4539);
            if (class334.field5138 != null) {
               class639.method4665(-1, var2 + var5, var1 - -var4);
            }
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field10380[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ab",
      name = "c",
      descriptor = "(I)V",
      line = 132
   )
   public static void method5137(int arg0) {
      try {
         if (arg0 != 32) {
            method5137(-7);
         }

         field10376 = null;
         field10370 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10380[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ab",
      name = "a",
      descriptor = "(I)V",
      line = 143
   )
   public final void method5138(int arg0) {
      try {
         if (arg0 != -29881) {
            this.field10372 = null;
         }

         class304 var2 = this.field10373;
         synchronized(this.field10373) {
            this.field10373.method2554(arg0 ^ 29907);
         }

         ++field10369;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field10380[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ab",
      name = "b",
      descriptor = "(I)V",
      line = 163
   )
   public final void method5139(int arg0) {
      try {
         ++field10371;
         class304 var2 = this.field10373;
         synchronized(this.field10373) {
            if (arg0 == -31394) {
               this.field10373.method2551(true);
            }
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field10380[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ab",
      name = "<init>",
      descriptor = "(Ltv;ILrr;)V",
      line = 181
   )
   public class698(class311 arg0, int arg1, class678 arg2) {
      try {
         this.field10372 = arg2;
         this.field10372.method4998((byte)-82, 26);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field10380[2] + (arg0 != null ? field10380[3] : field10380[1]) + ',' + arg1 + ',' + (arg2 != null ? field10380[3] : field10380[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ab",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5140(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 55);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ab",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5141(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 4;
            break;
         case 1:
            var10005 = 62;
            break;
         case 2:
            var10005 = 43;
            break;
         case 3:
            var10005 = 95;
            break;
         default:
            var10005 = 55;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
