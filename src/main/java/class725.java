import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jha")
public class class725 {
   @OriginalMember(
      owner = "client!jha",
      name = "h",
      descriptor = "Loi;"
   )
   private class80 field10582 = new class80(64);
   @OriginalMember(
      owner = "client!jha",
      name = "e",
      descriptor = "Lkf;"
   )
   private class266 field10581;
   @OriginalMember(
      owner = "client!jha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10586 = new String[]{method5281(method5280("\u0006km\u000bxD")), method5281(method5280("\u0006km\u000b}D")), method5281(method5280("\u0006km\u000b|D")), method5281(method5280("\u0006km\u000bzD")), method5281(method5280("\u0002v`I")), method5281(method5280("\u0017-\"\u000bC")), method5281(method5280("\u0006km\u000b{D")), method5281(method5280("\u0006km\u000b\u007fD")), method5281(method5280("\u0006km\u000b\u0002\u0005meQ\u0000D"))};
   @OriginalMember(
      owner = "client!jha",
      name = "i",
      descriptor = "[[I"
   )
   public static int[][] field10579 = new int[][]{{6, 6}, {6, 6}, {6, 5, 5}, {5, 6, 5}, {5, 5, 6}, {6, 5, 5}, {5, 0, 4, 1}, {7, 7, 1, 2}, {7, 1, 2, 7}, {8, 9, 4, 0, 8, 9}, {0, 8, 9, 8, 9, 4}, {11, 0, 10, 11, 4, 2}, {6, 6}, {7, 7, 1, 2}, {7, 7, 1, 2}};
   @OriginalMember(
      owner = "client!jha",
      name = "f",
      descriptor = "I"
   )
   public static int field10577;
   @OriginalMember(
      owner = "client!jha",
      name = "c",
      descriptor = "I"
   )
   public static int field10578;
   @OriginalMember(
      owner = "client!jha",
      name = "a",
      descriptor = "I"
   )
   public static int field10580;
   @OriginalMember(
      owner = "client!jha",
      name = "b",
      descriptor = "I"
   )
   public static int field10583;
   @OriginalMember(
      owner = "client!jha",
      name = "d",
      descriptor = "I"
   )
   public static int field10584;
   @OriginalMember(
      owner = "client!jha",
      name = "g",
      descriptor = "I"
   )
   public static int field10585;

   @OriginalMember(
      owner = "client!jha",
      name = "a",
      descriptor = "(II)Lvj;"
   )
   public final class468 method5274(int arg0, int arg1) {
      try {
         ++field10584;
         class80 var3 = this.field10582;
         class468 var4;
         synchronized(this.field10582) {
            var4 = (class468)this.field10582.method725(0, (long)arg0);
         }

         if (var4 != null) {
            return var4;
         } else {
            class266 var5 = this.field10581;
            byte[] var6;
            synchronized(this.field10581) {
               var6 = this.field10581.method2037(false, arg0, 54);
            }

            class468 var7 = new class468();
            if (var6 != null) {
               var7.method3398(new class147(var6), 2);
            }

            class80 var8 = this.field10582;
            synchronized(this.field10582) {
               this.field10582.method723(0, (long)arg0, var7);
            }

            if (arg1 <= 13) {
               this.field10581 = null;
            }

            return var7;
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field10586[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jha",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method5275(int arg0) {
      try {
         ++field10580;
         class80 var2 = this.field10582;
         synchronized(this.field10582) {
            this.field10582.method731(0);
            if (arg0 >= -122) {
               method5278((byte)90, (class761)null);
            }

         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field10586[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jha",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5276(byte arg0) {
      try {
         if (arg0 < -50) {
            field10579 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10586[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jha",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method5277(int arg0) {
      try {
         ++field10578;
         class80 var2 = this.field10582;
         synchronized(this.field10582) {
            this.field10582.method715(true);
         }

         if (arg0 > -33) {
            this.method5274(90, 105);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field10586[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jha",
      name = "a",
      descriptor = "(BLcm;)V"
   )
   public static final void method5278(byte arg0, class761 arg1) {
      try {
         ++field10577;
         if (arg0 > 105) {
            class566.field8070 = arg1;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10586[3] + arg0 + ',' + (arg1 != null ? field10586[5] : field10586[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jha",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method5279(int arg0, byte arg1) {
      try {
         ++field10583;
         int var3 = 43 % ((arg1 - 3) / 43);
         class80 var4 = this.field10582;
         synchronized(this.field10582) {
            this.field10582.method726(arg0, 25324);
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field10586[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jha",
      name = "<init>",
      descriptor = "(Lno;ILkf;)V"
   )
   public class725(class732 arg0, int arg1, class266 arg2) {
      try {
         this.field10581 = arg2;
         if (this.field10581 != null) {
            this.field10581.method2060(2, 54);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field10586[8] + (arg0 != null ? field10586[5] : field10586[4]) + ',' + arg1 + ',' + (arg2 != null ? field10586[5] : field10586[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5280(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 62);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5281(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 108;
            break;
         case 1:
            var10005 = 3;
            break;
         case 2:
            var10005 = 12;
            break;
         case 3:
            var10005 = 37;
            break;
         default:
            var10005 = 62;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
