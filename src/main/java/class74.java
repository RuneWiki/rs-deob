import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class74 extends class439 {
   @OriginalMember(
      owner = "client!gf",
      name = "p",
      descriptor = "B"
   )
   public byte field983 = 5;
   @OriginalMember(
      owner = "client!gf",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field986 = new String[]{method718(method717("?d\u0014\u000fP")), method718(method717("#,\u0014`\u0005")), method718(method717("6wV\"")), method718(method717("?d\u0014\rP")), method718(method717("?d\u0014\fP"))};
   @OriginalMember(
      owner = "client!gf",
      name = "w",
      descriptor = "F"
   )
   public static float field979;
   @OriginalMember(
      owner = "client!gf",
      name = "u",
      descriptor = "I"
   )
   public int field974;
   @OriginalMember(
      owner = "client!gf",
      name = "x",
      descriptor = "I"
   )
   public int field975;
   @OriginalMember(
      owner = "client!gf",
      name = "y",
      descriptor = "I"
   )
   public int field976;
   @OriginalMember(
      owner = "client!gf",
      name = "t",
      descriptor = "I"
   )
   public int field977;
   @OriginalMember(
      owner = "client!gf",
      name = "z",
      descriptor = "I"
   )
   public static int field978;
   @OriginalMember(
      owner = "client!gf",
      name = "A",
      descriptor = "I"
   )
   public int field980;
   @OriginalMember(
      owner = "client!gf",
      name = "s",
      descriptor = "I"
   )
   public int field982;
   @OriginalMember(
      owner = "client!gf",
      name = "q",
      descriptor = "I"
   )
   public static int field985;
   @OriginalMember(
      owner = "client!gf",
      name = "v",
      descriptor = "Lkd;"
   )
   public static class790 field984;
   @OriginalMember(
      owner = "client!gf",
      name = "r",
      descriptor = "Z"
   )
   public boolean field981;

   @OriginalMember(
      owner = "client!gf",
      name = "a",
      descriptor = "(IIBILww;JZI)V"
   )
   public static final void method714(int arg0, int arg1, byte arg2, int arg3, class339 arg4, long arg5, boolean arg6, int arg7) {
      try {
         class242.field3046 = 10000;
         class204.field2599 = arg3;
         class513.field7157 = arg5;
         class471.field6491 = arg4;
         if (arg2 != 117) {
            method715((String)null, -33, 66, (String)null);
         }

         ++field985;
         class624.field9229 = arg7;
         class176.field2274 = null;
         class704.field10292 = arg0;
         class746.field10895 = arg6;
         class131.field1682 = arg1;
         class533.field7825 = 1;
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field986[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field986[1] : field986[2]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gf",
      name = "a",
      descriptor = "(Ljava/lang/String;IILjava/lang/String;)V"
   )
   public static final void method715(String arg0, int arg1, int arg2, String arg3) {
      try {
         ++field978;
         if (~arg0.length() >= -321) {
            if (class5.method44((byte)-29)) {
               class550.method4167((byte)-11);
               class139.field1755 = arg1;
               class130.field1666 = arg3;
               class76.field1009 = arg0;
               class577.method4324((byte)-128, arg2);
            }
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field986[4] + (arg0 != null ? field986[1] : field986[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field986[1] : field986[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gf",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method716(byte arg0) {
      try {
         field984 = null;
         if (arg0 != -13) {
            method716((byte)31);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field986[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method717(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 120);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method718(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 88;
            break;
         case 1:
            var10005 = 2;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 78;
            break;
         default:
            var10005 = 120;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
