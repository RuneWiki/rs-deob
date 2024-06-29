import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class159 {
   @OriginalMember(
      owner = "client!wh",
      name = "h",
      descriptor = "Loi;"
   )
   private class80 field2268 = new class80(64);
   @OriginalMember(
      owner = "client!wh",
      name = "e",
      descriptor = "Lkf;"
   )
   private class266 field2270;
   @OriginalMember(
      owner = "client!wh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2275 = new String[]{method1336(method1335("GV,+Z")), method1336(method1335("K\u0010,9NR\u0011v;\u000f")), method1336(method1335("R\rni")), method1336(method1335("K\u0010,A\u000f")), method1336(method1335("K\u0010,D\u000f")), method1336(method1335("K\u0010,C\u000f")), method1336(method1335("K\u0010,@\u000f")), method1336(method1335("K\u0010,F\u000f")), method1336(method1335("K\u0010,G\u000f"))};
   @OriginalMember(
      owner = "client!wh",
      name = "g",
      descriptor = "I"
   )
   public static int field2266;
   @OriginalMember(
      owner = "client!wh",
      name = "c",
      descriptor = "I"
   )
   public static int field2267;
   @OriginalMember(
      owner = "client!wh",
      name = "b",
      descriptor = "I"
   )
   public static int field2269;
   @OriginalMember(
      owner = "client!wh",
      name = "a",
      descriptor = "I"
   )
   public static int field2271;
   @OriginalMember(
      owner = "client!wh",
      name = "i",
      descriptor = "I"
   )
   public static int field2272;
   @OriginalMember(
      owner = "client!wh",
      name = "f",
      descriptor = "I"
   )
   public static int field2273;
   @OriginalMember(
      owner = "client!wh",
      name = "d",
      descriptor = "I"
   )
   public static int field2274;

   @OriginalMember(
      owner = "client!wh",
      name = "a",
      descriptor = "(III)Z",
      line = 3
   )
   public static final boolean method1329(int arg0, int arg1, int arg2) {
      try {
         ++field2273;
         if (arg2 != 64) {
            method1332(-59, -25, (byte)-78, -56);
         }

         return class222.method1744(arg0, 19887, arg1) & class627.method4551(arg1, (byte)127, arg0);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field2275[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wh",
      name = "b",
      descriptor = "(Z)V",
      line = 15
   )
   public final void method1330(boolean arg0) {
      try {
         ++field2269;
         if (!arg0) {
            this.field2268 = null;
         }

         class80 var2 = this.field2268;
         synchronized(this.field2268) {
            this.field2268.method731(0);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field2275[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wh",
      name = "a",
      descriptor = "(II)V",
      line = 34
   )
   public final void method1331(int arg0, int arg1) {
      try {
         class80 var3 = this.field2268;
         synchronized(this.field2268) {
            this.field2268.method726(arg0, 25324);
         }

         ++field2266;
         if (arg1 >= -113) {
            this.method1334(50, (byte)84);
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field2275[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wh",
      name = "a",
      descriptor = "(IIBI)V",
      line = 47
   )
   public static final void method1332(int arg0, int arg1, byte arg2, int arg3) {
      try {
         ++field2271;
         int var6 = arg3 * class300.field4107.field6433.method4286(arg2 ^ -27) >> 8;
         if (arg2 != 51) {
            method1332(48, 73, (byte)28, -62);
         }

         label43: {
            if (~arg1 == 0 && !class759.field11229) {
               class670.method4881(-29068);
               if (!client.field4360) {
                  break label43;
               }
            }

            if (arg1 != -1 && (class497.field7205 != arg1 || !class617.method4482(0)) && var6 != 0 && !class759.field11229) {
               class454.method3316(class707.field10327, arg1, arg0, arg2 ^ -52, 0, var6, false);
               class488.method3544(arg2 ^ -51);
            }
         }

         if (class497.field7205 != arg1) {
            class681.field10032 = null;
         }

         class497.field7205 = arg1;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field2275[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wh",
      name = "<init>",
      descriptor = "(Lno;ILkf;)V",
      line = 97
   )
   public class159(class732 arg0, int arg1, class266 arg2) {
      try {
         this.field2270 = arg2;
         if (this.field2270 != null) {
            this.field2270.method2060(2, 11);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field2275[1] + (arg0 != null ? field2275[0] : field2275[2]) + ',' + arg1 + ',' + (arg2 != null ? field2275[0] : field2275[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wh",
      name = "a",
      descriptor = "(Z)V",
      line = 83
   )
   public final void method1333(boolean arg0) {
      try {
         ++field2274;
         class80 var2 = this.field2268;
         synchronized(this.field2268) {
            this.field2268.method715(true);
            if (arg0) {
               this.field2270 = null;
            }

         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field2275[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wh",
      name = "a",
      descriptor = "(IB)Lkia;",
      line = 117
   )
   public final class649 method1334(int arg0, byte arg1) {
      try {
         ++field2272;
         int var3 = -42 % ((68 - arg1) / 32);
         class80 var4 = this.field2268;
         class649 var5;
         synchronized(this.field2268) {
            var5 = (class649)this.field2268.method725(0, (long)arg0);
         }

         if (var5 != null) {
            return var5;
         } else {
            class266 var6 = this.field2270;
            byte[] var7;
            synchronized(this.field2270) {
               var7 = this.field2270.method2037(false, arg0, 11);
            }

            class649 var8 = new class649();
            if (var7 != null) {
               var8.method4726((byte)-77, new class147(var7));
            }

            class80 var9 = this.field2268;
            synchronized(this.field2268) {
               this.field2268.method723(0, (long)arg0, var8);
               return var8;
            }
         }
      } catch (RuntimeException var14) {
         throw class237.method1823(var14, field2275[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1335(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 39);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1336(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 60;
            break;
         case 1:
            var10005 = 120;
            break;
         case 2:
            var10005 = 2;
            break;
         case 3:
            var10005 = 5;
            break;
         default:
            var10005 = 39;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
