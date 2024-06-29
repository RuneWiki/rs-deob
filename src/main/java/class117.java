import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class117 implements Runnable {
   @OriginalMember(
      owner = "client!ra",
      name = "j",
      descriptor = "[Lsu;"
   )
   public volatile class220[] field1423 = new class220[2];
   @OriginalMember(
      owner = "client!ra",
      name = "a",
      descriptor = "Z"
   )
   public volatile boolean field1422 = false;
   @OriginalMember(
      owner = "client!ra",
      name = "d",
      descriptor = "Z"
   )
   public volatile boolean field1420 = false;
   @OriginalMember(
      owner = "client!ra",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1430 = new String[]{method982(method981(";E\nvb'\f")), method982(method981(";E\nE?")), method982(method981(";E\nF?")), method982(method981(";E\nG?")), method982(method981(";E\n@?"))};
   @OriginalMember(
      owner = "client!ra",
      name = "g",
      descriptor = "I"
   )
   public static int field1428 = 0;
   @OriginalMember(
      owner = "client!ra",
      name = "i",
      descriptor = "Lsd;"
   )
   public static class101 field1426 = new class101(127, -1);
   @OriginalMember(
      owner = "client!ra",
      name = "k",
      descriptor = "I"
   )
   public static int field1419;
   @OriginalMember(
      owner = "client!ra",
      name = "f",
      descriptor = "I"
   )
   public static int field1421;
   @OriginalMember(
      owner = "client!ra",
      name = "b",
      descriptor = "I"
   )
   public static int field1424;
   @OriginalMember(
      owner = "client!ra",
      name = "h",
      descriptor = "I"
   )
   public static int field1427;
   @OriginalMember(
      owner = "client!ra",
      name = "c",
      descriptor = "I"
   )
   public static int field1429;
   @OriginalMember(
      owner = "client!ra",
      name = "e",
      descriptor = "Lhg;"
   )
   public class719 field1425;

   @OriginalMember(
      owner = "client!ra",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method976(int arg0, int arg1, int arg2) {
      try {
         ++field1421;
         class403 var3 = class453.method3410((long)arg2, true, arg1);
         var3.method3093(22144);
         var3.field6185 = arg0;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field1430[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ra",
      name = "a",
      descriptor = "(BC)Z"
   )
   public static final boolean method977(byte arg0, char arg1) {
      try {
         ++field1424;
         if (arg0 > -72) {
            method976(41, 92, 1);
         }

         return arg1 >= 'A' && ~arg1 >= -91 || arg1 >= 'a' && arg1 <= 'z';
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1430[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ra",
      name = "a",
      descriptor = "(Llu;Z)Z"
   )
   public static final boolean method978(class741 arg0, boolean arg1) {
      boolean var2 = class650.field9484 == class377.field5711;
      int var3 = 0;
      short var4 = 0;
      byte var5 = 0;
      arg0.method14(-56);
      if (arg0.field10995 >= 0 && arg0.field11000 >= 0 && arg0.field10990 < class239.field3036 && arg0.field10992 < class220.field2796) {
         short var6 = 0;

         for(int var7 = arg0.field10995; var7 <= arg0.field10990; ++var7) {
            for(int var11 = arg0.field11000; var11 <= arg0.field10992; ++var11) {
               class72 var12 = class349.method2732(arg0.field9010, var7, var11);
               if (var12 != null) {
                  class389 var13 = class344.method2700(arg0, 2);
                  class389 var14 = var12.field910;
                  if (var14 == null) {
                     var12.field910 = var13;
                  } else {
                     while(var14.field5942 != null) {
                        var14 = var14.field5942;
                     }

                     var14.field5942 = var13;
                  }

                  if (var2 && (class173.field2163[var7][var11] & -16777216) != 0) {
                     var3 = class173.field2163[var7][var11];
                     var4 = class661.field9571[var7][var11];
                     var5 = class583.field8642[var7][var11];
                  }

                  if (!arg1 && var12.field919 != null && var12.field919.field3334 > var6) {
                     var6 = var12.field919.field3334;
                  }
               }
            }
         }

         if (var2 && (var3 & -16777216) != 0) {
            for(int var8 = arg0.field10995; var8 <= arg0.field10990; ++var8) {
               for(int var9 = arg0.field11000; var9 <= arg0.field10992; ++var9) {
                  if ((class173.field2163[var8][var9] & -16777216) == 0) {
                     class173.field2163[var8][var9] = var3;
                     class661.field9571[var8][var9] = var4;
                     class583.field8642[var8][var9] = var5;
                  }
               }
            }
         }

         if (arg1) {
            class64.field789[class87.field1060++] = arg0;
         } else {
            int var10 = class650.field9484 == class377.field5711 ? 1 : 0;
            if (arg0.method2(-7577)) {
               if (arg0.method5(-26787)) {
                  arg0.field8996 = class197.field2449[var10];
                  class197.field2449[var10] = arg0;
               } else {
                  arg0.field8996 = class764.field11222[var10];
                  class764.field11222[var10] = arg0;
                  class321.field4583 = true;
               }
            } else {
               arg0.field8996 = class535.field7803[var10];
               class535.field7803[var10] = arg0;
            }
         }

         if (arg1) {
            arg0.field8998 -= var6;
         }

         return true;
      } else {
         return false;
      }
   }

   @OriginalMember(
      owner = "client!ra",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method979(int arg0) {
      try {
         field1426 = null;
         if (arg0 > -50) {
            method979(-53);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1430[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ra",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method980(int arg0, int arg1) {
      try {
         if (arg0 > -48) {
            method977((byte)-120, 'z');
         }

         ++field1419;
         return arg1 == 4 || ~arg1 == -9 || arg1 == 11;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1430[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ra",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      int var1 = client.field4530;

      try {
         ++field1427;
         this.field1420 = true;

         try {
            if (var1 != 0 || !this.field1422) {
               do {
                  int var2 = 0;
                  if (var1 != 0 || var2 < 2) {
                     do {
                        class220 var3 = this.field1423[var2];
                        if (var3 != null) {
                           var3.method1666(-16385);
                        }

                        ++var2;
                     } while(var2 < 2);
                  }

                  class89.method817(10L, 2535);
                  class580.method4275(1001, this.field1425, (Object)null);
               } while(!this.field1422);
            }
         } catch (Exception var12) {
            class238.method1776(-113, var12, (String)null);
         } finally {
            Object var8 = null;
            this.field1420 = false;
         }

      } catch (RuntimeException var14) {
         throw class670.method4877(var14, field1430[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ra",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method981(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 23);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ra",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method982(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 73;
            break;
         case 1:
            var10005 = 36;
            break;
         case 2:
            var10005 = 36;
            break;
         case 3:
            var10005 = 4;
            break;
         default:
            var10005 = 23;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
