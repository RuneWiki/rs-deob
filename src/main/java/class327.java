import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class327 {
   @OriginalMember(
      owner = "client!ce",
      name = "e",
      descriptor = "Loi;"
   )
   private class80 field4472 = new class80(16);
   @OriginalMember(
      owner = "client!ce",
      name = "b",
      descriptor = "Lkf;"
   )
   private class266 field4467;
   @OriginalMember(
      owner = "client!ce",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4474 = new String[]{method2430(method2429("S\fA\\_")), method2430(method2429("S\fA]_")), method2430(method2429("KGA1\n")), method2430(method2429("S\fA#\u001e^\u0000\u001b!_")), method2430(method2429("^\u001c\u0003s")), method2430(method2429("S\fA[_")), method2430(method2429("S\fAX_")), method2430(method2429("S\fA^_")), method2430(method2429("S\fAY_")), method2430(method2429("S\fAZ_"))};
   @OriginalMember(
      owner = "client!ce",
      name = "f",
      descriptor = "Z"
   )
   public static boolean field4470 = false;
   @OriginalMember(
      owner = "client!ce",
      name = "k",
      descriptor = "I"
   )
   public static int field4463;
   @OriginalMember(
      owner = "client!ce",
      name = "i",
      descriptor = "I"
   )
   public static int field4464;
   @OriginalMember(
      owner = "client!ce",
      name = "j",
      descriptor = "I"
   )
   public static int field4465;
   @OriginalMember(
      owner = "client!ce",
      name = "h",
      descriptor = "I"
   )
   public static int field4468;
   @OriginalMember(
      owner = "client!ce",
      name = "g",
      descriptor = "I"
   )
   public static int field4471;
   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "I"
   )
   public static int field4473;
   @OriginalMember(
      owner = "client!ce",
      name = "d",
      descriptor = "Lwh;"
   )
   public static class159 field4469;
   @OriginalMember(
      owner = "client!ce",
      name = "c",
      descriptor = "Lda;"
   )
   public static class67 field4466;

   @OriginalMember(
      owner = "client!ce",
      name = "b",
      descriptor = "(BI)V"
   )
   public final void method2422(byte arg0, int arg1) {
      try {
         ++field4471;
         class80 var3 = this.field4472;
         synchronized(this.field4472) {
            if (arg0 != -51) {
               this.method2422((byte)18, -104);
            }

            this.field4472.method726(arg1, 25324);
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field4474[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method2423(byte arg0) {
      try {
         ++field4464;
         if (arg0 >= 89) {
            class80 var2 = this.field4472;
            synchronized(this.field4472) {
               this.field4472.method731(0);
            }
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field4474[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(BLjava/lang/String;)I"
   )
   public static final int method2424(byte arg0, String arg1) {
      try {
         ++field4473;
         int var2 = -127 % ((60 - arg0) / 55);
         return class550.method3949(arg1, 10, (byte)70, true);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field4474[7] + arg0 + ',' + (arg1 != null ? field4474[2] : field4474[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method2425(int arg0) {
      try {
         ++field4468;
         if (arg0 != -27169) {
            this.method2425(62);
         }

         class80 var2 = this.field4472;
         synchronized(this.field4472) {
            this.field4472.method715(true);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field4474[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method2426(int arg0) {
      try {
         class119.field1479 = null;
         class495.field7169 = null;
         class783.field11475 = false;
         class427.field6123 = null;
         if (arg0 != 30) {
            field4469 = null;
         }

         class556.field7977 = null;
         ++field4465;
         class236.field3291 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4474[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method2427(byte arg0) {
      try {
         if (arg0 <= -96) {
            field4466 = null;
            field4469 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4474[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(BI)Lmv;"
   )
   public final class397 method2428(byte arg0, int arg1) {
      try {
         if (arg0 != -24) {
            return null;
         } else {
            ++field4463;
            class80 var3 = this.field4472;
            class397 var4;
            synchronized(this.field4472) {
               var4 = (class397)this.field4472.method725(0, (long)arg1);
            }

            if (var4 != null) {
               return var4;
            } else {
               class266 var5 = this.field4467;
               byte[] var6;
               synchronized(this.field4467) {
                  var6 = this.field4467.method2037(false, arg1, 30);
               }

               class397 var7 = new class397();
               if (var6 != null) {
                  var7.method3001((byte)-92, new class147(var6));
               }

               class80 var8 = this.field4472;
               synchronized(this.field4472) {
                  this.field4472.method723(0, (long)arg1, var7);
                  return var7;
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field4474[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "<init>",
      descriptor = "(Lno;ILkf;)V"
   )
   public class327(class732 arg0, int arg1, class266 arg2) {
      try {
         this.field4467 = arg2;
         this.field4467.method2060(2, 30);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field4474[3] + (arg0 != null ? field4474[2] : field4474[4]) + ',' + arg1 + ',' + (arg2 != null ? field4474[2] : field4474[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2429(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 119);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ce",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2430(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 48;
            break;
         case 1:
            var10005 = 105;
            break;
         case 2:
            var10005 = 111;
            break;
         case 3:
            var10005 = 31;
            break;
         default:
            var10005 = 119;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
