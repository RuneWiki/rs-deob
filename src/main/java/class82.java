import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.Transferable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public class class82 implements Runnable {
   @OriginalMember(
      owner = "client!fea",
      name = "F",
      descriptor = "Lnea;"
   )
   public class610 field1267 = null;
   @OriginalMember(
      owner = "client!fea",
      name = "D",
      descriptor = "Lnea;"
   )
   public class610 field1283 = null;
   @OriginalMember(
      owner = "client!fea",
      name = "k",
      descriptor = "Ldu;"
   )
   private class92 field1265 = null;
   @OriginalMember(
      owner = "client!fea",
      name = "f",
      descriptor = "Z"
   )
   private boolean field1282 = false;
   @OriginalMember(
      owner = "client!fea",
      name = "z",
      descriptor = "Z"
   )
   public boolean field1275 = false;
   @OriginalMember(
      owner = "client!fea",
      name = "u",
      descriptor = "Ldu;"
   )
   private class92 field1280 = null;
   @OriginalMember(
      owner = "client!fea",
      name = "n",
      descriptor = "Z"
   )
   public boolean field1291 = false;
   @OriginalMember(
      owner = "client!fea",
      name = "j",
      descriptor = "Lnea;"
   )
   public class610 field1287 = null;
   @OriginalMember(
      owner = "client!fea",
      name = "m",
      descriptor = "Ljava/awt/EventQueue;"
   )
   public EventQueue field1264;
   @OriginalMember(
      owner = "client!fea",
      name = "q",
      descriptor = "[Lnea;"
   )
   public class610[] field1277;
   @OriginalMember(
      owner = "client!fea",
      name = "E",
      descriptor = "Ljava/lang/Object;"
   )
   private Object field1272;
   @OriginalMember(
      owner = "client!fea",
      name = "g",
      descriptor = "Lte;"
   )
   private class281 field1289;
   @OriginalMember(
      owner = "client!fea",
      name = "s",
      descriptor = "Ljava/lang/Object;"
   )
   private Object field1268;
   @OriginalMember(
      owner = "client!fea",
      name = "i",
      descriptor = "Ljava/lang/Object;"
   )
   private Object field1279;
   @OriginalMember(
      owner = "client!fea",
      name = "o",
      descriptor = "Lkl;"
   )
   private class740 field1274;
   @OriginalMember(
      owner = "client!fea",
      name = "A",
      descriptor = "Ljava/lang/Thread;"
   )
   private Thread field1288;
   @OriginalMember(
      owner = "client!fea",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1296 = new String[]{method887(method886("Km8")), method887(method886("Yj\"0Z")), method887(method886("_i2u\u0007_$%!INpvwB\u001e$t")), method887(method886("Ol9\"KIv%:Z")), method887(method886("Qk 0ESq%0")), method887(method886("gM")), method887(method886("Pm%!ES`3&")), method887(method886("]f51MZc><BWh;;GLu$&\\Ir!-QFE\u0014\u0016lyB\u0011\u001davO\u001a\u0018fsT\u0007\u0007{hQ\u0000\u0002pe^fd\u001a\u000f0cc\u001f\u0004=is\u0015\u0010*s~\u0005c'lz\u0002")), method887(method886("Tp\"%\u0012\u0013+")), method887(method886("Y|?!")), method887(method886("Ve 4\u0006]s\"{kSi&:FYj\"")), method887(method886("Kc")), method887(method886("Ve 4\u0006]s\"{nNe;0")), method887(method886("Oa\"6]Op98KIv%:Z")), method887(method886("ve10P\u001cB#9D\u001cW5'MYj")), method887(method886("Hg7")), method887(method886("Ve 4\u0006]s\"{xSm8!")), method887(method886("Tp\"%[\u0006+y")), method887(method886("Swx;IQa")), method887(method886("Ve 4\u0006Ja81GN")), method887(method886("Qe?;wZm:0w_e5=M\u0012m2-\u001a\t1")), method887(method886("Swx4Z_l")), method887(method886("Qm5'GOk0!")), method887(method886("Ne81GQ*24\\")), method887(method886("B+")), method887(method886("\r*g")), method887(method886("Qe?;wZm:0w_e5=M\u0012`7!\u001a")), method887(method886("Swx#MNw?:F")), method887(method886("Ve 4\u0006]s\"{kSj\"4ARa$")), method887(method886("Qm7")), method887(method886("Qe?;wZm:0w_e5=M\u0012m2-")), method887(method886("}S\u0002")), method887(method886("Oa\"\u0013G_q%\u0016Q_h3\u0007GSp")), method887(method886("Ve 4\u0006Ja$&ASj")), method887(method886("ij=;GKj")), method887(method886("Oa\"\u0013G_q%\u0001Z]r3'[]h\u001d0QOA84JPa2")), method887(method886("Ns")), method887(method886("Iw3'\u0006Tk;0")), method887(method886("\u0013v%6I_l3z")), method887(method886("_>y\"ARj\"z")), method887(method886("_>y\"AR`9\"[\u0013")), method887(method886("_>y'[_e5=M\u0013")), method887(method886("_>y")), method887(method886("\u0012`7!")), method887(method886("cv5{L]p")), method887(method886("Ve10Pc")), method887(method886("ct$0NYv3;KYw")), method887(method886("\u0013p;%\u0007")), method887(method886("cs?%\u0006Xe\""))};
   @OriginalMember(
      owner = "client!fea",
      name = "b",
      descriptor = "J"
   )
   private static volatile long field1276 = 0L;
   @OriginalMember(
      owner = "client!fea",
      name = "t",
      descriptor = "I"
   )
   private static int field1285;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!fea",
      name = "C",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field1292;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!fea",
      name = "v",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field1293;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!fea",
      name = "h",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field1294;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!fea",
      name = "r",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field1295;
   @OriginalMember(
      owner = "client!fea",
      name = "c",
      descriptor = "Ljava/lang/String;"
   )
   public static String field1266;
   @OriginalMember(
      owner = "client!fea",
      name = "e",
      descriptor = "Ljava/lang/String;"
   )
   private static String field1269;
   @OriginalMember(
      owner = "client!fea",
      name = "d",
      descriptor = "Ljava/lang/String;"
   )
   private static String field1270;
   @OriginalMember(
      owner = "client!fea",
      name = "p",
      descriptor = "Ljava/lang/String;"
   )
   public static String field1271;
   @OriginalMember(
      owner = "client!fea",
      name = "l",
      descriptor = "Ljava/lang/String;"
   )
   private static String field1278;
   @OriginalMember(
      owner = "client!fea",
      name = "B",
      descriptor = "Ljava/lang/String;"
   )
   public static String field1281;
   @OriginalMember(
      owner = "client!fea",
      name = "x",
      descriptor = "Ljava/lang/String;"
   )
   public static String field1284;
   @OriginalMember(
      owner = "client!fea",
      name = "w",
      descriptor = "Ljava/lang/String;"
   )
   public static String field1290;
   @OriginalMember(
      owner = "client!fea",
      name = "y",
      descriptor = "Ljava/lang/reflect/Method;"
   )
   public static Method field1273;
   @OriginalMember(
      owner = "client!fea",
      name = "a",
      descriptor = "Ljava/lang/reflect/Method;"
   )
   public static Method field1286;

   @OriginalMember(
      owner = "client!fea",
      name = "a",
      descriptor = "(ILjava/net/URL;)Ldu;"
   )
   public final class92 method865(int arg0, URL arg1) {
      if (arg0 != 0) {
         this.method878(false, -121, -55, -27, 37);
      }

      return this.method884(0, 4, 0, (byte)91, arg1);
   }

   @OriginalMember(
      owner = "client!fea",
      name = "a",
      descriptor = "(Ljava/lang/String;I)Lnea;"
   )
   public static final class610 method866(String arg0, int arg1) {
      if (arg1 != 1) {
         method882((String)null, -48, (String)null, 100);
      }

      return method882(field1269, field1285, arg0, -98);
   }

   @OriginalMember(
      owner = "client!fea",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method867(boolean arg0) {
      if (arg0) {
         return true;
      } else if (!this.field1275) {
         return false;
      } else if (this.field1291) {
         return this.field1289 != null;
      } else {
         return this.field1268 != null;
      }
   }

   @OriginalMember(
      owner = "client!fea",
      name = "a",
      descriptor = "(B)Ldu;"
   )
   public final class92 method868(byte arg0) {
      if (arg0 != -127) {
         this.field1287 = null;
      }

      return this.method884(0, 5, 0, (byte)64, (Object)null);
   }

   @OriginalMember(
      owner = "client!fea",
      name = "a",
      descriptor = "([Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;I)Ldu;"
   )
   public final class92 method869(Class[] arg0, Class arg1, String arg2, int arg3) {
      if (arg3 != -1429292976) {
         this.field1275 = false;
      }

      return this.method884(0, 8, 0, (byte)72, new Object[]{arg1, arg2, arg0});
   }

   @OriginalMember(
      owner = "client!fea",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method870(byte arg0) {
      if (arg0 < -25) {
         field1276 = class604.method4452(118) - -5000L;
      }
   }

   @OriginalMember(
      owner = "client!fea",
      name = "a",
      descriptor = "(I)Ljava/lang/Object;"
   )
   public final Object method871(int arg0) {
      if (arg0 != 0) {
         this.method874((byte)-9);
      }

      return this.field1272;
   }

   @OriginalMember(
      owner = "client!fea",
      name = "a",
      descriptor = "(Ljava/lang/String;Z)Ldu;"
   )
   public final class92 method872(String arg0, boolean arg1) {
      if (arg1) {
         this.method869((Class[])null, (Class)null, (String)null, 8);
      }

      return this.method884(0, 16, 0, (byte)108, arg0);
   }

   @OriginalMember(
      owner = "client!fea",
      name = "a",
      descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Ldu;"
   )
   public final class92 method873(String arg0, int arg1, Class arg2) {
      if (arg1 != 2) {
         field1290 = null;
      }

      return this.method884(0, 9, 0, (byte)109, new Object[]{arg2, arg0});
   }

   @OriginalMember(
      owner = "client!fea",
      name = "c",
      descriptor = "(B)V"
   )
   public final void method874(byte arg0) {
      synchronized(this) {
         this.field1282 = true;
         this.notifyAll();
      }

      try {
         this.field1288.join();
      } catch (InterruptedException var8) {
      }

      if (this.field1267 != null) {
         try {
            this.field1267.method4494((byte)88);
         } catch (IOException var7) {
         }
      }

      if (this.field1287 != null) {
         try {
            this.field1287.method4494((byte)112);
         } catch (IOException var6) {
         }
      }

      if (this.field1277 != null) {
         for(int var3 = 0; this.field1277.length > var3; ++var3) {
            if (this.field1277[var3] != null) {
               try {
                  this.field1277[var3].method4494((byte)121);
               } catch (IOException var5) {
               }
            }
         }
      }

      if (this.field1283 != null) {
         try {
            this.field1283.method4494((byte)79);
         } catch (IOException var4) {
         }
      }

      if (arg0 != -123) {
         this.field1289 = null;
      }
   }

   @OriginalMember(
      owner = "client!fea",
      name = "a",
      descriptor = "(ZILjava/lang/String;B)Ldu;"
   )
   public final class92 method875(boolean arg0, int arg1, String arg2, byte arg3) {
      int var5 = 124 % ((72 - arg3) / 43);
      return this.method884(arg1, arg0 ? 22 : 1, 0, (byte)123, arg2);
   }

   @OriginalMember(
      owner = "client!fea",
      name = "a",
      descriptor = "(I[BLjava/io/File;)Z"
   )
   public final boolean method876(int arg0, byte[] arg1, File arg2) {
      try {
         FileOutputStream var4 = new FileOutputStream(arg2);
         var4.write(arg1, arg0, arg1.length);
         var4.close();
         return true;
      } catch (IOException var5) {
         throw new RuntimeException();
      }
   }

   @OriginalMember(
      owner = "client!fea",
      name = "a",
      descriptor = "(ZILjava/lang/String;)Ldu;"
   )
   public final class92 method877(boolean arg0, int arg1, String arg2) {
      if (arg1 <= 84) {
         return null;
      } else {
         return arg0 ? this.method884(0, 12, 0, (byte)120, arg2) : this.method884(0, 13, 0, (byte)120, arg2);
      }
   }

   @OriginalMember(
      owner = "client!fea",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      while(true) {
         class92 var2;
         synchronized(this) {
            while(true) {
               if (this.field1282) {
                  return;
               }

               if (this.field1280 != null) {
                  var2 = this.field1280;
                  this.field1280 = this.field1280.field1522;
                  if (this.field1280 == null) {
                     this.field1265 = null;
                  }
                  break;
               }

               try {
                  this.wait();
               } catch (InterruptedException var30) {
               }
            }
         }

         try {
            int var3 = var2.field1521;
            if (var3 == 1) {
               if (field1276 > class604.method4452(-106)) {
                  throw new IOException();
               }

               var2.field1525 = new Socket(InetAddress.getByName((String)var2.field1524), var2.field1520);
            } else if (var3 != 22) {
               if (var3 == 2) {
                  Thread var22 = new Thread((Runnable)var2.field1524);
                  var22.setDaemon(true);
                  var22.start();
                  var22.setPriority(var2.field1520);
                  var2.field1525 = var22;
               } else if (~var3 != -5) {
                  if (~var3 == -9) {
                     Object[] var21 = (Object[])var2.field1524;
                     if (this.field1275 && ((Class)var21[0]).getClassLoader() == null) {
                        throw new SecurityException();
                     }

                     var2.field1525 = ((Class)var21[0]).getDeclaredMethod((String)var21[1], (Class[])var21[2]);
                  } else if (~var3 != -10) {
                     if (var3 == 18) {
                        Clipboard var19 = Toolkit.getDefaultToolkit().getSystemClipboard();
                        var2.field1525 = var19.getContents((Object)null);
                     } else if (var3 == 19) {
                        Transferable var4 = (Transferable)var2.field1524;
                        Clipboard var5 = Toolkit.getDefaultToolkit().getSystemClipboard();
                        var5.setContents(var4, (ClipboardOwner)null);
                     } else {
                        if (!this.field1275) {
                           throw new Exception("");
                        }

                        if (~var3 != -4) {
                           if (var3 == 21) {
                              if (class604.method4452(-125) < field1276) {
                                 throw new IOException();
                              }

                              var2.field1525 = InetAddress.getByName((String)var2.field1524).getAddress();
                           } else if (var3 == 5) {
                              if (!this.field1291) {
                                 var2.field1525 = Class.forName(field1296[15]).getMethod(field1296[6]).invoke(this.field1268);
                              } else {
                                 var2.field1525 = this.field1289.method2354(0);
                              }
                           } else if (var3 == 6) {
                              Frame var17 = new Frame(field1296[14]);
                              var2.field1525 = var17;
                              var17.setResizable(false);
                              if (this.field1291) {
                                 this.field1289.method2356(var17, var2.field1523 >> 16, (byte)-115, var2.field1520 >>> 16, 65535 & var2.field1523, 65535 & var2.field1520);
                              } else {
                                 Class.forName(field1296[15]).getMethod(field1296[1], field1295 != null ? field1295 : (field1295 = method885(field1296[12])), Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(this.field1268, var17, new Integer(var2.field1520 >>> 16), new Integer(var2.field1520 & 65535), new Integer(var2.field1523 >> 16), new Integer(var2.field1523 & 65535));
                              }
                           } else if (~var3 != -8) {
                              if (var3 == 12) {
                                 class610 var16 = method882(field1269, field1285, (String)var2.field1524, -96);
                                 var2.field1525 = var16;
                              } else if (~var3 != -14) {
                                 if (this.field1275 && var3 == 14) {
                                    int var6 = var2.field1520;
                                    int var7 = var2.field1523;
                                    if (this.field1291) {
                                       this.field1274.method5346(var6, var7, true);
                                    } else {
                                       Class.forName(field1296[11]).getDeclaredMethod(field1296[4], Integer.TYPE, Integer.TYPE).invoke(this.field1279, new Integer(var6), new Integer(var7));
                                    }
                                 } else if (this.field1275 && var3 == 15) {
                                    boolean var13 = var2.field1520 != 0;
                                    Component var14 = (Component)var2.field1524;
                                    if (this.field1291) {
                                       this.field1274.method5345(var14, var13, false);
                                    } else {
                                       Class.forName(field1296[11]).getDeclaredMethod(field1296[3], field1292 != null ? field1292 : (field1292 = method885(field1296[10])), Boolean.TYPE).invoke(this.field1279, var14, new Boolean(var13));
                                    }
                                 } else if (!this.field1291 && ~var3 == -18) {
                                    Object[] var8 = (Object[])var2.field1524;
                                    Class.forName(field1296[11]).getDeclaredMethod(field1296[13], field1292 != null ? field1292 : (field1292 = method885(field1296[10])), field1293 != null ? field1293 : (field1293 = method885(field1296[5])), Integer.TYPE, Integer.TYPE, field1294 != null ? field1294 : (field1294 = method885(field1296[16]))).invoke(this.field1279, (Component)var8[0], (int[])var8[1], new Integer(var2.field1520), new Integer(var2.field1523), (Point)var8[2]);
                                 } else {
                                    if (~var3 != -17) {
                                       throw new Exception("");
                                    }

                                    try {
                                       if (!field1290.startsWith(field1296[0])) {
                                          throw new Exception();
                                       }

                                       String var9 = (String)var2.field1524;
                                       if (!var9.startsWith(field1296[8]) && !var9.startsWith(field1296[17])) {
                                          throw new Exception();
                                       }

                                       String var10 = field1296[7];

                                       for(int var11 = 0; var9.length() > var11; ++var11) {
                                          if (var10.indexOf(var9.charAt(var11)) == -1) {
                                             throw new Exception();
                                          }
                                       }

                                       Runtime.getRuntime().exec(field1296[2] + var9 + "\"");
                                       var2.field1525 = null;
                                    } catch (Exception var31) {
                                       var2.field1525 = var31;
                                       throw var31;
                                    }
                                 }
                              } else {
                                 class610 var15 = method882("", field1285, (String)var2.field1524, -103);
                                 var2.field1525 = var15;
                              }
                           } else if (this.field1291) {
                              this.field1289.method2355((Frame)var2.field1524, -128);
                           } else {
                              Class.forName(field1296[15]).getMethod(field1296[9]).invoke(this.field1268);
                           }
                        } else {
                           if (~class604.method4452(-113) > ~field1276) {
                              throw new IOException();
                           }

                           String var18 = (var2.field1520 >> 24 & 255) + "." + ((var2.field1520 & 16712952) >> 16) + "." + (var2.field1520 >> 8 & 255) + "." + (255 & var2.field1520);
                           var2.field1525 = InetAddress.getByName(var18).getHostName();
                        }
                     }
                  } else {
                     Object[] var20 = (Object[])var2.field1524;
                     if (this.field1275 && ((Class)var20[0]).getClassLoader() == null) {
                        throw new SecurityException();
                     }

                     var2.field1525 = ((Class)var20[0]).getDeclaredField((String)var20[1]);
                  }
               } else {
                  if (~class604.method4452(87) > ~field1276) {
                     throw new IOException();
                  }

                  var2.field1525 = new DataInputStream(((URL)var2.field1524).openStream());
               }
            } else {
               if (~class604.method4452(46) > ~field1276) {
                  throw new IOException();
               }

               try {
                  var2.field1525 = class192.method1697(var2.field1520, (String)var2.field1524, (byte)96).method485((byte)120);
               } catch (class710 var29) {
                  var2.field1525 = var29.getMessage();
                  throw var29;
               }
            }

            var2.field1526 = 1;
         } catch (ThreadDeath var32) {
            throw var32;
         } catch (Throwable var33) {
            var2.field1526 = 2;
         }

         synchronized(var2) {
            var2.notify();
         }
      }
   }

   @OriginalMember(
      owner = "client!fea",
      name = "a",
      descriptor = "(ZIIII)Ldu;"
   )
   public final class92 method878(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
      return arg0 ? null : this.method884((arg4 << 16) + arg1, 6, (arg3 << 16) + arg2, (byte)122, (Object)null);
   }

   @OriginalMember(
      owner = "client!fea",
      name = "a",
      descriptor = "(IB)Ldu;"
   )
   public final class92 method879(int arg0, byte arg1) {
      return arg1 > -72 ? null : this.method884(arg0, 3, 0, (byte)69, (Object)null);
   }

   @OriginalMember(
      owner = "client!fea",
      name = "a",
      descriptor = "(BLjava/awt/Frame;)Ldu;"
   )
   public final class92 method880(byte arg0, Frame arg1) {
      return arg0 <= 59 ? null : this.method884(0, 7, 0, (byte)85, arg1);
   }

   @OriginalMember(
      owner = "client!fea",
      name = "a",
      descriptor = "([IBLjava/awt/Point;IILjava/awt/Component;)Ldu;"
   )
   public final class92 method881(int[] arg0, byte arg1, Point arg2, int arg3, int arg4, Component arg5) {
      return arg1 >= -17 ? null : this.method884(arg3, 17, arg4, (byte)89, new Object[]{arg5, arg0, arg2});
   }

   @OriginalMember(
      owner = "client!fea",
      name = "a",
      descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Lnea;"
   )
   private static final class610 method882(String arg0, int arg1, String arg2, int arg3) {
      String var4;
      if (arg1 == 33) {
         var4 = field1296[45] + arg0 + field1296[46] + arg2 + field1296[44];
      } else if (~arg1 == -35) {
         var4 = field1296[45] + arg0 + field1296[46] + arg2 + field1296[48];
      } else {
         var4 = field1296[45] + arg0 + field1296[46] + arg2 + field1296[43];
      }

      String[] var5 = new String[]{field1296[41], field1296[38], field1278, field1296[40], field1296[39], field1296[42], field1296[47], ""};
      if (arg3 > -88) {
         return null;
      } else {
         for(int var6 = 0; var5.length > var6; ++var6) {
            String var7 = var5[var6];
            if (var7.length() <= 0 || (new File(var7)).exists()) {
               try {
                  return new class610(new File(var7, var4), field1296[36], 10000L);
               } catch (Exception var9) {
               }
            }
         }

         return null;
      }
   }

   @OriginalMember(
      owner = "client!fea",
      name = "a",
      descriptor = "(ILjava/lang/Runnable;I)Ldu;"
   )
   public final class92 method883(int arg0, Runnable arg1, int arg2) {
      return arg2 != -5 ? null : this.method884(arg0, 2, 0, (byte)83, arg1);
   }

   @OriginalMember(
      owner = "client!fea",
      name = "a",
      descriptor = "(IIIBLjava/lang/Object;)Ldu;"
   )
   private final class92 method884(int arg0, int arg1, int arg2, byte arg3, Object arg4) {
      if (arg3 < 62) {
         this.field1272 = null;
      }

      class92 var6 = new class92();
      var6.field1523 = arg2;
      var6.field1520 = arg0;
      var6.field1521 = arg1;
      var6.field1524 = arg4;
      synchronized(this) {
         if (this.field1265 != null) {
            this.field1265.field1522 = var6;
            this.field1265 = var6;
         } else {
            this.field1265 = this.field1280 = var6;
         }

         this.notify();
         return var6;
      }
   }

   @OriginalMember(
      owner = "client!fea",
      name = "<init>",
      descriptor = "(ILjava/lang/String;IZ)V"
   )
   public class82(int arg0, String arg1, int arg2, boolean arg3) throws Exception {
      field1284 = field1296[34];
      this.field1275 = arg3;
      field1285 = arg0;
      field1269 = arg1;
      field1266 = field1296[25];

      try {
         field1284 = System.getProperty(field1296[19]);
         field1266 = System.getProperty(field1296[33]);
      } catch (Exception var20) {
      }

      if (~field1284.toLowerCase().indexOf(field1296[22]) != 0) {
         this.field1291 = true;
      }

      try {
         field1270 = System.getProperty(field1296[18]);
      } catch (Exception var19) {
         field1270 = field1296[34];
      }

      field1290 = field1270.toLowerCase();

      try {
         field1271 = System.getProperty(field1296[21]).toLowerCase();
      } catch (Exception var18) {
         field1271 = "";
      }

      try {
         field1281 = System.getProperty(field1296[27]).toLowerCase();
      } catch (Exception var17) {
         field1281 = "";
      }

      try {
         field1278 = System.getProperty(field1296[37]);
         if (field1278 != null) {
            field1278 = field1278 + "/";
         }
      } catch (Exception var16) {
      }

      if (field1278 == null) {
         field1278 = field1296[24];
      }

      try {
         this.field1264 = Toolkit.getDefaultToolkit().getSystemEventQueue();
      } catch (Throwable var15) {
      }

      if (!this.field1291) {
         try {
            field1273 = Class.forName(field1296[10]).getDeclaredMethod(field1296[35], Boolean.TYPE);
         } catch (Exception var14) {
         }

         try {
            field1286 = Class.forName(field1296[28]).getDeclaredMethod(field1296[32], Boolean.TYPE);
         } catch (Exception var13) {
         }
      }

      class149.method1454(0, field1269, field1285);
      if (this.field1275) {
         this.field1283 = new class610(class149.method1453((String)null, field1285, field1296[23], (byte)-92), field1296[36], 25L);
         this.field1267 = new class610(class149.method1452((byte)63, field1296[26]), field1296[36], 314572800L);
         this.field1287 = new class610(class149.method1452((byte)113, field1296[20]), field1296[36], 1048576L);
         this.field1277 = new class610[arg2];

         for(int var5 = 0; arg2 > var5; ++var5) {
            this.field1277[var5] = new class610(class149.method1452((byte)50, field1296[30] + var5), field1296[36], 1048576L);
         }

         if (this.field1291) {
            try {
               this.field1272 = Class.forName(field1296[29]).newInstance();
            } catch (Throwable var12) {
            }
         }

         try {
            if (this.field1291) {
               this.field1289 = new class281();
            } else {
               this.field1268 = Class.forName(field1296[15]).newInstance();
            }
         } catch (Throwable var11) {
         }

         try {
            if (!this.field1291) {
               this.field1279 = Class.forName(field1296[11]).newInstance();
            } else {
               this.field1274 = new class740();
            }
         } catch (Throwable var10) {
         }
      }

      if (this.field1275 && !this.field1291) {
         ThreadGroup var6 = Thread.currentThread().getThreadGroup();

         for(ThreadGroup var7 = var6.getParent(); var7 != null; var7 = var7.getParent()) {
            var6 = var7;
         }

         Thread[] var8 = new Thread[1000];
         var6.enumerate(var8);

         for(int var9 = 0; ~var9 > ~var8.length; ++var9) {
            if (var8[var9] != null && var8[var9].getName().startsWith(field1296[31])) {
               var8[var9].setPriority(1);
            }
         }
      }

      this.field1282 = false;
      this.field1288 = new Thread(this);
      this.field1288.setPriority(10);
      this.field1288.setDaemon(true);
      this.field1288.start();
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!fea",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method885(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!fea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method886(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 40);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method887(char[] arg0) {
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
            var10005 = 4;
            break;
         case 2:
            var10005 = 86;
            break;
         case 3:
            var10005 = 85;
            break;
         default:
            var10005 = 40;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
