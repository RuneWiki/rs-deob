import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class748 {
   @OriginalMember(
      owner = "client!ca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11097 = new String[]{method5501(method5500("HGZe")), method5501(method5500("]\u001c\u0018']")), method5501(method5500("ES\u0018O\b")), method5501(method5500("ES\u0018L\b")), method5501(method5500("ES\u0018M\b")), method5501(method5500("ES\u0018K\b")), method5501(method5500("ES\u0018N\b")), method5501(method5500("ES\u0018H\b"))};
   @OriginalMember(
      owner = "client!ca",
      name = "b",
      descriptor = "Lsn;"
   )
   public static class675 field11087 = new class675();
   @OriginalMember(
      owner = "client!ca",
      name = "c",
      descriptor = "Luk;"
   )
   public static class498 field11096 = new class498(98, 6);
   @OriginalMember(
      owner = "client!ca",
      name = "k",
      descriptor = "I"
   )
   public static int field11086;
   @OriginalMember(
      owner = "client!ca",
      name = "e",
      descriptor = "I"
   )
   public static int field11088;
   @OriginalMember(
      owner = "client!ca",
      name = "j",
      descriptor = "I"
   )
   public static int field11089;
   @OriginalMember(
      owner = "client!ca",
      name = "i",
      descriptor = "I"
   )
   private int field11090;
   @OriginalMember(
      owner = "client!ca",
      name = "g",
      descriptor = "I"
   )
   public int field11091;
   @OriginalMember(
      owner = "client!ca",
      name = "a",
      descriptor = "I"
   )
   public static int field11092;
   @OriginalMember(
      owner = "client!ca",
      name = "h",
      descriptor = "I"
   )
   public static int field11093;
   @OriginalMember(
      owner = "client!ca",
      name = "f",
      descriptor = "I"
   )
   public int field11095;
   @OriginalMember(
      owner = "client!ca",
      name = "d",
      descriptor = "Lbj;"
   )
   public class704 field11094;

   @OriginalMember(
      owner = "client!ca",
      name = "a",
      descriptor = "(Lica;Z)V",
      line = 4
   )
   public final void method5493(class354 arg0, boolean arg1) {
      boolean var3 = client.field1786;

      try {
         if (!arg1) {
            while(true) {
               int var4 = arg0.method2855(-31007);
               if (var4 != 0) {
                  this.method5495(var4, 1, arg0);
                  if (var3) {
                     break;
                  }

                  if (!var3) {
                     continue;
                  }
               }

               ++field11086;
               break;
            }

         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field11097[2] + (arg0 != null ? field11097[1] : field11097[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ca",
      name = "a",
      descriptor = "(IIII)V",
      line = 25
   )
   public static final void method5494(int arg0, int arg1, int arg2, int arg3) {
      try {
         if (arg0 == 31382) {
            class757.field11211 = new byte[arg1][arg2][arg3];
            ++field11088;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field11097[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ca",
      name = "a",
      descriptor = "(IILica;)V",
      line = 37
   )
   private final void method5495(int arg0, int arg1, class354 arg2) {
      try {
         label26: {
            if (arg0 == arg1) {
               this.field11090 = arg2.method2848(arg1 ^ -120);
               if (!client.field1786) {
                  break label26;
               }
            }

            if (arg0 == 2) {
               this.field11095 = arg2.method2855(-31007);
               this.field11091 = arg2.method2855(-31007);
            }
         }

         ++field11092;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field11097[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11097[1] : field11097[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ca",
      name = "a",
      descriptor = "(Z)V",
      line = 60
   )
   public static void method5496(boolean arg0) {
      try {
         field11096 = null;
         if (!arg0) {
            field11087 = null;
         }

         field11087 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11097[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ca",
      name = "a",
      descriptor = "(I)Lkp;",
      line = 72
   )
   public final synchronized class776 method5497(int arg0) {
      try {
         ++field11093;
         if (arg0 > -30) {
            this.method5497(-47);
         }

         class776 var2 = (class776)this.field11094.field10606.method2544(false, (long)this.field11090);
         if (var2 != null) {
            return var2;
         } else {
            class776 var3 = class776.method5639(this.field11094.field10598, this.field11090, 0);
            if (var3 != null) {
               this.field11094.field10606.method2545((long)this.field11090, 123, var3);
            }

            return var3;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field11097[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ca",
      name = "a",
      descriptor = "(II)V",
      line = 100
   )
   public static final void method5498(int arg0, int arg1) {
      class190 var2 = class711.field10694[0][arg0][arg1];

      for(int var3 = 0; var3 < 3; ++var3) {
         class190 var4 = class711.field10694[var3][arg0][arg1] = class711.field10694[var3 + 1][arg0][arg1];
         if (var4 != null) {
            for(class605 var5 = var4.field2962; var5 != null; var5 = var5.field8840) {
               class78 var6 = var5.field8839;
               if (var6.field1040 == arg0 && var6.field1044 == arg1) {
                  --var6.field1506;
               }
            }

            if (var4.field2952 != null) {
               --var4.field2952.field1506;
            }

            if (var4.field2960 != null) {
               --var4.field2960.field1506;
            }

            if (var4.field2955 != null) {
               --var4.field2955.field1506;
            }

            if (var4.field2953 != null) {
               --var4.field2953.field1506;
            }

            if (var4.field2951 != null) {
               --var4.field2951.field1506;
            }
         }
      }

      if (class711.field10694[0][arg0][arg1] == null) {
         class711.field10694[0][arg0][arg1] = new class190(0);
         class711.field10694[0][arg0][arg1].field2954 = 1;
      }

      class711.field10694[0][arg0][arg1].field2959 = var2;
      class711.field10694[3][arg0][arg1] = null;
   }

   @OriginalMember(
      owner = "client!ca",
      name = "b",
      descriptor = "(I)Z",
      line = 157
   )
   public static final boolean method5499(int arg0) {
      try {
         ++field11089;
         if (arg0 != 6) {
            method5499(56);
         }

         if (class192.field2987 == null) {
            return false;
         } else {
            if (~class192.field2987.field2896 <= -2001) {
               class192.field2987.field2896 -= 2000;
            }

            return ~class192.field2987.field2896 == -1005;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11097[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5500(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 32);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5501(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 38;
            break;
         case 1:
            var10005 = 50;
            break;
         case 2:
            var10005 = 54;
            break;
         case 3:
            var10005 = 9;
            break;
         default:
            var10005 = 32;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
