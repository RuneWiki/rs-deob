package deob;

@ObfuscatedName("XBMRDXRN")
public class XBMRDXRN {

	@ObfuscatedName("XBMRDXRN.f")
	public int field1390 = 0;

	@ObfuscatedName("XBMRDXRN.g")
	public int field1391 = 0;

	@ObfuscatedName("XBMRDXRN.h")
	public int field1392;

	@ObfuscatedName("XBMRDXRN.i")
	public int field1393;

	@ObfuscatedName("XBMRDXRN.j")
	public int[][] field1394;

	public XBMRDXRN(int arg0, int arg1) {
		field1392 = arg1;
		field1393 = arg0;
		field1394 = new int[field1392][field1393];
		method537();
	}

	@ObfuscatedName("XBMRDXRN.a()V")
	public void method537() {
		for (int var1 = 0; var1 < field1392; var1++) {
			for (int var2 = 0; var2 < field1393; var2++) {
				if (var1 == 0 || var2 == 0 || field1392 - 1 == var1 || field1393 - 1 == var2) {
					field1394[var1][var2] = 0xFFFFFF;
				} else {
					field1394[var1][var2] = 0x1000000;
				}
			}
		}
	}

	@ObfuscatedName("XBMRDXRN.a(IZIIII)V")
	public void method538(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
		arg0 -= field1390;
		arg3 -= field1391;
		if (arg2 == 0) {
			if (arg4 == 0) {
				method541(arg0, arg3, 128);
				method541(arg0 - 1, arg3, 8);
			}

			if (arg4 == 1) {
				method541(arg0, arg3, 2);
				method541(arg0, arg3 + 1, 32);
			}

			if (arg4 == 2) {
				method541(arg0, arg3, 8);
				method541(arg0 + 1, arg3, 128);
			}

			if (arg4 == 3) {
				method541(arg0, arg3, 32);
				method541(arg0, arg3 - 1, 2);
			}
		}

		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				method541(arg0, arg3, 1);
				method541(arg0 - 1, arg3 + 1, 16);
			}

			if (arg4 == 1) {
				method541(arg0, arg3, 4);
				method541(arg0 + 1, arg3 + 1, 64);
			}

			if (arg4 == 2) {
				method541(arg0, arg3, 16);
				method541(arg0 + 1, arg3 - 1, 1);
			}

