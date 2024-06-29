import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class69 {
   @OriginalMember(
      owner = "client!oi",
      name = "j",
      descriptor = "Lnm;"
   )
   public class439 field918 = new class439();
   @OriginalMember(
      owner = "client!oi",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field924 = new String[]{method685(method684("`\u001a-\f\u000e")), method685(method684("`\u001a-\r\u000e")), method685(method684("`\u001a-tOa\u001awv\u000e")), method685(method684("`\u001a-\t\u000e")), method685(method684("`\u001a-\u000f\u000e")), method685(method684("`\u001a-\u0000\u000e")), method685(method684("a\u0006o$")), method685(method684("t]-f[")), method685(method684("`\u001a-\u000e\u000e")), method685(method684("`\u001a-\u000b\u000e")), method685(method684("`\u001a-\n\u000e"))};
   @OriginalMember(
      owner = "client!oi",
      name = "b",
      descriptor = "[Ldk;"
   )
   public static class715[] field915 = new class715[128];
   @OriginalMember(
      owner = "client!oi",
      name = "k",
      descriptor = "I"
   )
   public static int field913;
   @OriginalMember(
      owner = "client!oi",
      name = "c",
      descriptor = "I"
   )
   public static int field914;
   @OriginalMember(
      owner = "client!oi",
      name = "h",
      descriptor = "I"
   )
   public static int field916;
   @OriginalMember(
      owner = "client!oi",
      name = "f",
      descriptor = "I"
   )
   public static int field917;
   @OriginalMember(
      owner = "client!oi",
      name = "a",
      descriptor = "I"
   )
   public static int field919;
   @OriginalMember(
      owner = "client!oi",
      name = "g",
      descriptor = "I"
   )
   public static int field920;
   @OriginalMember(
      owner = "client!oi",
      name = "e",
      descriptor = "I"
   )
   public static int field921;
   @OriginalMember(
      owner = "client!oi",
      name = "d",
      descriptor = "I"
   )
   public static int field922;
   @OriginalMember(
      owner = "client!oi",
      name = "i",
      descriptor = "Lnm;"
   )
   private class439 field923;

   @OriginalMember(
      owner = "client!oi",
      name = "a",
      descriptor = "(B)Lnm;"
   )
   public final class439 method676(byte arg0) {
      try {
         ++field920;
         int var2 = -102 % ((arg0 - 57) / 52);
         class439 var3 = this.field918.field5973;
         if (this.field918 == var3) {
            this.field923 = null;
            return null;
         } else {
            this.field923 = var3.field5973;
            return var3;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field924[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oi",
      name = "b",
      descriptor = "(I)Lnm;"
   )
   public final class439 method677(int arg0) {
      try {
         ++field917;
         class439 var2 = this.field923;
         if (this.field918 == var2) {
            this.field923 = null;
            return null;
         } else if (arg0 >= -77) {
            return null;
         } else {
            this.field923 = var2.field5973;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field924[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oi",
      name = "a",
      descriptor = "(Lnm;B)V"
   )
   public final void method678(class439 arg0, byte arg1) {
      try {
         if (arg0.field5978 != null) {
            arg0.method3387(111);
         }

         ++field913;
         arg0.field5978 = this.field918.field5978;
         if (arg1 != 108) {
            method681((byte[])null, 105, -91, false);
         }

         arg0.field5973 = this.field918;
         arg0.field5978.field5973 = arg0;
         arg0.field5973.field5978 = arg0;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field924[8] + (arg0 != null ? field924[7] : field924[6]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oi",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method679(boolean arg0) {
      boolean var2 = client.field1481;

      try {
         ++field914;
         if (!arg0) {
            method683((byte)-26);
         }

         while(true) {
            class439 var3 = this.field918.field5973;
            if (this.field918 != var3) {
               var3.method3387(127);
               if (var2) {
                  break;
               }

               if (!var2) {
                  continue;
               }
            }

            this.field923 = null;
            break;
         }

      } catch (RuntimeException var5) {
         throw class93.method866(var5, field924[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oi",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method680(int arg0) {
      boolean var2 = client.field1481;

      try {
         ++field921;
         int var3 = arg0;
         class439 var4 = this.field918.field5973;
         if (var2) {
            var4 = var4.field5973;
            var3 = arg0 + 1;
         }

         while(true) {
            while(this.field918 != var4) {
               var4 = var4.field5973;
               ++var3;
            }

            if (!var2) {
               return var3;
            }

            ++var3;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field924[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oi",
      name = "a",
      descriptor = "([BIIZ)I"
   )
   public static final int method681(byte[] arg0, int arg1, int arg2, boolean arg3) {
      boolean var4 = client.field1481;

      try {
         ++field916;
         int var5 = -1;
         int var6 = arg2;
         if (var4) {
            var5 = var5 >>> 8 ^ class548.field8079[255 & (var5 ^ arg0[arg2])];
            var6 = arg2 + 1;
         }

         while(true) {
            while(var6 < arg1) {
               var5 = var5 >>> 8 ^ class548.field8079[255 & (var5 ^ arg0[var6])];
               ++var6;
            }

            if (!var4) {
               if (arg3 != 1) {
                  method681((byte[])null, -43, -120, false);
               }

               return ~var5;
            }

            var5 = arg3 ^ 1;
            ++var6;
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field924[5] + (arg0 != null ? field924[7] : field924[6]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oi",
      name = "a",
      descriptor = "(ZII)Z"
   )
   public static final boolean method682(boolean arg0, int arg1, int arg2) {
      try {
         if (arg0) {
            field919 = -81;
         }

         ++field922;
         return ~(arg1 & 2048) != -1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field924[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oi",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method683(byte arg0) {
      try {
         field915 = null;
         int var1 = 87 / ((arg0 - -17) / 36);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field924[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oi",
      name = "<init>",
      descriptor = "()V"
   )
   public class69() {
      try {
         this.field918.field5973 = this.field918;
         this.field918.field5978 = this.field918;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field924[2] + ')');
      }
   }

   @OriginalMember(
      owner = "client!oi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method684(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 38);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method685(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 15;
            break;
         case 1:
            var10005 = 115;
            break;
         case 2:
            var10005 = 3;
            break;
         case 3:
            var10005 = 72;
            break;
         default:
            var10005 = 38;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
