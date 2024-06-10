import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loginapplet!f")
public class class14 extends class48 {
   @OriginalMember(
      owner = "loginapplet!f",
      name = "s",
      descriptor = "Z"
   )
   public static boolean field110 = true;
   @OriginalMember(
      owner = "loginapplet!f",
      name = "t",
      descriptor = "Lo;"
   )
   public static class32 field111 = new class32();
   @OriginalMember(
      owner = "loginapplet!f",
      name = "u",
      descriptor = "F"
   )
   public static float field112 = 50.0F;
   @OriginalMember(
      owner = "loginapplet!f",
      name = "v",
      descriptor = "[I"
   )
   public static int[] field113;

   @OriginalMember(
      owner = "loginapplet!f",
      name = "a",
      descriptor = "(I)V",
      line = 4
   )
   public static void method76(int arg0) {
      try {
         if (arg0 != -27729) {
            field113 = (int[])null;
         }

         field111 = null;
         field113 = null;
      } catch (RuntimeException var2) {
         throw class28.method139(var2, "f.D(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!f",
      name = "a",
      descriptor = "(ZLjava/io/DataInputStream;I)V",
      line = 17
   )
   private final void method77(boolean arg0, DataInputStream arg1, int arg2) throws IOException {
      try {
         if (!arg0) {
         }

         int var4 = arg1.read();
         int var5 = arg1.readInt();
         if (arg2 != 10021) {
            field113 = (int[])null;
         }

         int var6 = var5;
         if (-1 != ~var4) {
            var5 += 4;
         }

         class13 var7 = new class13(var5 + 5);
         var7.method74(6695, var4);
         var7.method71(var6, 462177616);
         arg1.readFully(var7.field102, var7.field105, var5);
         this.method238(-126, var7.field102);

         for(int var8 = 0; var8 < super.field350; ++var8) {
            var4 = arg1.read();
            var5 = arg1.readInt();
            var6 = var5;
            if (~var4 != -1) {
               var5 += 4;
            }

            var7 = new class13(5 + var5);
            var7.method74(6695, var4);
            var7.method71(var6, 462177616);

            while(~var5 < -33554433) {
               var5 -= 33554432;
               arg1.readFully(var7.field102, var7.field105, 33554432);
               var7.field105 += 33554432;
            }

            arg1.readFully(var7.field102, var7.field105, var5);
            if (!super.field359) {
               super.field349[super.field344[var8]] = class4.method23(var7.field102, false, true);
            } else {
               super.field349[super.field344[var8]] = var7.field102;
            }
         }

      } catch (RuntimeException var9) {
         throw class28.method139(var9, "f.B(" + arg0 + ',' + (arg1 != null ? "{...}" : "null") + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!f",
      name = "<init>",
      descriptor = "([BZZ)V",
      line = 83
   )
   public class14(byte[] arg0, boolean arg1, boolean arg2) throws IOException {
      this(arg0, arg1, arg2, false);
   }

   @OriginalMember(
      owner = "loginapplet!f",
      name = "a",
      descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V",
      line = 89
   )
   public static final void method78(String arg0, Throwable arg1, int arg2) {
      try {
         try {
            String var3 = "";
            if (null != arg1) {
               var3 = class13.method58(arg1, (byte)110);
            }

            if (arg0 != null) {
               if (arg1 != null) {
                  var3 = var3 + " | ";
               }

               var3 = var3 + arg0;
            }

            System.out.println("Error: " + var3);
            var3 = var3.replace(':', '.');
            var3 = var3.replace('@', '_');
            var3 = var3.replace('&', '_');
            int var4 = -17 % ((arg2 - 40) / 32);
            var3 = var3.replace('#', '_');
            if (null == class17.field134.field272) {
               return;
            }

            class43 var5 = class17.field134.method178(new URL(class17.field134.field272.getCodeBase(), "clienterror.ws?c=" + class33.field212 + "&u=" + class33.field213 + "&v1=" + class38.field279 + "&v2=" + class38.field281 + "&e=" + var3), 2);

            while(~var5.field327 == -1) {
               class37.method177(1L, false);
            }

            if (var5.field327 == 1) {
               DataInputStream var6 = (DataInputStream)var5.field324;
               var6.read();
               var6.close();
            }
         } catch (Exception var7) {
         }

      } catch (RuntimeException var8) {
         throw var8;
      }
   }

   @OriginalMember(
      owner = "loginapplet!f",
      name = "a",
      descriptor = "([Lsa;I)Lsa;",
      line = 148
   )
   public static final class41 method79(class41[] arg0, int arg1) {
      try {
         if (arg1 != 95) {
            method76(-45);
         }

         if (arg0.length < 2) {
            throw new IllegalArgumentException();
         } else {
            return class10.method39(arg0, 0, arg0.length, -122);
         }
      } catch (RuntimeException var3) {
         throw class28.method139(var3, "f.C(" + (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!f",
      name = "<init>",
      descriptor = "([BZZZ)V",
      line = 171
   )
   private class14(byte[] arg0, boolean arg1, boolean arg2, boolean arg3) throws IOException {
      super(arg1, arg2);

      try {
         this.method77(arg3, new DataInputStream(new ByteArrayInputStream(arg0)), 10021);
      } catch (RuntimeException var6) {
         throw class28.method139(var6, "f.<init>(" + (arg0 != null ? "{...}" : "null") + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }
}
