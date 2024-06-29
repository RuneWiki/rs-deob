import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class286 extends class366 {
   @OriginalMember(
      owner = "client!ph",
      name = "W",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4504 = new String[]{method2390(method2389("7&\u0011D")), method2390(method2389(");Sj\u0012")), method2390(method2389("\"}S\u0006G")), method2390(method2389(");Sj{q")), method2390(method2389(");Si\u0012")), method2390(method2389(");So{q")), method2390(method2389(");S`{q"))};
   @OriginalMember(
      owner = "client!ph",
      name = "S",
      descriptor = "Lnaa;"
   )
   public static class113 field4500 = new class113(11, 7);
   @OriginalMember(
      owner = "client!ph",
      name = "Q",
      descriptor = "Luk;"
   )
   public static class498 field4503 = new class498(79, 3);
   @OriginalMember(
      owner = "client!ph",
      name = "V",
      descriptor = "I"
   )
   public static int field4498;
   @OriginalMember(
      owner = "client!ph",
      name = "U",
      descriptor = "I"
   )
   public static int field4499;
   @OriginalMember(
      owner = "client!ph",
      name = "T",
      descriptor = "I"
   )
   public static int field4501;
   @OriginalMember(
      owner = "client!ph",
      name = "R",
      descriptor = "I"
   )
   public static int field4502;

   @OriginalMember(
      owner = "client!ph",
      name = "a",
      descriptor = "(Lica;B)V",
      line = 3
   )
   public static final void method2384(class354 arg0, byte arg1) {
      boolean var2 = client.field1786;

      try {
         ++field4499;
         int var3 = arg0.method2896(0);
         class31.field382 = new class426[var3];
         int var4 = 0;
         if (var2) {
            class31.field382[var4] = new class426();
            class31.field382[var4].field6580 = arg0.method2896(0);
            class31.field382[var4].field6583 = arg0.method2847(1);
            ++var4;
         }

         while(true) {
            while(var4 < var3) {
               class31.field382[var4] = new class426();
               class31.field382[var4].field6580 = arg0.method2896(0);
               class31.field382[var4].field6583 = arg0.method2847(1);
               ++var4;
            }

            class576.field8526 = arg0.method2896(0);
            class766.field11319 = arg0.method2896(0);
            if (!var2) {
               if (arg1 != -118) {
                  field4503 = null;
               }

               class556.field8295 = arg0.method2896(0);
               class317.field4894 = new class433[class766.field11319 + 1 + -class576.field8526];
               int var5 = 0;
               int var10000;
               if (var2) {
                  var10000 = arg0.method2896(arg1 ^ -118);
               } else if (~class556.field8295 >= ~var5) {
                  class733.field10928 = arg0.method2894(arg1 + 221);
                  var10000 = 1;
                  if (!var2) {
                     class50.field639 = true;
                     return;
                  }
               } else {
                  var10000 = arg0.method2896(arg1 ^ -118);
               }

               while(true) {
                  int var6 = var10000;
                  class433 var7 = class317.field4894[var6] = new class433();
                  var7.field9100 = arg0.method2855(arg1 ^ 31083);
                  var7.field9105 = arg0.method2894(arg1 + 229);
                  var7.field6662 = var6 - -class576.field8526;
                  var7.field6658 = arg0.method2847(arg1 ^ -117);
                  var7.field6661 = arg0.method2847(1);
                  ++var5;
                  if (~class556.field8295 >= ~var5) {
                     class733.field10928 = arg0.method2894(arg1 + 221);
                     var10000 = 1;
                     if (!var2) {
                        class50.field639 = true;
                        return;
                     }
                  } else {
                     var10000 = arg0.method2896(arg1 ^ -118);
                  }
               }
            }

            ++var4;
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field4504[1] + (arg0 != null ? field4504[2] : field4504[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ph",
      name = "<init>",
      descriptor = "()V",
      line = 50
   )
   public class286() {
      super(false);
   }

   @OriginalMember(
      owner = "client!ph",
      name = "a",
      descriptor = "(IIIII)V",
      line = 54
   )
   public static final void method2385(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field4501;
         class566 var5 = class146.method1321((long)arg0 << 32 | (long)arg1, 19, -1428737160);
         var5.method4269((byte)-111);
         if (arg4 >= -39) {
            method2387((byte)61, (class610)null);
         }

         var5.field8394 = arg3;
         var5.field8398 = arg2;
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field4504[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ph",
      name = "i",
      descriptor = "(I)V",
      line = 75
   )
   public static void method2386(int arg0) {
      try {
         if (arg0 > -81) {
            field4503 = null;
         }

         field4500 = null;
         field4503 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4504[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ph",
      name = "a",
      descriptor = "(BLha;)V",
      line = 86
   )
   public static final void method2387(byte arg0, class610 arg1) {
      try {
         label23: {
            int var2 = 101 / ((-42 - arg0) / 40);
            if (class304.field4759) {
               class190.method1691(arg1, false);
               if (!client.field1786) {
                  break label23;
               }
            }

            class646.method4696(arg1, 113);
         }

         ++field4498;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4504[6] + arg0 + ',' + (arg1 != null ? field4504[2] : field4504[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ph",
      name = "a",
      descriptor = "(Lvg;IZ)V",
      line = 102
   )
   public final void method2388(class82 arg0, int arg1, boolean arg2) {
      try {
         if (arg2) {
            field4503 = null;
         }

         ++field4502;
         class607.method4476(arg0, 0, arg1);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field4504[3] + (arg0 != null ? field4504[2] : field4504[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ph",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2389(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 58);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ph",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2390(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 89;
            break;
         case 1:
            var10005 = 83;
            break;
         case 2:
            var10005 = 125;
            break;
         case 3:
            var10005 = 40;
            break;
         default:
            var10005 = 58;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
