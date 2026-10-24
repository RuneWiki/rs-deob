package deob;

@ObfuscatedName("MPYOQJPZ")
public class MPYOQJPZ {

	@ObfuscatedName("MPYOQJPZ.e")
	public int field791 = 0;

	@ObfuscatedName("MPYOQJPZ.f")
	public int field792 = 0;

	@ObfuscatedName("MPYOQJPZ.g")
	public int field793;

	@ObfuscatedName("MPYOQJPZ.h")
	public int field794;

	@ObfuscatedName("MPYOQJPZ.i")
	public int[][] field795;

	public MPYOQJPZ(int arg0, int arg1) {
		field793 = arg0;
		field794 = arg1;
		field795 = new int[field793][field794];
		method301();
	}

	@ObfuscatedName("MPYOQJPZ.a()V")
	public void method301() {
		for (int var1 = 0; var1 < field793; var1++) {
			for (int var2 = 0; var2 < field794; var2++) {
				if (var1 == 0 || var2 == 0 || field793 - 1 == var1 || field794 - 1 == var2) {
					field795[var1][var2] = 0xFFFFFF;
				} else {
					field795[var1][var2] = 0x1000000;
				}
			}
		}
	}

	@ObfuscatedName("MPYOQJPZ.a(ZIIZII)V")
	public void method302(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
		arg3 -= field791;
		arg1 -= field792;
		if (arg0 == 0) {
			if (arg4 == 0) {
				method305(arg3, arg1, 128);
				method305(arg3 - 1, arg1, 8);
			}

			if (arg4 == 1) {
				method305(arg3, arg1, 2);
				method305(arg3, arg1 + 1, 32);
			}

			if (arg4 == 2) {
				method305(arg3, arg1, 8);
				method305(arg3 + 1, arg1, 128);
			}

			if (arg4 == 3) {
				method305(arg3, arg1, 32);
				method305(arg3, arg1 - 1, 2);
			}
		}

		if (arg0 == 1 || arg0 == 3) {
			if (arg4 == 0) {
				method305(arg3, arg1, 1);
				method305(arg3 - 1, arg1 + 1, 16);
			}

			if (arg4 == 1) {
				method305(arg3, arg1, 4);
				method305(arg3 + 1, arg1 + 1, 64);
			}

			if (arg4 == 2) {
				method305(arg3, arg1, 16);
				method305(arg3 + 1, arg1 - 1, 1);
			}

			if (arg4 == 3) {
				method305(arg3, arg1, 64);
				method305(arg3 - 1, arg1 - 1, 4);
			}
		}

		if (arg0 == 2) {
			if (arg4 == 0) {
				method305(arg3, arg1, 130);
				method305(arg3 - 1, arg1, 8);
				method305(arg3, arg1 + 1, 32);
			}

			if (arg4 == 1) {
				method305(arg3, arg1, 10);
				method305(arg3, arg1 + 1, 32);
				method305(arg3 + 1, arg1, 128);
			}

			if (arg4 == 2) {
				method305(arg3, arg1, 40);
				method305(arg3 + 1, arg1, 128);
				method305(arg3, arg1 - 1, 2);
			}

			if (arg4 == 3) {
				method305(arg3, arg1, 160);
				method305(arg3, arg1 - 1, 2);
				method305(arg3 - 1, arg1, 8);
			}
		}

		if (arg2) {
			if (arg0 == 0) {
				if (arg4 == 0) {
					method305(arg3, arg1, 0x10000);
					method305(arg3 - 1, arg1, 4096);
				}

				if (arg4 == 1) {
					method305(arg3, arg1, 1024);
					method305(arg3, arg1 + 1, 16384);
				}

				if (arg4 == 2) {
					method305(arg3, arg1, 4096);
					method305(arg3 + 1, arg1, 0x10000);
				}

				if (arg4 == 3) {
					method305(arg3, arg1, 16384);
					method305(arg3, arg1 - 1, 1024);
				}
			}

			if (arg0 == 1 || arg0 == 3) {
				if (arg4 == 0) {
					method305(arg3, arg1, 512);
					method305(arg3 - 1, arg1 + 1, 8192);
				}

				if (arg4 == 1) {
					method305(arg3, arg1, 2048);
					method305(arg3 + 1, arg1 + 1, 32768);
				}

				if (arg4 == 2) {
					method305(arg3, arg1, 8192);
					method305(arg3 + 1, arg1 - 1, 512);
				}

				if (arg4 == 3) {
					method305(arg3, arg1, 32768);
					method305(arg3 - 1, arg1 - 1, 2048);
				}
			}

			if (arg0 == 2) {
				if (arg4 == 0) {
					method305(arg3, arg1, 66560);
					method305(arg3 - 1, arg1, 4096);
					method305(arg3, arg1 + 1, 16384);
				}

				if (arg4 == 1) {
					method305(arg3, arg1, 5120);
					method305(arg3, arg1 + 1, 16384);
					method305(arg3 + 1, arg1, 0x10000);
				}

				if (arg4 == 2) {
					method305(arg3, arg1, 20480);
					method305(arg3 + 1, arg1, 0x10000);
					method305(arg3, arg1 - 1, 1024);
				}

				if (arg4 == 3) {
					method305(arg3, arg1, 81920);
					method305(arg3, arg1 - 1, 1024);
					method305(arg3 - 1, arg1, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("MPYOQJPZ.a(IIIIZII)V")
	public void method303(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg3) {
			var7 += 0x20000;
		}

		arg0 -= field791;
		arg4 -= field792;

		if (arg1 == 1 || arg1 == 3) {
			int var8 = arg5;
			arg5 = arg2;
			arg2 = var8;
		}

		for (int var9 = arg0; var9 < arg0 + arg5; var9++) {
			if (var9 >= 0 && var9 < field793) {
				for (int var10 = arg4; var10 < arg2 + arg4; var10++) {
					if (var10 >= 0 && var10 < field794) {
						method305(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("MPYOQJPZ.a(IIB)V")
	public void method304(int arg0, int arg1) {
		arg0 -= field791;
		arg1 -= field792;
		field795[arg0][arg1] |= 0x200000;
	}

	@ObfuscatedName("MPYOQJPZ.a(III)V")
	public void method305(int arg0, int arg1, int arg2) {
		field795[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("MPYOQJPZ.a(ZIIIII)V")
	public void method306(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
		arg1 -= field791;
		arg2 -= field792;
		if (arg3 == 0) {
			if (arg4 == 0) {
				method308(arg2, arg1, 128);
				method308(arg2, arg1 - 1, 8);
			}

			if (arg4 == 1) {
				method308(arg2, arg1, 2);
				method308(arg2 + 1, arg1, 32);
			}

			if (arg4 == 2) {
				method308(arg2, arg1, 8);
				method308(arg2, arg1 + 1, 128);
			}

			if (arg4 == 3) {
				method308(arg2, arg1, 32);
				method308(arg2 - 1, arg1, 2);
			}
		}

		if (arg3 == 1 || arg3 == 3) {
			if (arg4 == 0) {
				method308(arg2, arg1, 1);
				method308(arg2 + 1, arg1 - 1, 16);
			}

			if (arg4 == 1) {
				method308(arg2, arg1, 4);
				method308(arg2 + 1, arg1 + 1, 64);
			}

			if (arg4 == 2) {
				method308(arg2, arg1, 16);
				method308(arg2 - 1, arg1 + 1, 1);
			}

			if (arg4 == 3) {
				method308(arg2, arg1, 64);
				method308(arg2 - 1, arg1 - 1, 4);
			}
		}

		if (arg3 == 2) {
			if (arg4 == 0) {
				method308(arg2, arg1, 130);
				method308(arg2, arg1 - 1, 8);
				method308(arg2 + 1, arg1, 32);
			}

			if (arg4 == 1) {
				method308(arg2, arg1, 10);
				method308(arg2 + 1, arg1, 32);
				method308(arg2, arg1 + 1, 128);
			}

			if (arg4 == 2) {
				method308(arg2, arg1, 40);
				method308(arg2, arg1 + 1, 128);
				method308(arg2 - 1, arg1, 2);
			}

			if (arg4 == 3) {
				method308(arg2, arg1, 160);
				method308(arg2 - 1, arg1, 2);
				method308(arg2, arg1 - 1, 8);
			}
		}

		if (arg0) {
			if (arg3 == 0) {
				if (arg4 == 0) {
					method308(arg2, arg1, 0x10000);
					method308(arg2, arg1 - 1, 4096);
				}

				if (arg4 == 1) {
					method308(arg2, arg1, 1024);
					method308(arg2 + 1, arg1, 16384);
				}

				if (arg4 == 2) {
					method308(arg2, arg1, 4096);
					method308(arg2, arg1 + 1, 0x10000);
				}

				if (arg4 == 3) {
					method308(arg2, arg1, 16384);
					method308(arg2 - 1, arg1, 1024);
				}
			}

			if (arg3 == 1 || arg3 == 3) {
				if (arg4 == 0) {
					method308(arg2, arg1, 512);
					method308(arg2 + 1, arg1 - 1, 8192);
				}

				if (arg4 == 1) {
					method308(arg2, arg1, 2048);
					method308(arg2 + 1, arg1 + 1, 32768);
				}

				if (arg4 == 2) {
					method308(arg2, arg1, 8192);
					method308(arg2 - 1, arg1 + 1, 512);
				}

				if (arg4 == 3) {
					method308(arg2, arg1, 32768);
					method308(arg2 - 1, arg1 - 1, 2048);
				}
			}

			if (arg3 == 2) {
				if (arg4 == 0) {
					method308(arg2, arg1, 66560);
					method308(arg2, arg1 - 1, 4096);
					method308(arg2 + 1, arg1, 16384);
				}

				if (arg4 == 1) {
					method308(arg2, arg1, 5120);
					method308(arg2 + 1, arg1, 16384);
					method308(arg2, arg1 + 1, 0x10000);
				}

				if (arg4 == 2) {
					method308(arg2, arg1, 20480);
					method308(arg2, arg1 + 1, 0x10000);
					method308(arg2 - 1, arg1, 1024);
				}

				if (arg4 == 3) {
					method308(arg2, arg1, 81920);
					method308(arg2 - 1, arg1, 1024);
					method308(arg2, arg1 - 1, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("MPYOQJPZ.a(IZIIZII)V")
	public void method307(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg3) {
			var7 += 0x20000;
		}

		arg4 -= field791;
		arg1 -= field792;

		if (arg0 == 1 || arg0 == 3) {
			int var8 = arg5;
			arg5 = arg2;
			arg2 = var8;
		}

		for (int var9 = arg4; var9 < arg4 + arg5; var9++) {
			if (var9 >= 0 && var9 < field793) {
				for (int var10 = arg1; var10 < arg1 + arg2; var10++) {
					if (var10 >= 0 && var10 < field794) {
						method308(var10, var9, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("MPYOQJPZ.a(IIII)V")
	public void method308(int arg0, int arg1, int arg2) {
		field795[arg1][arg0] &= 0xFFFFFF - arg2;
	}

	@ObfuscatedName("MPYOQJPZ.b(III)V")
	public void method309(int arg0, int arg1) {
		arg1 -= field791;
		arg0 -= field792;
		field795[arg1][arg0] &= 0xDFFFFF;
	}

	@ObfuscatedName("MPYOQJPZ.a(IBIIIII)Z")
	public boolean method310(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg2 && arg3 == arg4) {
			return true;
		}

		arg2 -= field791;
		arg4 -= field792;
		arg0 -= field791;
		arg3 -= field792;
		if (arg5 == 0) {
			if (arg1 == 0) {
				if (arg0 - 1 == arg2 && arg3 == arg4) {
					return true;
				}

				if (arg0 == arg2 && arg3 + 1 == arg4 && (field795[arg2][arg4] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg3 - 1 == arg4 && (field795[arg2][arg4] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (arg0 == arg2 && arg3 + 1 == arg4) {
					return true;
				}

				if (arg0 - 1 == arg2 && arg3 == arg4 && (field795[arg2][arg4] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 + 1 == arg2 && arg3 == arg4 && (field795[arg2][arg4] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (arg0 + 1 == arg2 && arg3 == arg4) {
					return true;
				}

				if (arg0 == arg2 && arg3 + 1 == arg4 && (field795[arg2][arg4] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg3 - 1 == arg4 && (field795[arg2][arg4] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (arg0 == arg2 && arg3 - 1 == arg4) {
					return true;
				}

				if (arg0 - 1 == arg2 && arg3 == arg4 && (field795[arg2][arg4] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 + 1 == arg2 && arg3 == arg4 && (field795[arg2][arg4] & 0x1280180) == 0) {
					return true;
				}
			}
		}

		if (arg5 == 2) {
			if (arg1 == 0) {
				if (arg0 - 1 == arg2 && arg3 == arg4) {
					return true;
				}

				if (arg0 == arg2 && arg3 + 1 == arg4) {
					return true;
				}

				if (arg0 + 1 == arg2 && arg3 == arg4 && (field795[arg2][arg4] & 0x1280180) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg3 - 1 == arg4 && (field795[arg2][arg4] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (arg0 - 1 == arg2 && arg3 == arg4 && (field795[arg2][arg4] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg3 + 1 == arg4) {
					return true;
				}

				if (arg0 + 1 == arg2 && arg3 == arg4) {
					return true;
				}

				if (arg0 == arg2 && arg3 - 1 == arg4 && (field795[arg2][arg4] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (arg0 - 1 == arg2 && arg3 == arg4 && (field795[arg2][arg4] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg3 + 1 == arg4 && (field795[arg2][arg4] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 + 1 == arg2 && arg3 == arg4) {
					return true;
				}

				if (arg0 == arg2 && arg3 - 1 == arg4) {
					return true;
				}
			} else if (arg1 == 3) {
				if (arg0 - 1 == arg2 && arg3 == arg4) {
					return true;
				}

				if (arg0 == arg2 && arg3 + 1 == arg4 && (field795[arg2][arg4] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 + 1 == arg2 && arg3 == arg4 && (field795[arg2][arg4] & 0x1280180) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg3 - 1 == arg4) {
					return true;
				}
			}
		}

		if (arg5 == 9) {
			if (arg0 == arg2 && arg3 + 1 == arg4 && (field795[arg2][arg4] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg2 && arg3 - 1 == arg4 && (field795[arg2][arg4] & 0x2) == 0) {
				return true;
			}

			if (arg0 - 1 == arg2 && arg3 == arg4 && (field795[arg2][arg4] & 0x8) == 0) {
				return true;
			}

			if (arg0 + 1 == arg2 && arg3 == arg4 && (field795[arg2][arg4] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("MPYOQJPZ.a(IIIIIII)Z")
	public boolean method311(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg4 && arg3 == arg5) {
			return true;
		}

		arg0 -= field791;
		arg3 -= field792;
		arg4 -= field791;
		arg5 -= field792;
		if (arg2 == 6 || arg2 == 7) {
			if (arg2 == 7) {
				arg1 = arg1 + 2 & 0x3;
			}

			if (arg1 == 0) {
				if (arg4 + 1 == arg0 && arg3 == arg5 && (field795[arg0][arg3] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg5 - 1 == arg3 && (field795[arg0][arg3] & 0x2) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (arg4 - 1 == arg0 && arg3 == arg5 && (field795[arg0][arg3] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg5 - 1 == arg3 && (field795[arg0][arg3] & 0x2) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (arg4 - 1 == arg0 && arg3 == arg5 && (field795[arg0][arg3] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg5 + 1 == arg3 && (field795[arg0][arg3] & 0x20) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (arg4 + 1 == arg0 && arg3 == arg5 && (field795[arg0][arg3] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg5 + 1 == arg3 && (field795[arg0][arg3] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg2 == 8) {
			if (arg0 == arg4 && arg5 + 1 == arg3 && (field795[arg0][arg3] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg4 && arg5 - 1 == arg3 && (field795[arg0][arg3] & 0x2) == 0) {
				return true;
			}

			if (arg4 - 1 == arg0 && arg3 == arg5 && (field795[arg0][arg3] & 0x8) == 0) {
				return true;
			}

			if (arg4 + 1 == arg0 && arg3 == arg5 && (field795[arg0][arg3] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("MPYOQJPZ.a(BIIIIIII)Z")
	public boolean method312(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg4 + arg5 - 1;
		int var9 = arg3 + arg6 - 1;
		if (arg1 >= arg4 && arg1 <= var8 && arg0 >= arg6 && arg0 <= var9) {
			return true;
		}

		if (arg4 - 1 == arg1 && arg0 >= arg6 && arg0 <= var9 && (field795[arg1 - field791][arg0 - field792] & 0x8) == 0 && (arg2 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg1 && arg0 >= arg6 && arg0 <= var9 && (field795[arg1 - field791][arg0 - field792] & 0x80) == 0 && (arg2 & 0x2) == 0) {
			return true;
		}

		if (arg6 - 1 == arg0 && arg1 >= arg4 && arg1 <= var8 && (field795[arg1 - field791][arg0 - field792] & 0x2) == 0 && (arg2 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg0 && arg1 >= arg4 && arg1 <= var8 && (field795[arg1 - field791][arg0 - field792] & 0x20) == 0 && (arg2 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