			if (arg4 == 3) {
				method541(arg0, arg3, 64);
				method541(arg0 - 1, arg3 - 1, 4);
			}
		}

		if (arg2 == 2) {
			if (arg4 == 0) {
				method541(arg0, arg3, 130);
				method541(arg0 - 1, arg3, 8);
				method541(arg0, arg3 + 1, 32);
			}

			if (arg4 == 1) {
				method541(arg0, arg3, 10);
				method541(arg0, arg3 + 1, 32);
				method541(arg0 + 1, arg3, 128);
			}

			if (arg4 == 2) {
				method541(arg0, arg3, 40);
				method541(arg0 + 1, arg3, 128);
				method541(arg0, arg3 - 1, 2);
			}

			if (arg4 == 3) {
				method541(arg0, arg3, 160);
				method541(arg0, arg3 - 1, 2);
				method541(arg0 - 1, arg3, 8);
			}
		}

		if (arg1) {
			if (arg2 == 0) {
				if (arg4 == 0) {
					method541(arg0, arg3, 0x10000);
					method541(arg0 - 1, arg3, 4096);
				}

				if (arg4 == 1) {
					method541(arg0, arg3, 1024);
					method541(arg0, arg3 + 1, 16384);
				}

				if (arg4 == 2) {
					method541(arg0, arg3, 4096);
					method541(arg0 + 1, arg3, 0x10000);
				}

				if (arg4 == 3) {
					method541(arg0, arg3, 16384);
					method541(arg0, arg3 - 1, 1024);
				}
			}

			if (arg2 == 1 || arg2 == 3) {
				if (arg4 == 0) {
					method541(arg0, arg3, 512);
					method541(arg0 - 1, arg3 + 1, 8192);
				}

				if (arg4 == 1) {
					method541(arg0, arg3, 2048);
					method541(arg0 + 1, arg3 + 1, 32768);
				}

				if (arg4 == 2) {
					method541(arg0, arg3, 8192);
					method541(arg0 + 1, arg3 - 1, 512);
				}

				if (arg4 == 3) {
					method541(arg0, arg3, 32768);
					method541(arg0 - 1, arg3 - 1, 2048);
				}
			}

			if (arg2 == 2) {
				if (arg4 == 0) {
					method541(arg0, arg3, 66560);
					method541(arg0 - 1, arg3, 4096);
					method541(arg0, arg3 + 1, 16384);
				}

				if (arg4 == 1) {
					method541(arg0, arg3, 5120);
					method541(arg0, arg3 + 1, 16384);
					method541(arg0 + 1, arg3, 0x10000);
				}

				if (arg4 == 2) {
					method541(arg0, arg3, 20480);
					method541(arg0 + 1, arg3, 0x10000);
					method541(arg0, arg3 - 1, 1024);
				}

				if (arg4 == 3) {
					method541(arg0, arg3, 81920);
					method541(arg0, arg3 - 1, 1024);
					method541(arg0 - 1, arg3, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("XBMRDXRN.a(IIIBIZI)V")
	public void method539(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
		int var7 = 256;
		if (arg4) {
			var7 += 0x20000;
		}

		arg1 -= field1390;
		arg2 -= field1391;

		if (arg0 == 1 || arg0 == 3) {
			int var8 = arg3;
			arg3 = arg5;
			arg5 = var8;
		}

		for (int var9 = arg1; var9 < arg1 + arg3; var9++) {
			if (var9 >= 0 && var9 < field1392) {
				for (int var10 = arg2; var10 < arg2 + arg5; var10++) {
					if (var10 >= 0 && var10 < field1393) {
						method541(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("XBMRDXRN.a(III)V")
	public void method540(int arg0, int arg1) {
		arg0 -= field1390;
		arg1 -= field1391;
		field1394[arg0][arg1] |= 0x200000;
	}

	@ObfuscatedName("XBMRDXRN.b(III)V")
	public void method541(int arg0, int arg1, int arg2) {
		field1394[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("XBMRDXRN.a(IIIIIZ)V")
	public void method542(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		arg3 -= field1390;
		arg0 -= field1391;
		if (arg1 == 0) {
			if (arg2 == 0) {
				method544(128, arg3, arg0);
				method544(8, arg3 - 1, arg0);
			}

			if (arg2 == 1) {
				method544(2, arg3, arg0);
				method544(32, arg3, arg0 + 1);
			}

			if (arg2 == 2) {
				method544(8, arg3, arg0);
				method544(128, arg3 + 1, arg0);
			}

			if (arg2 == 3) {
				method544(32, arg3, arg0);
				method544(2, arg3, arg0 - 1);
			}
		}

		if (arg1 == 1 || arg1 == 3) {
			if (arg2 == 0) {
				method544(1, arg3, arg0);
				method544(16, arg3 - 1, arg0 + 1);
			}

			if (arg2 == 1) {
				method544(4, arg3, arg0);
				method544(64, arg3 + 1, arg0 + 1);
			}

			if (arg2 == 2) {
				method544(16, arg3, arg0);
				method544(1, arg3 + 1, arg0 - 1);
			}

			if (arg2 == 3) {
				method544(64, arg3, arg0);
				method544(4, arg3 - 1, arg0 - 1);
			}
		}

		if (arg1 == 2) {
			if (arg2 == 0) {
				method544(130, arg3, arg0);
				method544(8, arg3 - 1, arg0);
				method544(32, arg3, arg0 + 1);
			}

			if (arg2 == 1) {
				method544(10, arg3, arg0);
				method544(32, arg3, arg0 + 1);
				method544(128, arg3 + 1, arg0);
			}

			if (arg2 == 2) {
				method544(40, arg3, arg0);
				method544(128, arg3 + 1, arg0);
				method544(2, arg3, arg0 - 1);
			}

			if (arg2 == 3) {
				method544(160, arg3, arg0);
				method544(2, arg3, arg0 - 1);
				method544(8, arg3 - 1, arg0);
			}
		}

		if (arg4) {
			if (arg1 == 0) {
				if (arg2 == 0) {
					method544(0x10000, arg3, arg0);
					method544(4096, arg3 - 1, arg0);
				}

				if (arg2 == 1) {
					method544(1024, arg3, arg0);
					method544(16384, arg3, arg0 + 1);
				}

				if (arg2 == 2) {
					method544(4096, arg3, arg0);
					method544(0x10000, arg3 + 1, arg0);
				}

				if (arg2 == 3) {
					method544(16384, arg3, arg0);
					method544(1024, arg3, arg0 - 1);
				}
			}

			if (arg1 == 1 || arg1 == 3) {
				if (arg2 == 0) {
					method544(512, arg3, arg0);
					method544(8192, arg3 - 1, arg0 + 1);
				}

				if (arg2 == 1) {
					method544(2048, arg3, arg0);
					method544(32768, arg3 + 1, arg0 + 1);
				}

				if (arg2 == 2) {
					method544(8192, arg3, arg0);
					method544(512, arg3 + 1, arg0 - 1);
				}

				if (arg2 == 3) {
					method544(32768, arg3, arg0);
					method544(2048, arg3 - 1, arg0 - 1);
				}
			}

			if (arg1 == 2) {
				if (arg2 == 0) {
					method544(66560, arg3, arg0);
					method544(4096, arg3 - 1, arg0);
					method544(16384, arg3, arg0 + 1);
				}

				if (arg2 == 1) {
					method544(5120, arg3, arg0);
					method544(16384, arg3, arg0 + 1);
					method544(0x10000, arg3 + 1, arg0);
				}

				if (arg2 == 2) {
					method544(20480, arg3, arg0);
					method544(0x10000, arg3 + 1, arg0);
					method544(1024, arg3, arg0 - 1);
				}

				if (arg2 == 3) {
					method544(81920, arg3, arg0);
					method544(1024, arg3, arg0 - 1);
					method544(4096, arg3 - 1, arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("XBMRDXRN.a(IIIZIZI)V")
	public void method543(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg3) {
			var7 += 0x20000;
		}

		arg0 -= field1390;
		arg1 -= field1391;

		if (arg2 == 1 || arg2 == 3) {
			int var8 = arg5;
			arg5 = arg4;
			arg4 = var8;
		}

		for (int var9 = arg0; var9 < arg0 + arg5; var9++) {
			if (var9 >= 0 && var9 < field1392) {
				for (int var10 = arg1; var10 < arg1 + arg4; var10++) {
					if (var10 >= 0 && var10 < field1393) {
						method544(var7, var9, var10);
					}
				}
			}
		}
	}

	@ObfuscatedName("XBMRDXRN.a(IIII)V")
	public void method544(int arg0, int arg1, int arg2) {
		field1394[arg1][arg2] &= 0xFFFFFF - arg0;
	}

	@ObfuscatedName("XBMRDXRN.c(III)V")
	public void method545(int arg0, int arg1) {
		arg1 -= field1390;
		arg0 -= field1391;
		field1394[arg1][arg0] &= 0xDFFFFF;
	}

	@ObfuscatedName("XBMRDXRN.a(IIIIZII)Z")
	public boolean method546(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 == arg4 && arg3 == arg5) {
			return true;
		}

		arg1 -= field1390;
		arg5 -= field1391;
		arg4 -= field1390;
		arg3 -= field1391;
		if (arg0 == 0) {
			if (arg2 == 0) {
				if (arg4 - 1 == arg1 && arg3 == arg5) {
					return true;
				}

				if (arg1 == arg4 && arg3 + 1 == arg5 && (field1394[arg1][arg5] & 0x1280120) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg3 - 1 == arg5 && (field1394[arg1][arg5] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (arg1 == arg4 && arg3 + 1 == arg5) {
					return true;
				}

				if (arg4 - 1 == arg1 && arg3 == arg5 && (field1394[arg1][arg5] & 0x1280108) == 0) {
					return true;
				}

				if (arg4 + 1 == arg1 && arg3 == arg5 && (field1394[arg1][arg5] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (arg4 + 1 == arg1 && arg3 == arg5) {
					return true;
				}

				if (arg1 == arg4 && arg3 + 1 == arg5 && (field1394[arg1][arg5] & 0x1280120) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg3 - 1 == arg5 && (field1394[arg1][arg5] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 3) {
				if (arg1 == arg4 && arg3 - 1 == arg5) {
					return true;
				}

				if (arg4 - 1 == arg1 && arg3 == arg5 && (field1394[arg1][arg5] & 0x1280108) == 0) {
					return true;
				}

				if (arg4 + 1 == arg1 && arg3 == arg5 && (field1394[arg1][arg5] & 0x1280180) == 0) {
					return true;
				}
			}
		}

		if (arg0 == 2) {
			if (arg2 == 0) {
				if (arg4 - 1 == arg1 && arg3 == arg5) {
					return true;
				}

				if (arg1 == arg4 && arg3 + 1 == arg5) {
					return true;
				}

				if (arg4 + 1 == arg1 && arg3 == arg5 && (field1394[arg1][arg5] & 0x1280180) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg3 - 1 == arg5 && (field1394[arg1][arg5] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (arg4 - 1 == arg1 && arg3 == arg5 && (field1394[arg1][arg5] & 0x1280108) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg3 + 1 == arg5) {
					return true;
				}

				if (arg4 + 1 == arg1 && arg3 == arg5) {
					return true;
				}

				if (arg1 == arg4 && arg3 - 1 == arg5 && (field1394[arg1][arg5] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (arg4 - 1 == arg1 && arg3 == arg5 && (field1394[arg1][arg5] & 0x1280108) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg3 + 1 == arg5 && (field1394[arg1][arg5] & 0x1280120) == 0) {
					return true;
				}

				if (arg4 + 1 == arg1 && arg3 == arg5) {
					return true;
				}

				if (arg1 == arg4 && arg3 - 1 == arg5) {
					return true;
				}
			} else if (arg2 == 3) {
				if (arg4 - 1 == arg1 && arg3 == arg5) {
					return true;
				}

				if (arg1 == arg4 && arg3 + 1 == arg5 && (field1394[arg1][arg5] & 0x1280120) == 0) {
					return true;
				}

				if (arg4 + 1 == arg1 && arg3 == arg5 && (field1394[arg1][arg5] & 0x1280180) == 0) {
					return true;
				}

				if (arg1 == arg4 && arg3 - 1 == arg5) {
					return true;
				}
			}
		}

		if (arg0 == 9) {
			if (arg1 == arg4 && arg3 + 1 == arg5 && (field1394[arg1][arg5] & 0x20) == 0) {
				return true;
			}

			if (arg1 == arg4 && arg3 - 1 == arg5 && (field1394[arg1][arg5] & 0x2) == 0) {
				return true;
			}

			if (arg4 - 1 == arg1 && arg3 == arg5 && (field1394[arg1][arg5] & 0x8) == 0) {
				return true;
			}

			if (arg4 + 1 == arg1 && arg3 == arg5 && (field1394[arg1][arg5] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("XBMRDXRN.a(IIIIIII)Z")
	public boolean method547(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg2 == arg5 && arg1 == arg4) {
			return true;
		}

		arg2 -= field1390;
		arg4 -= field1391;
		arg5 -= field1390;
		arg1 -= field1391;
		if (arg3 == 6 || arg3 == 7) {
			if (arg3 == 7) {
				arg0 = arg0 + 2 & 0x3;
			}

			if (arg0 == 0) {
				if (arg5 + 1 == arg2 && arg1 == arg4 && (field1394[arg2][arg4] & 0x80) == 0) {
					return true;
				}

				if (arg2 == arg5 && arg1 - 1 == arg4 && (field1394[arg2][arg4] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (arg5 - 1 == arg2 && arg1 == arg4 && (field1394[arg2][arg4] & 0x8) == 0) {
					return true;
				}

				if (arg2 == arg5 && arg1 - 1 == arg4 && (field1394[arg2][arg4] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (arg5 - 1 == arg2 && arg1 == arg4 && (field1394[arg2][arg4] & 0x8) == 0) {
					return true;
				}

				if (arg2 == arg5 && arg1 + 1 == arg4 && (field1394[arg2][arg4] & 0x20) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (arg5 + 1 == arg2 && arg1 == arg4 && (field1394[arg2][arg4] & 0x80) == 0) {
					return true;
				}

				if (arg2 == arg5 && arg1 + 1 == arg4 && (field1394[arg2][arg4] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg3 == 8) {
			if (arg2 == arg5 && arg1 + 1 == arg4 && (field1394[arg2][arg4] & 0x20) == 0) {
				return true;
			}

			if (arg2 == arg5 && arg1 - 1 == arg4 && (field1394[arg2][arg4] & 0x2) == 0) {
				return true;
			}

			if (arg5 - 1 == arg2 && arg1 == arg4 && (field1394[arg2][arg4] & 0x8) == 0) {
				return true;
			}

			if (arg5 + 1 == arg2 && arg1 == arg4 && (field1394[arg2][arg4] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("XBMRDXRN.a(IIIIIIII)Z")
	public boolean method548(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg0 + arg6 - 1;
		int var9 = arg2 + arg3 - 1;
		if (arg5 >= arg6 && arg5 <= var8 && arg4 >= arg3 && arg4 <= var9) {
			return true;
		}

		if (arg6 - 1 == arg5 && arg4 >= arg3 && arg4 <= var9 && (field1394[arg5 - field1390][arg4 - field1391] & 0x8) == 0 && (arg1 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg5 && arg4 >= arg3 && arg4 <= var9 && (field1394[arg5 - field1390][arg4 - field1391] & 0x80) == 0 && (arg1 & 0x2) == 0) {
			return true;
		}

		if (arg3 - 1 == arg4 && arg5 >= arg6 && arg5 <= var8 && (field1394[arg5 - field1390][arg4 - field1391] & 0x2) == 0 && (arg1 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg4 && arg5 >= arg6 && arg5 <= var8 && (field1394[arg5 - field1390][arg4 - field1391] & 0x20) == 0 && (arg1 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
