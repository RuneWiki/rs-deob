import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class2 {
   @OriginalMember(
      owner = "client!pb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field28 = new String[]{method18(method17("\u001d!^Z7")), method18(method17("\u0016m^1b")), method18(method17("\u001d!^]7")), method18(method17("\u00036\u001cs")), method18(method17("$-\u0006~s\u0004'PXE$\u0013P|p\u00003\u0002zl\u001e&\u0014?{\f7\u0011>")), method18(method17("$-\u0006~s\u0004'PXE$\u0013Pwz\f'\u0015m>")), method18(method17("\u001d!^^7")), method18(method17("\u001d!^\\7")), method18(method17("\u001d!^[7"))};
   @OriginalMember(
      owner = "client!pb",
      name = "g",
      descriptor = "Laka;"
   )
   public static class418 field21 = new class418(66, 3);
   @OriginalMember(
      owner = "client!pb",
      name = "b",
      descriptor = "Laka;"
   )
   public static class418 field25 = new class418(110, 3);
   @OriginalMember(
      owner = "client!pb",
      name = "d",
      descriptor = "I"
   )
   public static int field27 = 0;
   @OriginalMember(
      owner = "client!pb",
      name = "f",
      descriptor = "I"
   )
   public static int field22;
   @OriginalMember(
      owner = "client!pb",
      name = "e",
      descriptor = "I"
   )
   public static int field24;
   @OriginalMember(
      owner = "client!pb",
      name = "c",
      descriptor = "I"
   )
   public static int field26;
   @OriginalMember(
      owner = "client!pb",
      name = "a",
      descriptor = "Ljava/util/zip/Inflater;"
   )
   private Inflater field23;

   @OriginalMember(
      owner = "client!pb",
      name = "a",
      descriptor = "(JIB)Lbd;"
   )
   public static final class487 method12(long arg0, int arg1, byte arg2) {
      try {
         if (arg2 != 43) {
            field27 = -48;
         }

         ++field26;
         class487 var4 = (class487)class42.field551.method1818(arg2 ^ -44, arg0 | (long)arg1 << 56);
         if (var4 == null) {
            var4 = new class487(arg1, arg0);
            class42.field551.method1808(var4.field9965, var4, 26459);
         }

         return var4;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field28[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pb",
      name = "a",
      descriptor = "(I[B)[B"
   )
   public final byte[] method13(int arg0, byte[] arg1) {
      try {
         ++field22;
         class66 var3 = new class66(arg1);
         var3.field864 = arg1.length + arg0;
         int var4 = var3.method657(0);
         byte[] var5 = new byte[var4];
         var3.field864 = 0;
         this.method14(var3, var5, 8);
         return var5;
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field28[6] + arg0 + ',' + (arg1 != null ? field28[1] : field28[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pb",
      name = "a",
      descriptor = "(Lgea;[BI)V"
   )
   public final void method14(class66 arg0, byte[] arg1, int arg2) {
      try {
         ++field24;
         if (arg0.field859[arg0.field864] == 31 && ~arg0.field859[arg0.field864 - -1] == 116) {
            if (arg2 == 8) {
               if (this.field23 == null) {
                  this.field23 = new Inflater(true);
               }

               try {
                  this.field23.setInput(arg0.field859, arg0.field864 - -10, arg0.field859.length + -8 + -10 + -arg0.field864);
                  this.field23.inflate(arg1);
               } catch (Exception var5) {
                  this.field23.reset();
                  throw new RuntimeException(field28[4]);
               }

               this.field23.reset();
            }
         } else {
            throw new RuntimeException(field28[5]);
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field28[2] + (arg0 != null ? field28[1] : field28[3]) + ',' + (arg1 != null ? field28[1] : field28[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pb",
      name = "<init>",
      descriptor = "()V"
   )
   public class2() {
      this(-1, 1000000, 1000000);
   }

   @OriginalMember(
      owner = "client!pb",
      name = "a",
      descriptor = "(II)I"
   )
   public static int method15(int arg0, int arg1) {
      try {
         return arg0 | arg1;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field28[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pb",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method16(int arg0) {
      try {
         field21 = null;
         if (arg0 < 7) {
            method12(-70L, 27, (byte)-109);
         }

         field25 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field28[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pb",
      name = "<init>",
      descriptor = "(III)V"
   )
   private class2(int arg0, int arg1, int arg2) {
   }

   @OriginalMember(
      owner = "client!pb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method17(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method18(char[] arg0) {
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
            var10005 = 67;
            break;
         case 2:
            var10005 = 112;
            break;
         case 3:
            var10005 = 31;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
